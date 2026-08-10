# Movie Streaming Platform — Encapsulation

## Problem Statement

This problem is based on a **CodeTantra** programming exercise on **Encapsulation in Java**.

CineStream is a movie streaming platform that needs to securely store and manage users' movie-watching statistics. Since these statistics should not be directly accessed or modified from outside the class, the platform requires the use of encapsulation to protect the data.

The task is to create a `UserWatchStats` class where all user statistics are kept private and can only be accessed or modified through appropriate getters and validated setters.

The class maintains information such as the total amount of time a user has watched movies, the number of movies completed, the number of times content was paused, and the number of fast-forward attempts.

The setters must validate incoming values and reject invalid updates. Negative values are not allowed. The number of movies watched cannot increase by more than five in a single update, as this may indicate bot activity. Similarly, the total watch time cannot increase by more than 240 minutes in one update, following CineStream's four-hour-per-day rule.

The class must also provide a method to calculate an Activity Score based on the user's watching statistics. The score is calculated using integer arithmetic and must be restricted to a range of 0 to 500.

Finally, an `isHighEngagement()` method determines whether the user has a high level of engagement by checking whether their Activity Score is at least 250.

The problem demonstrates how Java encapsulation can be used to protect data, control modifications, apply validation rules, and expose only the required functionality through public methods.

## Source

CodeTantra — Java Programming / Object-Oriented Programming
Topic: Encapsulation

## Concepts Covered

* Encapsulation
* Private data members
* Getters and setters
* Data validation
* Constructors
* Final classes
* Method-based data access
* Integer arithmetic
* Derived values
