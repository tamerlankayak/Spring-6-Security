# Spring 6 Security Code

This repository contains an example Spring 6 project that demonstrates how to implement security features using Spring Security.

## Getting Started

To get started with this project, follow these steps:

1. Clone the repository to your local machine using `git clone https://github.com/tamerlankayak/Spring-6-Security.git`.
2. Install the necessary dependencies by running `mvn install`.
3. Start the application by running `mvn spring-boot:run`.
4. Navigate to `http://localhost:8080` to view the application in your browser.

## Features

This project includes the following security features:

- User authentication and authorization using Spring Security.
- Password hashing and storage using BCrypt.
- Custom user details service to load user information from a database.
- CSRF protection to prevent cross-site request forgery attacks.
- Session management to control user sessions and timeouts.

## Configuration

The following configuration files are included in this project:

- `application.properties`: Contains application properties, including the database connection details and server port number.
- `SecurityConfig.java`: Contains Spring Security configuration, including authentication and authorization rules, password hashing, and session management.
- `UserDetailsServiceImpl.java`: Contains a custom implementation of the Spring `UserDetailsService` interface to load user information from a database.

## Contributing

If you would like to contribute to this project, feel free to open an issue or submit a pull request. We welcome any feedback or suggestions for improvement.

## License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.

## Acknowledgments

This project was inspired by the official Spring Security documentation and the Spring Boot documentation. Thanks to the Spring community for their contributions and support.


New Spring 6 Security wuth advanced examples.

Used technologies:

OAuth2

JWT

Spring Boot Security

You can run app and generate JWT token.

Java version: 17

![Java_programming_language_logo svg](https://user-images.githubusercontent.com/29164777/227792056-ee3e20ca-0912-4292-bf5e-90a7b447231b.png)
![spring-boot-logo](https://user-images.githubusercontent.com/29164777/227792072-7a033134-4c34-4560-8277-a8a9278bd6ca.png)
