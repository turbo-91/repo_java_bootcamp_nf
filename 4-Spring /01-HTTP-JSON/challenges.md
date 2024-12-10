* Find a free REST/HTTP API (that has not been mentioned in the course) and post its link here.
-> Public APIs: A directory of free and public APIs across various categories, including movies, weather, music, and more.


* When accessing the path '/api/employees/4711', you receive the HTTP status code '404 Not Found' in the response. What conclusions do you draw from this / what could be the cause?
-> When accessing the path /api/employees/4711 and receiving a 404 Not Found status code, it indicates that the server could not find the requested resource.
  Possible reasons include:
  Non-existent Resource: There is no employee with the ID 4711 in the database.
  Incorrect URL: The URL path might be incorrect due to a typo or misconfiguration.
  Routing Issue: The server's routing configuration may not handle the /api/employees/4711 path correctly.


* Provide the link to the currently valid RFC documentation of HTTP - the official specification of HTTP.
-> https://www.rfc-editor.org/rfc/rfc9110.html

 
* Briefly describe the difference between 'PUT' and 'POST' requests.
-> PUT: Used to create or replace a resource at a specific URI. It is idempotent, meaning multiple identical requests should have the same effect as a single request.
  POST: Used to submit data to the server, often resulting in the creation of a new resource. It is not idempotent; multiple identical requests may result in multiple resources being
  created.

 
* What HTTP status code should an API return if a 'POST' request was successful?
-> 201 Created: Indicates that the request has succeeded and a new resource has been created as a result.


* What are some well-known alternatives to the JSON data format?
XML (eXtensible Markup Language): A flexible, structured data format widely used in web services.
YAML (YAML Ain't Markup Language): A human-readable data serialization format often used for configuration files.
Protocol Buffers: A language-neutral, platform-neutral extensible mechanism for serializing structured data, developed by Google.
MessagePack: An efficient binary serialization format that enables data exchange among multiple languages.
CBOR (Concise Binary Object Representation): A binary data serialization format designed for small code size and message size.
