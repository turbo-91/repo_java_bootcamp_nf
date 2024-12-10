* **Find a free REST/HTTP API (that has not been mentioned in the course) and post its link here.**
  - Public APIs: A directory of free and public APIs across various categories, including movies, weather, music, and more.

* **When accessing the path '/api/employees/4711', you receive the HTTP status code '404 Not Found' in the response. What conclusions do you draw from this / what could be the cause?**
  - When accessing the path `/api/employees/4711` and receiving a 404 Not Found status code, it indicates that the server could not find the requested resource.
    - **Non-existent Resource**: There is no employee with the ID `4711` in the database.
    - **Incorrect URL**: The URL path might be incorrect due to a typo or misconfiguration.
    - **Routing Issue**: The server's routing configuration may not handle the `/api/employees/4711` path correctly.

* **Provide the link to the currently valid RFC documentation of HTTP - the official specification of HTTP.**
  - [RFC 9110: HTTP Semantics](https://www.rfc-editor.org/rfc/rfc9110.html)

* **Briefly describe the difference between 'PUT' and 'POST' requests.**
  - **PUT**: Used to create or replace a resource at a specific URI. It is idempotent, meaning multiple identical requests should have the same effect as a single request.
  - **POST**: Used to submit data to the server, often resulting in the creation of a new resource. It is not idempotent; multiple identical requests may result in multiple resources being created.

* **What HTTP status code should an API return if a 'POST' request was successful?**
  - **201 Created**: Indicates that the request has succeeded and a new resource has been created as a result.

* **What are some well-known alternatives to the JSON data format?**
  - **XML (eXtensible Markup Language)**: A flexible, structured data format widely used in web services.
  - **YAML (YAML Ain't Markup Language)**: A human-readable data serialization format often used for configuration files.
  - **Protocol Buffers**: A language-neutral, platform-neutral extensible mechanism for serializing structured data, developed by Google.
  - **MessagePack**: An efficient binary serialization format that enables data exchange among multiple languages.
  - **CBOR (Concise Binary Object Representation)**: A binary data serialization format designed for small code size and message size.
 
  ** -------- **
 
* **Coding: Rick&Morty API**
* **get all characters**
  - there are 826 character on 42 pages
    
  - these informations are present per character:
  - ID: A unique identifier for the character.
  - Name: The name of the character.
  - Status: The current status of the character (e.g., "Alive," "Dead," or "unknown").
  - Species: The species of the character (e.g., "Human," "Alien").
  - Type: Additional details about the character's type, if applicable (e.g., "Superhuman," "Genetic experiment").
  - Gender: The gender of the character (e.g., "Male," "Female," "unknown").
  - Origin:
  - Name: The name of the character's place of origin.URL: A link to the API endpoint for the character's origin location.
  - Location:
  - Name: The name of the character's current location.
  - URL: A link to the API endpoint for the character's current location.
  - Image: A URL to an image representing the character.
  - Episode: A list of URLs to API endpoints for episodes in which the character appears.
  - URL: The URL to the character's detailed API endpoint.
  - Created: The timestamp indicating when this character's data was created in the database.
    
* **439 alive**
  
* **126 locations**
  
* **location info structure**
*Hierarchical Structure*
- Each location is a standalone object within the results array.
- residents links characters to their respective locations.
  
*Rich Metadata*
The type and dimension fields provide descriptive context for each location.

*Interlinking*
The API uses URLs (e.g., residents and url) to connect locations and characters, enabling a relational data model.

* **51 episodes**
  
* **Lisas id: 204**



