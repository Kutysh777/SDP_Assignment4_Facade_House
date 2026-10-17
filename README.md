# Assignment 4 Facade Pattern

## About My Project

In this project, I used the Facade pattern with house construction. My four subsystem classes are Foundation, Walls, Roof, and HouseInspection.

Main uses only HouseFacade. One call to buildHouse() starts the whole process. The facade calls the subsystem methods in the correct order.

This is a Java console model. The program stores progress, checks the building order, and prints messages.

## Project Structure

```text
SDP_Assignment4_Facade_House
|-- README.md
|-- .gitignore
|-- src
    |-- Foundation.java
    |-- Walls.java
    |-- Roof.java
    |-- HouseInspection.java
    |-- HouseFacade.java
    |-- Main.java
```

## Facade Components

| Role | Class | What It Does |
| --- | --- | --- |
| Subsystem | Foundation | Builds and dries the foundation. It checks that building comes before drying. |
| Subsystem | Walls | Checks the foundation and counts four completed walls. |
| Subsystem | Roof | Checks the walls before building and stores its progress. |
| Subsystem | HouseInspection | Checks that the foundation, walls, and roof are all ready. |
| Facade | HouseFacade | Creates the objects and coordinates their work. |
| Client | Main | Creates and calls only HouseFacade. |

## How It Works

The facade follows five steps:

1. Build the foundation.
2. Dry the foundation.
3. Build four walls.
4. Build the roof.
5. Check the house.

Walls uses Foundation to check if building can start. Roof uses Walls to check if the walls are ready. HouseInspection checks all three parts.

Construction and inspection methods return a boolean result. True means the step succeeded. False means it could not finish. If a step returns false, HouseFacade stops and returns false to Main. Main then prints "Cannot build the house".

For example, walls cannot be built before the foundation is ready. An unfinished house cannot pass inspection. Calling buildHouse() twice on the same facade returns false on the second call because the foundation is already built. Completed steps keep their progress if a later step fails.

The subsystem classes do not know about HouseFacade. Their public methods also let an advanced client use them directly. The facade keeps its subsystem objects private and returns only the final boolean result.

## Clean Code Principles

1. **Meaningful Names:** I used clear names such as buildHouse(), dry(), and isReady(). They explain the actions and checks.
2. **Single Responsibility:** Each subsystem handles its own part of the house. HouseFacade coordinates the work, and Main shows the result.
3. **Least Knowledge:** Main only uses HouseFacade. It does not create or call the four subsystem classes.
4. **Small Methods:** Each method has a clear job. For example, Foundation has separate methods for building and drying.
5. **Simple Error Handling:** Methods return false when a step is not allowed. The facade stops at that point, and Main prints a failure message.

## How to Run

Use JDK 8 or later. Open a terminal in the project folder and run:

```text
javac -d out src/*.java
java -cp out Main
```

In IntelliJ IDEA, open the project folder and select a JDK. If needed, mark src as Sources Root. Then run Main.java.

## Expected Output

```text
Foundation built
Foundation dried
Wall 1 built
Wall 2 built
Wall 3 built
Wall 4 built
Roof built
House inspection passed
House ready
```

## Short Explanation for Defense

Facade gives a simple interface to a complex subsystem. HouseFacade coordinates four classes in the correct order. Main calls only buildHouse(). The subsystem classes check their own rules and can also work without the facade.
