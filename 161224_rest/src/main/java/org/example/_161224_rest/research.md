Research and discuss together to answer the following questions.

***

What are the advantages of making API calls to external APIs from the backend instead of the frontend?

Making API calls from the backend enhances security by keeping API keys and sensitive 
credentials hidden while allowing centralized data validation and caching. It also 
improves performance by aggregating multiple requests and preventing CORS issues.

***

What challenges do you see when testing your application that uses external APIs with the RestClient?

Testing with external APIs can be unreliable due to network dependency, rate limits, 
or downtime, leading to inconsistent results. Mocking responses to simulate external 
APIs can also be complex and time-consuming.

***

Design a class structure to represent the response of the Product API with all properties. 

```java
 public class Product {
    private int id;
    private String title;
    private String description;
    private double price;
    private double discountPercentage;
    private double rating;
    private int stock;
    private String brand;
    private String category;
    private String thumbnail;
    private List<String> images;

    // Getters and Setters
    // Constructors and toString() method
}
```