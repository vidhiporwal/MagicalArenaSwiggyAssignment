# Magical Arena Game

## Introduction
This project simulates a magical arena where players with health, strength, and attack attributes engage in battles until one player's health reaches zero.

## Getting Started
Follow these steps to set up and run the Magical Arena Game.

### Prerequisites
- Java 8 or higher installed
- Maven installed (for building and running tests)
- IDE (Integrated Development Environment) like IntelliJ IDEA, Eclipse, or any text editor

### Installation

1. **Extract the ZIP File:**

   - Download the ZIP file from the repository.
   - Extract the contents to a directory on your local machine.

2. **Import Project into IDE:**

   - **IntelliJ IDEA:**
     - Open IntelliJ IDEA.
     - Select `File` -> `Open` and navigate to the extracted directory (`magical-arena`).
     - Select the `pom.xml` file and click `Open` to import the project as a Maven project.

   - **Eclipse:**
     - Open Eclipse.
     - Select `File` -> `Import`.
     - Expand the `Maven` folder and choose `Existing Maven Projects`.
     - Click `Next`, then browse to the extracted directory (`magical-arena`) and click `Finish` to import the project.

### Running the Application

After successfully importing and setting up the project, you can run the Magical Arena Game in two ways:

#### 1. Using the Main Function

- Navigate to the `Main` class in your IDE.
- Run the `Main` class to start the game.
- Follow the console prompts to enter details for Player A and Player B.

#### 2. Using Spring Boot Application (Endpoints)

- Navigate to the `MagicalArenaApplication` class in your IDE.
- Run the `MagicalArenaApplication` class as a Spring Boot Application.
- Use a web browser or a tool like Postman to access the following endpoint:
  - `http://localhost:8080/startGame?healthA=<value>&strengthA=<value>&attackA=<value>&healthB=<value>&strengthB=<value>&attackB=<value>`
  - Replace `<value>` with the desired values for Player A and Player B's health, strength, and attack attributes.

### Example

1. **Run through Main Function:**
   - After starting the `Main` class, enter details when prompted:
     ```
     Enter details for Player A:
     Enter health for Player A: 70
     Enter strength for Player A: 6
     Enter attack for Player A: 6

     Enter details for Player B:
     Enter health for Player B: 80
     Enter strength for Player B: 0
     Enter attack for Player B: 8

     Game Result:
     Player B wins!
     ```

2. **Run through Endpoints:**
   - Start the Spring Boot application (`MagicalArenaApplication`).
   - Access the endpoint with values directly in the URL:
     - Example: `http://localhost:8080/startGame?healthA=70&strengthA=6&attackA=6&healthB=80&strengthB=0&attackB=8`
     - Example output:
       ```
       Player B attacks Player B: attack roll = 4, defense roll = 3, damage dealt = 268, defender health = -218
       Player B attacks Player B: attack roll = 4, defense roll = 5, damage dealt = 24, defender health = 56
       Player B attacks Player B: attack roll = 1, defense roll = 5, damage dealt = 0, defender health = 70
       Player B attacks Player B: attack roll = 6, defense roll = 1, damage dealt = 42, defender health = 28
       Player B attacks Player B: attack roll = 6, defense roll = 1, damage dealt = 36, defender health = 20
       Player B attacks Player B: attack roll = 3, defense roll = 4, damage dealt = 0, defender health = 28
       Player B attacks Player B: attack roll = 6, defense roll = 1, damage dealt = 42, defender health = -14
       Player B wins!
       ```

### Tests

- **Run Unit Tests:**
  - Execute unit tests using Maven:
    ```bash
    mvn test
    ```
  - Ensure all tests pass successfully.

