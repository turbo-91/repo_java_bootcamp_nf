package com.example.chatgptbasedcookingingredients;


import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestClient;

import java.util.Collections;
import java.util.List;

@RestController
@RequestMapping("/ingredients")
public class IngredientController {

    private final RestClient restClient;

    public IngredientController(@Value("${app.openai-api-key}") String openaiApiKey) {
        this.restClient = RestClient.builder()
                .baseUrl("https://api.openai.com/v1/chat/completions")
                .defaultHeader("Authorization", "Bearer " + openaiApiKey)
                .build();
    }

    @PostMapping
    public String categorizeIngredient(@RequestBody String ingredient) {
        ChatGPTResponse response = restClient.post()
                .body(new ChatGPTRequest("Categorize the following ingredient as 'vegan', 'vegetarian', or 'regular': " + ingredient))
                .retrieve()
                .body(ChatGPTResponse.class);

        return response.text();
    }
}

record ChatGPTRequestMessage(
        String role,
        String content
) {
}

record ChatGPTMessage(
        String role,
        String content
) {
}

record ChatGPTRequest(
        String model,
        List<ChatGPTRequestMessage> messages
) {
    ChatGPTRequest(String message) {
        this("gpt-4o-mini", Collections.singletonList(new ChatGPTRequestMessage("user", message)));
    }
}

record ChatGPTChoice(
        ChatGPTMessage message
) {
}

record ChatGPTResponse(
        List<ChatGPTChoice> choices
) {
    public String text() {
        return choices.get(0).message().content();
    }
}

