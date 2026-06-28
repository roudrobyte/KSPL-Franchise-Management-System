# KSPL Franchise Management System 

A Java-based object-oriented simulation for managing team rosters and budgets, inspired by the Koradi Super Premier League (KSPL).

## Project Overview

This project demonstrates core Object-Oriented Programming (OOP) principles in Java, focusing on dynamic array management, state tracking, and logical constraint validation. It simulates a backend franchise manager that handles player recruitment and team budgeting.

## The 1-2-3 Core Logic

The `signPlayer` method is the heart of the application. It processes player signings by validating conditions in a strict, fail-fast sequence:

1. **Roster Space Validation:** Checks the dynamic array capacity to ensure the team hasn't exceeded its maximum squad limit.
2. **Jersey Conflict Resolution:** Iterates through the current roster to guarantee the requested jersey number is unique and available.
3. **Financial Feasibility:** Verifies that the player's signing cost does not exceed the franchise's remaining budget.

Only when all three of these checks pass is the player added to the arrays and the budget dynamically updated.

## Code Structure

* `Franchise.java`
  * The core model class. Contains the object state (budget, squad limits, player name arrays, jersey number arrays) and the conditional logic for validating and executing player signings.
* `Franchise_tester.java`
  * The driver code. Contains the main method, instantiates multiple franchise objects, and runs specific execution scenarios to test the validation constraints and output formatting.

## Installation & Execution

1. Clone this repository to your local machine.
2. Open your terminal and navigate to the project directory.
3. Compile the Java files:
   `javac Franchise_tester.java Franchise.java`
4. Run the driver class:
   `java Franchise_tester`

## Author

**Roudrobyte**
* System Logic & Backend Development

---
*Built to practice foundational logic building, array traversal, and state management in Java.*
