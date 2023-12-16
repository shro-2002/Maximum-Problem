# Maximum Finder Project

This Java-based project tackles the "Find Maximum Problem using Generics." It provides a comprehensive solution for determining the maximum value among different data types using generic methods and classes. The project includes various use cases, thorough testing, and systematic refactoring to ensure code flexibility and efficiency.

## Project Overview

The main goals of the project are as follows:

1. **Test Maximum:**
   - Implementation of generic methods to find the maximum value.
   - Rigorous testing of the code with different data types and scenarios.

2. **Test Maximum of 3 Variables:**
   - Creation of test cases to validate the maximum number at the 1st, 2nd, and 3rd positions.
   - Utilization of Integer objects and the `compareTo` method for testing.

## Test Cases

### Use Case 1: Given 3 Integers, find the maximum (UC 1)

#### Test Cases:

- **TC 1.1:**
  Given the maximum number at the 1st position, return the same number.
  - Ensure the test data has the maximum number in the first position.

- **TC 1.2:**
  Given the maximum number at the 2nd position, return the same number.
  - Ensure the test data has the maximum number in the second position.

- **TC 1.3:**
  Given the maximum number at the 3rd position, return the same number.
  - Ensure the test data has the maximum number in the third position.

### Use Case 2: Given 3 Floats, find the maximum (UC 2)

#### Test Cases:

- Repeat the similar 3 test cases as in Use Case 1.

### Use Case 3: Given 3 Strings, find the maximum (UC 3)

#### Test Cases:

- Repeat the similar 3 test cases as in Use Case 1.
  - Example: "Apple", "Peach", "Banana"

### Refactoring to One Generic Method (Refactor 1)

- Ensure the generic type extends Comparable.
- Refactor the code to create a generic method that handles all three data types efficiently.

### Refactor to Generic Class (Refactor 2)

- Create a generic class that takes in 3 variables of the generic type.
- Ensure the generic type extends Comparable.
- Write a parameterized constructor and a `testMaximum` method to internally call the static `testMaximum` method, passing the 3 instance variables.
- Define new test cases using the generic class.

### Extend the Max Method (Refactor 3 - UC 4)

- Extend the max method to take more than three parameters.
- Utilize options and sorting to handle additional parameters.

### PrintMax Generic Method (UC 5)

- Extend the max method to also print the max to std out using a generic method.
- Write a `printMax` generic method that is internally called from `testMaximum`.

This project demonstrates best practices in coding, testing, and refactoring, ensuring robust functionality and versatility.

