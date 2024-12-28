# Movie-Rating-and-Recommendation-System
A Java-based project implementing SOLID principles to manage movies, users, and ratings. Features include user movie ratings, personalized recommendations, and admin controls. Built with a modular design using Maven, the system ensures scalability, clean architecture, and an interactive console interface


# Movie Rating and Recommendation System

This project implements a **Movie Rating and Recommendation System** where users can rate movies, and the system provides movie recommendations based on their preferences. The system follows **SOLID principles** for maintainable and scalable code.

## Features
1. **Movie Rating System**
   - Users can rate movies on a scale.
2. **Movie Recommendation**
   - Recommends movies based on user ratings and preferences.
3. **Admin Features**
   - Allows managing movie records.
4. **User Accounts**
   - Users can create accounts and interact with the system.

---

## Folder Structure

```
MovieRecommendationSystem/
├── src/
│   ├── com/
│   │   ├── movierating/
│   │   │   ├── model/
│   │   │   │   ├── Movie.java
│   │   │   │   ├── User.java
│   │   │   │   └── Rating.java
│   │   │   ├── repository/
│   │   │   │   ├── IMovieRepository.java
│   │   │   │   ├── IUserRepository.java
│   │   │   │   └── RatingRepository.java
│   │   │   ├── service/
│   │   │   │   ├── IMovieService.java
│   │   │   │   ├── IUserService.java
│   │   │   │   ├── MovieService.java
│   │   │   │   └── UserService.java
│   │   │   ├── ui/
│   │   │   │   └── ConsoleUI.java
│   │   │   └── Main.java
├── pom.xml
└── README.md
```

---

## Prerequisites

- **Java Development Kit (JDK) 8 or later**
- **Maven** for dependency management
- **IntelliJ IDEA** or any preferred Java IDE

---

## Installation

1. **Clone the Repository:**
   ```bash
   git clone https://github.com/username/movie-recommendation-system.git
   cd movie-recommendation-system
   ```

2. **Open in IntelliJ IDEA:**
   - Import the project as a Maven project.

3. **Install Dependencies:**
   ```bash
   mvn install
   ```

4. **Run the Application:**
   - Execute `Main.java` from the IDE or use the following Maven command:
     ```bash
     mvn exec:java -Dexec.mainClass="com.movierating.Main"
     ```

---

## Code Structure and Design Principles

### SOLID Principles Applied:

1. **Single Responsibility Principle (SRP):**
   - Each class has one responsibility, such as `Movie` for movie data and `UserService` for user-related logic.
2. **Open/Closed Principle (OCP):**
   - Interfaces like `IMovieService` allow extension without modifying existing code.
3. **Liskov Substitution Principle (LSP):**
   - Concrete implementations can replace abstractions without breaking functionality.
4. **Interface Segregation Principle (ISP):**
   - Separate interfaces (`IMovieRepository`, `IUserRepository`) for movie and user management.
5. **Dependency Inversion Principle (DIP):**
   - High-level modules depend on abstractions (`IMovieRepository`), not concrete classes.

### Key Classes:

- **Model Layer:**
  - `Movie.java`, `User.java`, `Rating.java`
  - Represent the core entities in the system.

- **Repository Layer:**
  - Interfaces: `IMovieRepository`, `IUserRepository`
  - Implementations handle data storage and retrieval logic.

- **Service Layer:**
  - Interfaces: `IMovieService`, `IUserService`
  - Implementations (`MovieService`, `UserService`) contain business logic.

- **UI Layer:**
  - `ConsoleUI.java`: Handles user interaction through the console.

---

## Example Usage

1. **Add a Movie:**
   - Enter movie details like title, genre, and director.

2. **List Movies by Genre:**
   - Get a list of movies filtered by a specific genre.

3. **Rate Movies:**
   - Rate movies and retrieve the list of ratings for a movie.

4. **Get Recommendations:**
   - View movie recommendations based on ratings.

---

## Future Improvements

1. **Database Integration:**
   - Replace in-memory data storage with a database like MySQL or PostgreSQL.

2. **Web Interface:**
   - Create a web-based interface for better usability.

3. **Advanced Recommendations:**
   - Use collaborative filtering or machine learning algorithms for recommendations.

4. **Testing:**
   - Add unit and integration tests using JUnit.

---

## Dependencies

Add the following dependencies to `pom.xml` if needed:

```xml
<dependencies>
    <!-- Add dependencies here -->
</dependencies>
```

---

## Contribution

Feel free to fork this repository and contribute! Open issues and pull requests are welcome.


