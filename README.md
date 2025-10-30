# SpringBoot_Lesson1_Sample2

## Propmt for the Code Agent (Codex, Gemini Code Assistant or Copilot)

**Context**:

You are an expert Spring developer. We are now refactoring the previous application to use the core Spring Framework for Dependency Injection.

The goal is to let the Spring IoC container manage the `MessageService` and inject it into the `MainApplication`.

**Task**:

Modify the previous Maven project to use the Spring Framework.

**Constraints**:

- Java 17

- Use Spring Framework 6.x (`spring-context` dependency).

- Use annotation-based configuration.

**Steps**:

1.  Update the `pom.xml` to add the `spring-context` dependency.

2.  Annotate the `MessageService` class with `@Component` to make it a Spring bean.

3.  Create a configuration class `AppConfig.java` annotated with `@Configuration` and `@ComponentScan("com.example.demo")`.

4.  Modify `MainApplication.java`:

    - In the `main` method, create an `AnnotationConfigApplicationContext`, passing `AppConfig.class` to its constructor. This will start the Spring container.

    - Use the context to get the `MessageService` bean (e.g., `context.getBean(MessageService.class)`).

    - Print the message from the service to the console.

5.  Provide the `mvn` command to run the refactored application.

**Deliverables**:

- Updated `pom.xml`

- `src/main/java/com/example/demo/MessageService.java` (with `@Component`)

- `src/main/java/com/example/demo/AppConfig.java` (new file)

- Updated `src/main/java/com/example/demo/MainApplication.java`

- The `mvn` command to execute the application.

**Acceptance Criteria (Part 2)**:

•	The project compiles successfully.

•	Running the main method prints "Hello, world!" to the console.

•	The MainApplication class no longer uses the new keyword to create MessageService. It gets the instance from the Spring ApplicationContext.

•	MessageService is marked with the @Component annotation.
