# Country Database Project

## Overview

This project demonstrates how to access a database of countries. It is the starting source code for Lab 5 Part 2, where you will extend the application to include language information for each country.

For details, objectives, and instructions for Lab 5 Part 2, please refer to [LabInstruction.md](LabInstruction.md).

## Structure

The project consists of the following components located in the `edu.pcc.cis233j.countries` package:

- `Country.java`: Defines the `Country` class, representing a country with its attributes.
    - **Attributes**:
        - `id`: The unique identifier for the country.
        - `name`: The name of the country.
        - `population`: The population of the country.
        - `medianAge`: The median age of the population in the country.
        - `coastlineKm`: The length of the coastline in kilometers.

- `CountryDB.java`: Contains methods to interact with the country database.
    - **Methods**:
        - `CountryDB()`: Constructor that reads from the database and populates the countries list.
        - `getCountries()`: Returns the list of countries read from the database.
        - `getConnection()`: Establishes and returns a connection to the database.
        - `readCountries()`: Reads country information from the database and returns a list of country objects.

- `Main.java`: The entry point of the application.
    - **Main Method**:
        - Initializes the `CountryDB` object.
        - Fetches and displays information about countries.
        - Prints the details of the first country in the list.

- `build.gradle`: The build configuration file at the root of the project, which includes the necessary dependencies, including the JDBC jTDS driver (`jtds:1.3.1`) for connecting to the SQL Server database.

## Microsoft SQL Server Database

This project relies on the JDBC jTDS driver to facilitate the connection and access the Microsoft SQL Server database. The driver enables seamless interaction with the SQL Server, allowing the application to retrieve and manipulate data stored in the database.

### Database Tables

The database contains the following tables:

- **country**
    - `id`: The unique identifier for the country.
    - `name`: The name of the country.
    - `population`: The population of the country.
    - `medianAge`: The median age of the population in the country.
    - `coastlineKm`: The length of the coastline in kilometers.

- **language**
    - `countryId`: The identifier for the country associated with the language.
    - `language`: The name of the language.

## Usage

To use this project, clone the repository to your local machine, open it in IntelliJ IDEA, and ensure that the `jtds:1.3.1` dependency is included in your `build.gradle` file. Then run the `Main.java` file in the `edu.pcc.cis233j.countries` package as a Java application. Detailed setup and usage instructions will be provided in [LabInstruction.md](LabInstruction.md).
