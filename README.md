# EasyTools Java Library

## Overview
EasyTools is a Java library that provides quality of life methods to simplify programming tasks, specifically in handling user input. This library, created by Deshawn Brown, aims to make programming fast and easy.

## Features
### Input Validation
- **IntInput:** Retrieves an integer input from the user, handling non-integer inputs.
- **DoubleInput:** Retrieves a double input from the user, handling non-double inputs.
- **FloatInput:** Retrieves a float input from the user, handling non-float inputs.
### In Range Input Validation
- **InRangeInput (int):** Retrieves an integer input within a specified range from the user.
- **InRangeInput (double):** Retrieves a double input within a specified range from the user.
- **InRangeInput (float):** Retrieves a float input within a specified range from the user.

## Usage
To use EasyTools in your Java project, follow these steps:
1. Download the EasyTools.java file.
2. Include the file in your project.
3. Create an instance of the `EasyToolBox` class.
4. Utilize the provided methods for streamlined user input handling.

```java  
import EasyTools.EasyToolBox;

public class YourClass {
    public static void main(String[] args) {
        EasyToolBox easyToolBox = new EasyToolBox();

        // Example: Retrieve an integer input
        int userInput = easyToolBox.IntInput("Please enter a valid integer: ");

        // Example: Retrieve a double input within a specified range
        double rangeInput = easyToolBox.InRangeInput(1.0, 10.0, "Please enter a valid double: ", "Input must be between %f and %f: ");
    }
}
```
