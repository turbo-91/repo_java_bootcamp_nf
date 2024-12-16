package org.example._121224_asterisk;

public class research {
}

// RESEARCH 16-12-24

// What are the main differences between an integration test and a unit test?
// Unit tests focus on testing individual components in isolation, while integration tests validate the interaction
// between multiple components or systems.

// _______________________________________________

// How can you use MockMvc to verify that the HTTP status of a request is 403?
// Use mockMvc.perform(request).andExpect(status().isForbidden()); to verify that the HTTP status of a request is 403.

// _______________________________________________

// How can you expect a JSON in the response body using MockMvc:
//That has the property "name" with the value "Max"
//That has the property "age" with the value 10?

// Use mockMvc.perform(request).andExpect(jsonPath("$.name").value("Max")).andExpect(jsonPath("$.age").value(10)); to
// assert JSON properties with specified values in the response body.

// RESEARCH 13-12-24

// What is a mock, and why is mocking important in software development?
// A mock is a simulated object that mimics the behavior of real objects in controlled ways, allowing developers to
// isolate and test specific parts of the application. Mocking is important because it ensures tests are faster, more
// reliable, and independent of external dependencies like databases or APIs. For example, mocking is used to simulate
// an unavailable API or to test how code handles specific error scenarios without triggering the real service.
//
// What other mocking frameworks are there besides Mockito?
// In addition to Mockito, popular mocking frameworks include JUnit 5 Mock Framework, PowerMock (for advanced use cases
// with Mockito), and EasyMock for Java. For other languages, frameworks like Jest and Sinon.js are common in
// JavaScript, and unittest.mock is used in Python.
//
// Why should the class being tested not be mocked in unit tests?
// The class being tested should not be mocked because the purpose of a unit test is to validate the actual behavior and
// logic of that class. Mocking it would lead to tests that don’t verify real functionality, creating a false sense of
// correctness. Problems include missed bugs, unreliable tests, and an inability to ensure that the class integrates
// correctly with other components.
