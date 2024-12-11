package org.example._111224_springannotations;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class HelloWorldController {

    @GetMapping("/hello")
    public String helloWorld() {
        return "Hello, World!";
    }

    @GetMapping("/hello/{name}")
    public String helloWorld(@PathVariable String name) {
        return "Hello, " + name + "!";
    }
}

