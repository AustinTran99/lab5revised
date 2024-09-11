# Lab 5 Part 2 Instructions

## Description

In this lab, you will extend the existing Country Database Project to include language information for each country. The project demonstrates how to access a database of countries using Java. You will update the Java application to handle the new table and implement functionality to display languages spoken in each country.

## Objectives

- Understand working with tables in a database, including setting up queries (with parameterization), establishing connections, executing queries, and processing returned results in Java.
- Learn the exception process in Java, including try statements with or without the resource part of the database access.
- Implement functionality to display languages spoken in each country.
- Open a pull request to submit your completed work.

## Important Notes

- **Coding and Design:**
    - Use good coding style and design, and follow standard Java conventions.
    - Document your changes, update or add Javadoc to methods and classes you implement or modify, and make sure each method has a comment header that correctly describes its behavior.
    - For any changed classes, ensure your name is in the `@author` list and update the version.

- **Commit Often:**
    - As you make progress on each part of the lab, commit your changes to your local repository. This practice helps to keep track of your changes and makes it easier to revert to a previous state if needed. Use meaningful commit messages to describe what you have done.

- **Academic Integrity:**
    - Submit your own work and ensure you understand what you have implemented.
    - You and your classmate(s) can study together on concepts or ideas, but do not share your code (even after the due date) or post your solution online for future students to download.
    - Violations of academic integrity will result in serious consequences as outlined by Portland Community College's policies.
    - If you need help, seek assistance in the discussion area or email your instructor. It is better to ask for help than to copy someone else's work.

- **Testing:**
    - Test your code as you go.

## Instructions

1. **Setup and Initial Run**

    - **Clone the Repository from GitHub Classroom**
        - On the repository home page, click the green "Code" button to open the clone options.
        - Copy the URL provided under the "Clone with HTTPS" section by either clicking the clipboard icon or manually copying the URL from the textbox.
        - Once the repository is created, clone it to your local machine using the following command:
          ```sh
          git clone <Your-GitHub-Classroom-Repository-URL>
          ```

    - **Open the Cloned Repository in IntelliJ IDEA**
        - Open IntelliJ IDEA.
        - In IntelliJ IDEA, select `File` > `Open` and navigate to the cloned repository directory. Click `Open`.

    - **Check for the JDBC Driver Dependency**
        - Open the `build.gradle.kts` file and ensure the following dependency is included:
          ```gradle
          dependencies {
              // https://mvnrepository.com/artifact/net.sourceforge.jtds/jtds
              implementation("net.sourceforge.jtds:jtds:1.3.1")
              testImplementation(platform("org.junit:junit-bom:5.9.1"))
              testImplementation("org.junit.jupiter:junit-jupiter")
          }
          ```
        - Ensure the `implementation("net.sourceforge.jtds:jtds:1.3.1")` line is present to include the necessary JDBC driver.

    - **Run the Application to Understand Its Current Functionality**
        - Run the program by navigating to `Main.java` in the `edu.pcc.cis233j.countries` package, right-clicking on the file, and selecting `Run 'Main.main()'`.
        - Observe the current behavior: The program reads the basic country information from the `COUNTRY` table of the database and prints information on the first country only.

2. **Update the Main Class**
    - Modify the `Main` class so that it prints information on all the countries, not just the first one.

3. **Update the Project to Include Languages**

    - **Understand the Database Relationship**
        - The tables `COUNTRY` and `COUNTRY_LANGUAGE` have a 1:M (one-to-many) relationship. One country can have many languages. For example, the country Canada has languages English and French. The `CountryId` column in `COUNTRY_LANGUAGE` is a foreign key to the `COUNTRY` table.

    - **Country Database ERD**
      
      ```
      +----------------------+         +------------------------+
      |      COUNTRY         |         |        LANGUAGE        |
      +----------------------+         +------------------------+
      | id (INT, PK)         | 1     M | countryId (INT, FK)    |
      | name (VARCHAR)       |<------->| language (VARCHAR)     |
      | population (BIGINT)  |         +------------------------+
      | medianAge (DECIMAL)  |
      | coastlineKm (BIGINT) |
      +----------------------+
      ```

    - **Update the Country Class**
        - Add a field for the list of languages.
        - Add a getter for the list of languages.
        - Add a method to add a language to the collection (e.g., `addLanguage(String language)`).

    - **Update CountryDB**
        - Read the languages from the database and associate them with the respective countries.

    - **Update Main to Print Languages**
        - Modify the `Main` class to print the languages for each country along with the other information.

   **Hint:** This project parallels the project used in the JDBC Tutorial. The last part of the tutorial shows how to implement code to read email addresses for each customer. You can do something similar to read languages for each country.

4. **Open a Pull Request**:
    - Navigate to your repository on GitHub.
    - Click on the "Pull requests" tab.
    - Click the "New pull request" button.
    - Select the branch you worked on, then click the "Create pull request" button.
    - Add a meaningful title and description to your pull request.
    - Click the "Create pull request" button to submit your work for review.

## Submission

- Ensure all your code changes are committed and pushed to your repository.
- Follow the instructions in the "Open a Pull Request" section to submit your completed work.
