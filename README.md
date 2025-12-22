# Learn Java




This Repository only contains **Java Basics**.

| Topics      | Modules        | Links |
|------------|----------------|-------|
| Java Basics | Modules 1–10   | [Click](https://github.com/Saumyajeet-Varma/Learn-Java) |
| Java OOP    | Modules 11–20  | [Click](https://github.com/Saumyajeet-Varma/Learn-Java-OOP) |
| Java DS     | Modules 21–30  | [Click](https://github.com/Saumyajeet-Varma/Learn-Java-DataStructures) |




# Java Basics



## Table of Contents

- [Getting Started](#getting-started)
    - [Print](#print)
    - [Comments](#comments)
- [Data Types](#data-types)
    - [Primitive](#primitive-data-types)
    - [Non-Primitive](#non-primitive-data-types)
    - [The `var` Keyword](#the-var-keyword)
    - [Type Casting](#type-casting)
- [Operators](#operators)
    - [Arithmetic Operators](#arithmetic-operators) 
    - [Assignment Operators](#assignment-operators) 
    - [Comparision Operators](#comparision-operators) 
    - [Logical Operators](#logical-operators) 
- [Strings](#strings)
    - [String Methods](#string-methods) 
    - [Adding Numbers and Strings](#adding-numbers-and-strings) 
    - [Special Characters](#special-characters) 
- [Maths](#math)
- [Conditinal Statements](#conditional-statements)
    - [`if`](#if)
    - [`else`](#else)
    - [`else if`](#else-if)
    - [Nested if](#nested-if)
    - [Ternary Operators](#ternary-operators)
    - [Switch](#switch)
- [Loops](#loops)
    - [While loop](#while-loop)
    - [Do-While loop](#do-while-loop)
    - [For loop](#for-loop)
    - [Nested Loop](#nested-loop)
- [Break/Continue](#breakcontinue)
    - [Break](#break)
    - [Continue](#continue)
    - [Break vs Continue](#break-vs-continue)
- [Arrays](#arrays)
    - [Access the Elements of Array](#access-the-elements-of-array)
    - [Change an Array Element](#change-an-array-element)
    - [Array Length](#array-length)
    - [The `new` Keyword](#the-new-keyword)
    - [Arrays Loop](#arrays-loop)
- [Multidimensional Array](#multidimensional-arrays)
    - [Access Elements](#access-elements)
    - [Change Element Values](#change-element-values)
    - [Rows and Columns](#rows-and-columns-lengths)
    - [Loop Through a Multidimensional Array](#loop-through-a-multidimensional-array)
- [Methods](#java-methods)
    - [Create a Method](#create-a-method)
    - [Call a Method](#call-a-method)
    - [Parameters and Arguments](#parameters-and-arguments)
    - [Return Values](#return-values)
    - [Method Overloading](#method-overloading)
    - [Recursion](#recursion)
- [Scope](#scope)
    - [Method Scope](#method-scope)
    - [Block Scope](#block-scope)
    - [Loop Scope](#loop-scope)
    - [Class Scope](#class-scope)
- [Errors](#java-errors)
- [Debugging](#debugging)
- [Exception](#java-exceptions)
    - [Exceptions Handling](#exceptions-handling-try-and-catch)
    - [Finally](#finally)
    - [The `throw` Keyword](#the-throw-keyword)
    - [Multiple Exceptions](#multiple-exceptions)
- [File Handling](#file-handling)
    - [Create Files](#create-files)
    - [Write Files](#write-files)
    - [Read Files](#read-files)
    - [Delete Files](#delete-files)




## Getting Started

In Java, every application begins with a class name, and that class must match the filename.

Every line of code that runs in Java must be inside a `class`. And the class name should always start with an uppercase first letter. In our example, we named the class **HelloWorld**.

**NOTE**: Java is case sensitive, `MyClass` and `myClass` has different meaning.

> - The curly braces `{}` marks the beginning and the end of a block of code.
> - `System` is a built-in Java class that contains useful members, such as `out`, which is short for "output". The `println()` method, short for "print line", is used to print a value to the screen (or a file). 
> - You should also note that each code statement must end with a semicolon (`;`)

### Print

In Java, both `print` and `println` are methods of the PrintStream class, and you usually use them via `System.out`.

#### `print`

- Prints the text to the console **without moving** to the next line.
- If you call another print, the output continues on the same line.

```java
System.out.print("Hello");
System.out.print(" World");

```

```
Hello World
```

#### `println`

- Prints the text to the console **and then moves** the cursor to the next line.
- Any subsequent output will appear on a new line.

```java
System.out.println("Hello");
System.out.println("World");

```

```
Hello
World
```

### Comments

#### Single-line Comments

Single-line comments start with two forward slashes (`//`).

Any text between `//` and the end of the line is ignored by Java (will not be executed).

```java
// This is a comment
System.out.println("Hello World");

```

```java
System.out.println("Hello World"); // This is a comment

```

#### Multi-line Comments

Multi-line comments start with `/*` and ends with `*/`.

Any text between `/*` and `*/` will be ignored by Java.

```java
/* This is a
multi-line code */
System.out.println("Hello World");

```




## Data Types

Data types are divided into two groups:

- Primitive data types - includes `byte`, `short`, `int`, `long`, `float`, `double`, `boolean` and `char`.
- Non-primitive data types - such as `String`, `Arrays` and `Classes`.

### Primitive Data Types

| Data Type | Description                                                                 |
|-----------|-----------------------------------------------------------------------------|
| byte      | Stores whole numbers from -128 to 127                                       |
| short     | Stores whole numbers from -32,768 to 32,767                                 |
| int       | Stores whole numbers from -2,147,483,648 to 2,147,483,647                   |
| long      | Stores whole numbers from -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807 |
| float     | Stores fractional numbers. Sufficient for storing 6 to 7 decimal digits     |
| double    | Stores fractional numbers. Sufficient for storing 15 to 16 decimal digits   |
| boolean   | Stores true or false values                                                 |
| char      | Stores a single character/letter or ASCII values                            |

### Non-Primitive Data Types

Non-primitive data types are called reference types because they refer to objects.

The main differences between **primitive** and **non-primitive** data types are:

- Primitive types in Java are predefined and built into the language, while non-primitive types are created by the programmer (except for `String`).
- Non-primitive types can be used to call methods to perform certain operations, whereas primitive types cannot.
- Primitive types start with a lowercase letter (like `int`), while non-primitive types typically starts with an uppercase letter (like `String`).
- Primitive types always hold a value, whereas non-primitive types can be `null`.

### The `var` Keyword

The `var` keyword lets the compiler automatically detect the type of a variable based on the value you assign to it. <br> This helps you write cleaner code and avoid repeating types, especially for long or complex types.

```java
var x = 5;  // x is an int
System.out.println(x);

```

> When using `var`, the compiler understands that `5` is an `int`.

#### Important Note

- var only works when you assign a value at the same time (you can't declare var x; without assigning a value)

```java
var x; // Error
var x = 5;  // OK

```

- Once the type is chosen, it stays the same.

```java
var x = 5;  // x is now an int
x = 10;     // OK - still an int
x = 9.99;   // Error - can't assign a double to an int

```

### Type Casting

Type casting is when you assign a value of one primitive data type to another type.

In Java, there are two types of casting:

- Widening Casting (automatically) - converting a smaller type to a larger type size
    `byte` -> `short` -> `char` -> `int` -> `long` -> `float` -> `double`

- Narrowing Casting (manually) - converting a larger type to a smaller size type
    `double` -> `float` -> `long` -> `int` -> `char` -> `short` -> `byte`

> You can see the code examples in [src/module2/TypeCasting.java](/src/module02/TypeCasting.java)




## Operators

Operators are used to perform operations on variables and values.

### Arithmetic Operators

| Operator | Name          | Description                               | Example |
|----------|---------------|-------------------------------------------|---------|
| +        | Addition      | Adds together two values                  | x + y   |
| -        | Subtraction   | Subtracts one value from another          | x - y   |
| *        | Multiplication| Multiplies two values                     | x * y   |
| /        | Division      | Divides one value by another              | x / y   |
| %        | Modulus       | Returns the division remainder            | x % y   |
| ++       | Increment     | Increases the value of a variable by 1    | ++x     |
| --       | Decrement     | Decreases the value of a variable by 1    | --x     |

> **NOTE**: When dividing two integers in Java, the result will also be an integer. For example, 10 / 3 gives 3. If you want a decimal result, use double values, like 10.0 / 3.

### Assignment Operators

| Operator | Example  | Same As     |
|----------|----------|-------------|
| =        | x = 5    | x = 5       |
| +=       | x += 3   | x = x + 3   |
| -=       | x -= 3   | x = x - 3   |
| *=       | x *= 3   | x = x * 3   |
| /=       | x /= 3   | x = x / 3   |
| %=       | x %= 3   | x = x % 3   |
| &=       | x &= 3   | x = x & 3   |
| \|=      | x \|= 3  | x = x \| 3  |
| ^=       | x ^= 3   | x = x ^ 3   |
| >>=      | x >>= 3  | x = x >> 3  |
| <<=      | x <<= 3  | x = x << 3  |

### Comparision Operators

| Operator | Name                       | Example |
|----------|----------------------------|---------|
| ==       | Equal to                   | x == y  |
| !=       | Not equal                  | x != y  |
| >        | Greater than               | x > y   |
| <        | Less than                  | x < y   |
| >=       | Greater than or equal to   | x >= y  |
| <=       | Less than or equal to      | x <= y  |

### Logical Operators

| Operator | Name        | Description                                    | Example               |
|----------|-------------|------------------------------------------------|-----------------------|
| &&       | Logical AND | Returns true if both statements are true        | x < 5 && x < 10       |
| \|\|     | Logical OR  | Returns true if one of the statements is true   | x < 5 \|\| x < 4      |
| !        | Logical NOT | Reverses the result, returns false if true      | !(x < 5 && x < 10)    |




## Strings

Strings are used for storing text.


A `String` variable contains a collection of characters surrounded by double quotes

```java
String txt = "Hello";

```

### String Methods

- **length** - To calculate the length of a string.
- **toUpperCase** - To converts a string to uppercase.
- **toLowerCase** - To converts a string to lowercase.
- **indexOf** - It returns the index (the position) of the first occurrence of a specified text in a string (including whitespaces).
- **charAt** - To access a character at a specific position in a string.
- **equals** - To compare two strings.
- **trim** - To remove whitespaces from beginning and ending of the string.
- **concat** - To concatenate two strings.

> For code example
> - [src/module04/StringMethods.java](./src/module04/StringMethods.java)
> - [src/module04/Concatenation.java](./src/module04/Concatenation.java)

### Adding Numbers and Strings

If you add two numbers, the result will be a number

```java
int x = 10;
int y = 20;
int z = x + y;  // z will be 30 (an integer/number)

```

If you add two strings, the result will be a string concatenation

```java
String x = "10";
String y = "20";
String z = x + y;  // z will be 1020 (a String)

```

If you add a number and a string, the result will be a string concatenation

```java
String x = "10";
int y = 20;
String z = x + y;  // z will be 1020 (a String)

```

### Special Characters

| Escape character | Result | Description   |
|------------------|--------|---------------|
| \\'               | '      | Single quote  |
| \\"               | "      | Double quote  |
| \\\\               | \      | Backslash     |

| Code | Result | Description       |
|------|--------|-------------------|
| \n   | New Line       | Moves cursor to next line |
| \t   | Tab            | Inserts a horizontal tab   |
| \b   | Backspace      | Deletes previous character |
| \r   | Carriage Return| Moves cursor to line start |
| \f   | Form Feed      | Moves to next page (printer context) |

> For code example - [src/module04/SpecialCharacters.java](./src/module04/SpecialCharacters.java)




## Math

We have `max(x, y)`, `min(x, y)`, `abs(x)`, `pow(x, y)`, `round(x)`, `ceil(x)`, `floor(x)`, `random()` functions in Math in Java.

- `Math.max(x, y)` → Returns the greater of two values x and y.
- `Math.min(x, y)` → Returns the smaller of two values x and y.
- `Math.abs(x)` → Returns the absolute (non-negative) value of x.
- `Math.pow(x, y)` → Returns x raised to the power of y (x^y).
- `Math.round(x)` → Rounds x to the nearest whole number (returns int or long).
- `Math.ceil(x)` → Rounds x upward to the nearest integer (smallest integer ≥ x).
- `Math.floor(x)` → Rounds x downward to the nearest integer (largest integer ≤ x).
- `Math.random()` → Returns a pseudorandom double value between 0.0 (inclusive) and 1.0 (exclusive).

> For code example - [src/module04/Maths.java](./src/module04/Maths.java)




## Conditional Statements

### if

Conditions and if statements let you control the flow of your program - deciding which code runs, and which code is skipped.

Every `if` statement needs a condition that results in `true` or `false`

This means `if` statements work hand-in-hand with `boolean` values

#### Syntax:

```java
if (condition) {
    // block of code to be executed if the condition is true
}

```

#### Example:

```java
boolean isRaining = true;

if (isRaining) {
    System.out.println("Bring an umbrella!");
}

```

```java
if (20 > 18) {
    System.out.println("20 is greater than 18");
}

```

Most often, conditions are created using comparison operators, like the ones below:

- Less than: `a < b`
- Less than or equal to: `a <= b`
- Greater than:` a > b`
- Greater than or equal to: `a >= b`
- Equal to: `a == b`
- Not equal to: `a != b`

### else

The `else` statement lets you run a block of code when the condition in the `if` statement is `false`.

#### Syntax

```java
if (condition) {
    // block of code to be executed if the condition is true
} 
else {
    // block of code to be executed if the condition is false
}

```

#### Example

```java
boolean isRaining = false;

if (isRaining) {
    System.out.println("Bring an umbrella!");
} 
else {
    System.out.println("No rain today, no need for an umbrella!");
}

```

```java
int time = 20;

if (time < 18) {
    System.out.println("Good day.");
} 
else {
    System.out.println("Good evening.");
}

```

> - `else` does not have a condition - it runs when the `if` condition is `false`.
> - Do not put a semicolon right after `if (condition)`. That would end the statement early and make `else` behave unexpectedly.

### else if

Use the `else if` statement to specify a new condition if the first condition is false.

#### Syntax

```java
if (condition1) {
    // block of code to be executed if condition1 is true
} 
else if (condition2) {
    // block of code to be executed if the condition1 is false and condition2 is true
} 
else {
    // block of code to be executed if the condition1 is false and condition2 is false
}

```

#### Example

```java
int weather = 2; // 1 = raining, 2 = sunny, 3 = cloudy

if (weather == 1) {
    System.out.println("Bring an umbrella.");
} 
else if (weather == 2) {
    System.out.println("Wear sunglasses.");
} 
else {
    System.out.println("Just go outside normally.");
}

```

```java
int time = 22;

if (time < 10) {
    System.out.println("Good morning.");
} 
else if (time < 18) {
    System.out.println("Good day.");
} 
else {
    System.out.println("Good evening.");
}

```

### Nested if

You can also place an `if` statement inside another `if`. This is called a nested if statement.

A nested `if` lets you check for a condition only if another condition is already `true`.

#### Syntax

```java
if (condition1) {
    // code to run if condition1 is true
    if (condition2) {
        // code to run if both condition1 and condition2 are true
    }
}

```

#### Example

```java
int x = 15;
int y = 25;

if (x > 10) {
    
    System.out.println("x is greater than 10");
  
    // Nested if 
    if (y > 20) {
        System.out.println("y is also greater than 20");
    }
}

```

```java
int age = 20;
boolean isCitizen = true;

if (age >= 18) {
    
    System.out.println("Old enough to vote.");
  
    if (isCitizen) {
        System.out.println("And you are a citizen, so you can vote!");
    } 
    else {
        System.out.println("But you must be a citizen to vote.");
    }
} 
else {
    System.out.println("Not old enough to vote.");
}

```

### Ternary Operators

There is also a short-hand if else, which is known as the ternary operator because it consists of three operands.

It can be used to replace multiple lines of code with a single line, and is most often used to replace simple if else statements

#### Syntax

```java
variable = (condition) ? expressionTrue :  expressionFalse;

```

#### Example

```java
int time = 20;
String result = (time < 18) ? "Good day" : "Good evening";
System.out.println(result); // Good evening

```

### Switch

Instead of writing many `if..else` statements, you can use the `switch` statement.

The `switch` statement selects one of many code blocks to be executed

#### Syntax

```java
switch(expression) {
    case x:
        // code block
        break;
    case y:
        // code block
        break;
    default:
        // code block
}

```

This is how it works:

- The `switch` expression is evaluated once.
- The result is compared with each `case` value.
- If there is a match, the matching block of code runs.
- The `break` statement stops the switch after the matching case has run.
- The `default` statement runs if there is no match.

#### Example

```java
int day = 4;
switch (day) {
    case 1:
        System.out.println("Monday");
        break;
    case 2:
        System.out.println("Tuesday");
        break;
    case 3:
        System.out.println("Wednesday");
        break;
    case 4:
        System.out.println("Thursday");
        break;
    case 5:
        System.out.println("Friday");
        break;
    case 6:
        System.out.println("Saturday");
        break;
    case 7:
        System.out.println("Sunday");
        break;
    default:
        System.out.println("Invalid Expression");
}

```

> A break can save a lot of execution time because it "ignores" the execution of all the rest of the code in the switch block.

> Note that if the default statement is used as the last statement in a switch block, it does not need a break.

## Loops

Loops can execute a block of code as long as a specified condition is true.

Loops are handy because they save time, reduce errors, and they make code more readable.

### While Loop

The `while` loop repeats a block of code as long as the specified condition is true

#### Syntax

```java
while (condition) {
    // code block to be executed
}

```

#### Example

```java
int i = 0;
while (i < 5) {
    System.out.println(i);
    i++;
}

```

> **Note**: Do not forget to increase the variable used in the condition (`i++`), otherwise the loop will never end!

### Do-While Loop

The `do/while` loop is a variant of the `while` loop. This loop will execute the code block **once**, before checking if the condition is **true**. Then it will repeat the loop as long as the condition is **true**.

#### Syntax

```java
do {
    // code block to be executed
}
while (condition);

```

> **Note**: The semicolon `;` after the while condition is required!

#### Example

```java
int i = 0;
do {
    System.out.println(i);
    i++;
}
while (i < 5);

```

> Do not forget to increase the variable used in the condition (i++), otherwise the loop will never end!

#### Condition is False from the Start

In the `while` loop, we saw that if the condition is false at the beginning, the loop never runs at all.

The `do/while` loop is different: it will always run the code block at least once, even if the condition is false from the start.

### For Loop

When you know exactly how many times you want to loop through a block of code, use the `for` loop instead of a `while` loop

#### Syntax

```java
for (statement 1; statement 2; statement 3) {
    // code block to be executed
}

```

- Statement 1 is executed (one time) before the execution of the code block.
- Statement 2 defines the condition for executing the code block.
- Statement 3 is executed (every time) after the code block has been executed.

#### Example

```java
for (int i = 0; i < 5; i++) {
    System.out.println(i);
}

```

Example explained
- Statement 1 sets a variable before the loop starts: int i = 0
- Statement 2 defines the condition for the loop to run: i < 5. If the condition is true, the loop will run again; if it is false, the loop ends.
- Statement 3 increases a value each time the code block has run: i++

### For-Each Loop

There is also a **for-each** loop, which is used exclusively to loop through elements in an `array` (or other data structures)

#### Syntax

```java
for (type variableName : arrayName) {
    // code block to be executed
}

```

> The **for-each** loop is simpler and more readable than a regular `for` loop, since you don't need a counter (like `i < array.length`).

#### Example

```java
int[] numbers = {10, 20, 30, 40};

for (int num : numbers) {
    System.out.println(num);
}

```

```java
String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};

for (String car : cars) {
    System.out.println(car);
}

```

### Nested Loop

It is also possible to place a loop inside another loop. This is called a nested loop.

The **inner loop** will be executed one time for each iteration of the **outer loop**.

#### Example

```java
// Outer loop
for (int i = 1; i <= 2; i++) {

    System.out.println("Outer: " + i); // Executes 2 times
  
    // Inner loop
    for (int j = 1; j <= 3; j++) {
        System.out.println(" Inner: " + j); // Executes 6 times (2 * 3)
    }
} 

```




## Break/Continue

### Break

The `break` statement can also be used to jump out of a loop.

#### Example

```java
for (int i = 0; i < 10; i++) {
    
    if (i == 4) {
        break;
    }

    System.out.println(i);
}

```

> This example stops the loop when i is equal to 4

### Continue

The `continue` statement breaks one iteration (in the loop), if a specified condition occurs, and continues with the next iteration in the loop.

#### Example

```java
for (int i = 0; i < 10; i++) {
    
    if (i == 4) {
        continue;
    }
    
    System.out.println(i);
}

```

> This example skips the value of 4

### Break vs Continue

| Keyword   | Description                                   | Effect in Loop                         |
|-----------|-----------------------------------------------|----------------------------------------|
| `break`   | Stops the loop completely                     | Exits the loop immediately             |
| `continue`| Skips the current iteration and continues loop| Moves to the next iteration of the loop|




## Arrays

Arrays are used to store multiple values in a single variable, instead of declaring separate variables for each value.

To declare an array, define the variable type with **square brackets** `[ ]`

```java
int[] nums;

```

We have now declared a variable that holds an array of integers. To insert values to it, you can place the values in a comma-separated list, inside curly braces `{ }`

```java
int[] nums = {3, 4, 2, 5, 1};

```

### Access the Elements of Array

You can access an array element by referring to the index number.

```java
int[] nums = {3, 4, 2, 5, 1};
System.out.println(nums[0]) // 3

```

> Note: Array indexes start with 0: [0] is the first element. [1] is the second element, etc.

| Index | Value |
|-------|-------|
| 0     | 3     |
| 1     | 4     |
| 2     | 2     |
| 3     | 5     |
| 4     | 1     |

### Change an Array Element

To change the value of a specific element, refer to the index number

```java
nums[0] = 6;

```

```java
int[] nums = {3, 4, 2, 5, 1};
nums[0] = 6;
System.out.println(nums[0]) // 6

```

### Array Length

To find out how many elements an array has, use the `length` property

```java
int[] nums = {3, 4, 2, 5, 1};
System.out.println(nums.length); // 5

```

### The `new` Keyword

You can also create an array by specifying its size with `new`. This makes an empty array with space for a fixed number of elements, which you can fill later

```java
String[] cars = new String[4]; // size is 4

cars[0] = "Volvo";
cars[1] = "BMW";
cars[2] = "Ford";
cars[3] = "Mazda";

System.out.println(cars[0]); // Outputs Volvo

```

However, if you already know the values, you don't need to write `new`. Both of these create the same array

```java
// With new
String[] cars = new String[] {"Volvo", "BMW", "Ford", "Mazda"};

// Shortcut (most common)
String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};

```

> **Note**: You cannot write new String[4] {"Volvo", "BMW", "Ford", "Mazda"}. <br>
> In Java, when using new, you either:
> - Use new String[4] to create an empty array with 4 slots, and then fill them later
> - Or use new String[] {"Volvo", "BMW", "Ford", "Mazda"} (without specifying the number of elements) to create the array and assign values at the same time 

> **Tip**: The shortcut syntax is most often used when the values are known at the start. Use new with a size when you want to create an empty array and fill it later.

### Arrays Loop

#### Loop Through an Array

You can loop through the array elements with the `for` loop, and use the `length` property to specify how many times the loop should run.

```java
int[] nums = {10, 20, 30, 40};

for (int i = 0; i < nums.length; i++) {
    System.out.println(nums[i]);
}

```

> This example creates an array of strings and then uses a `for` loop to print each element, one by one

#### Loop Through an Array with For-Each

There is also a **for-each** loop, which is used exclusively to loop through elements in an `array` (or other data structures)

```java
int[] nums = {10, 20, 30, 40};

for (int num: nums) {
    System.out.println(num);
}

```

> The following example uses a **for-each** loop to print all elements in the nums array

> **Note**: The **for-each** loop is great when you only need to read elements. If you want to change the elements later, or keep track of their index, use a regular `for` loop instead.

## Multidimensional Arrays

A multidimensional array is an array that contains other arrays.

You can use it to store data in a table with rows and columns.

To create a two-dimensional array, write each row inside its own curly braces

```java
int[][] myNumbers = { {1, 4, 2}, {3, 6, 8} };

```

> Here, myNumbers has two arrays (two rows):
> - First row: `{1, 4, 2}`
> - Second row: `{3, 6, 8}`

### Access Elements

To access an element of a two-dimensional array, you need two indexes: the first for the row, and the second for the column.

```java
int[][] myNumbers = { {1, 4, 2}, {3, 6, 8} };
System.out.println(myNumbers[1][2]); // Outputs 8

```

> This statement accesses the element in the **second row** (index 1) and **third column** (index 2) of the myNumbers array

### Change Element Values

You can overwrite an existing element using the same two-index notation (row, then column)

```java
int[][] myNumbers = { {1, 4, 2}, {3, 6, 8} };
myNumbers[1][2] = 9;
System.out.println(myNumbers[1][2]); // 9

```

### Rows and Columns (Lengths)

You can use `length` to get the number of rows, and` myNumbers[row].length` for the number of columns in a given row

```java
int[][] myNumbers = { {1, 4, 2}, {3, 6, 8, 5, 2} };

System.out.println("Rows: " + myNumbers.length);             // 2
System.out.println("Cols in row 0: " + myNumbers[0].length); // 3
System.out.println("Cols in row 1: " + myNumbers[1].length); // 5

```

> **Note**: Notice how rows can have different lengths - In this example, the second row has more elements than the first, and that's perfectly valid in Java.

### Loop Through a Multidimensional Array

Use a `for` loop inside another `for` loop to visit every element (row by row)

```java
int[][] myNumbers = { {1, 4, 2}, {3, 6, 8, 5, 2} };

for (int row = 0; row < myNumbers.length; row++) {
    for (int col = 0; col < myNumbers[row].length; col++) {
        System.out.println("myNumbers[" + row + "][" + col + "] = " + myNumbers[row][col]);
    }
}

```

Or use a for-each loop in both levels, which many find easier to read

```java
int[][] myNumbers = { {1, 4, 2}, {3, 6, 8, 5, 2} };

for (int[] row : myNumbers) {
    for (int num : row) {
        System.out.println(num);
    }
}

```




## Java Methods

A **method** is a block of code which only runs when it is called.

You can pass data, known as parameters, into a method.

Methods are used to perform certain actions, and they are also known as **functions**.

Why use methods? To reuse code: define the code once, and use it many times.

### Create a Method

A method must be declared within a class. It is defined with the name of the method, followed by parentheses `()`. Java provides some pre-defined methods, such as `System.out.println()`, but you can also create your own methods to perform certain actions

#### Example

```java
public class Main {
    static void myMethod() {
        // code to be executed
    }
}

```

> - `myMethod()` is the name of the method
> - `static` means that the method belongs to the Main class and not an object of the Main class. You will learn more about objects and how to access methods through objects later in this tutorial.
> - `void` means that this method does not have a return value. You will learn more about return values later in this chapter

### Call a Method

To call a method in Java, write the method's name followed by two parentheses `()` and a semicolon `;`

A method can also be called multiple times

```java
public class Main {
    static void myMethod() {
        System.out.println("I just got executed!");
    }

    public static void main(String[] args) {
        myMethod();
    }
}

```

> In the above example, `myMethod()` is used to print a text (the action), when it is called

### Parameters and Arguments

Information can be passed to methods as a parameter. Parameters act as variables inside the method.

Parameters are specified after the method name, inside the parentheses. You can add as many parameters as you want, just separate them with a comma.

#### Example

```java
public class Main {
    static void myMethod(String fname) {
        System.out.println("Hello " + fname);
    }

    public static void main(String[] args) {
        myMethod("Samm");
        myMethod("Sammy");
    }
}

```

> When a **parameter** is passed to the method, it is called an **argument**. So, from the example above: `fname` is a **parameter**, while `Samm` and `Sammy` are **arguments**.

```java
public class Main {
    static void myMethod(String fname, int id) {
        System.out.println("Hello " + fname + ", You ID is " + id);
    }

    public static void main(String[] args) {
        myMethod("Samm", 10);
        myMethod("Sammy", 53);
    }
}

```

> Note that when you are working with multiple parameters, the method call must have the same number of arguments as there are parameters, and the arguments must be passed in the same order.

### Return Values

In the previous examples, we used the `void` keyword in all examples (like `static void myMethod(int x)`), which indicates that the method should not return a value.

If you want the method to return a value, you can use a primitive data type (such as `int`, `char`, etc.) instead of `void`, and use the `return` keyword inside the method

#### Example

```java
public class Main {
    static int myMethod(int x, int y) {
        return x + y;
    }

    public static void main(String[] args) {
        System.out.println(myMethod(5, 10));
    }
}

```

### Method Overloading

With method overloading, multiple methods can have the same name with different parameters

```java
int myMethod(int x)
float myMethod(float x)
double myMethod(double x, double y)

```

```java
static int plusMethodInt(int x, int y) {
    return x + y;
}

static double plusMethodDouble(double x, double y) {
    return x + y;
}

public static void main(String[] args) {
    int myNum1 = plusMethodInt(8, 5);
    double myNum2 = plusMethodDouble(4.3, 6.26);
    System.out.println("int: " + myNum1);
    System.out.println("double: " + myNum2);
}

```

> **Note**: Multiple methods can have the same name as long as the number and/or type of parameters are different.

### Recursion

Recursion is the technique of making a function call itself. This technique provides a way to break complicated problems down into simpler problems which are easier to solve.

#### Example

```java
public class Main {
    public static int sum(int k) {
        if (k > 0) {
            return k + sum(k - 1);
        } 
        else {
            return 0;
        }
    }

    public static void main(String[] args) {
        int result = sum(10);
        System.out.println(result);
    }
}

```

> When the sum() method is called, it adds parameter k to the sum of all numbers smaller than k and returns the result. When k becomes 0, the method just returns 0 (Since the method does not call itself when k is 0, the program stops there and returns the result). When running, the program follows these steps
> - 10 + sum(9)
> - 10 + (9 + sum(8))
> - 10 + (9 + (8 + sum(7)))
> - ...
> - 10 + 9 + 8 + 7 + 6 + 5 + 4 + 3 + 2 + 1 + sum(0)
> - 10 + 9 + 8 + 7 + 6 + 5 + 4 + 3 + 2 + 1 + 0

#### Halting Condition

Just as loops can run into the problem of infinite looping, recursive methods can run into the problem of infinite recursion. Infinite recursion is when the method never stops calling itself. Every recursive method should have a halting condition, which is the condition where the method stops calling itself. In the previous example, the halting condition is when the parameter `k` becomes 0.

> Be careful with recursion: it's easy to accidentally write a method that never stops or uses too much memory. But when written correctly, recursion can be both efficient and elegant.




## Scope

In Java, variables are only accessible inside the region where they are created. This is called **scope**.

### Method Scope

Variables declared directly inside a method are available anywhere in the method following the line of code in which they were declared

```java
public class Main {
    public static void main(String[] args) {

        // Code here CANNOT use x

        int x = 100;

        // Code here CAN use x
        System.out.println(x);
    }
}

```

### Block Scope

A block of code refers to all of the code between curly braces `{ }`

Variables declared inside a block of code are only accessible by the code between the curly braces, and only after the line in which the variable was declared

```java
public class Main {
    public static void main(String[] args) {

        // Code here CANNOT use x

        { // This is a block

            // Code here CANNOT use x

            int x = 100;

            // Code here CAN use x
            System.out.println(x);

        } // The block ends here

        // Code here CANNOT use x

    }
}

```

### Loop Scope

Variables declared inside a for loop only exist inside the loop

```java
public class Main {
    public static void main(String[] args) {

        for (int i = 0; i < 5; i++) {
            System.out.println(i); // i is accessible here
        }

        // i is NOT accessible here
    }
}

```

- The `for` loop has its own block (`{ ... }`).
- The variable `i` declared in the loop header (`int i = 0`) is only accessible inside that loop block.
- Once the loop ends, `i` is destroyed, so you can't use it outside.

### Class Scope

Variables declared inside a class but outside any method have class scope (also called fields). These variables can be accessed by all methods in the class

```java
public class Main {
    
    int x = 5; // Class variable

    public static void main(String[] args) {
        Main myObj = new Main();
        System.out.println(myObj.x); // Accessible here
    }
}

```




## Java Errors

Even experienced Java developers make mistakes. The key is learning how to spot and fix them!

| Error Type         | Description                                                |
| ------------------ | ---------------------------------------------------------- |
| Compile-Time Error | Detected by the compiler. Prevents code from running.      |
| Runtime Error      | Occurs while the program is running. Often causes crashes. |
| Logical Error      | Code runs but gives incorrect results. Hardest to find.    |

#### Common Compile-Time Errors

Compile-time errors occur when the program cannot compile due to syntax or type issues.

- Missing Semicolon
- Undeclared Variables
- Mismatched Types (Data Types)

#### Common Runtime Errors

Runtime errors occur when the program compiles but crashes or behaves unexpectedly.

- Division by Zero
- Array Index Out of Bounds

#### Logical Errors

Logical errors happen when the code runs, but the result is not what you thought.

### Good Habits to Avoid Errors

- Use meaningful variable names
- Read the error message carefully. What line does it mention?
- Check for missing semicolons or braces
- Look for typos in variable or method names




## Debugging

Debugging is the process of identifying and fixing errors or bugs in your code.

It often involves:
- Reading error messages
- Tracing variable values step by step
- Testing small pieces of code independently

> **Tip**: Debugging is a skill that improves with practice. The more you debug, the better you get at spotting problems quickly.




## Java Exceptions

As mentioned earlier, different types of errors can occur while running a program - such as coding mistakes, invalid input, or unexpected situations.

When an error occurs, Java will normally stop and generate an error message. The technical term for this is: Java will throw an exception (throw an error).

### Exceptions Handling (try and catch)

Exception handling lets you catch and handle errors during runtime - so your program doesn't crash.

It uses different keywords
- The `try` statement allows you to define a block of code to be tested for errors while it is being executed.
- The `catch` statement allows you to define a block of code to be executed, if an error occurs in the try block.
- The `try` and `catch` keywords come in pairs

#### Syntax

```java
try {
    //  Block of code to try
}
catch(Exception e) {
    //  Block of code to handle errors
}

```

#### Example

```java
public class Main {
    public static void main(String[ ] args) {
        try {
            int[] myNumbers = {1, 2, 3};
            System.out.println(myNumbers[10]);
        } 
        catch (Exception e) {
            System.out.println("Something went wrong.");
        }
    }
}

```

The output will be:

```
Something went wrong.
```

### Finally

The `finally` statement lets you execute code, after `try...catch`, regardless of the result

```java
public class Main {
    public static void main(String[] args) {
        try {
            int[] myNumbers = {1, 2, 3};
            System.out.println(myNumbers[10]);
        } 
        catch (Exception e) {
            System.out.println("Something went wrong.");
        } 
        finally {
            System.out.println("The 'try catch' is finished.");
        }
    }
}

```

The output will be:

```
Something went wrong.
The 'try catch' is finished.
```

### The `throw` Keyword

The `throw` statement allows you to create a custom error.

The `throw` statement is used together with an **exception type**. There are many exception types available in Java: `ArithmeticException`, `FileNotFoundException`, `ArrayIndexOutOfBoundsException`, `SecurityException`, etc.

```java
public class Main {
    static void checkAge(int age) {
        if (age < 18) {
            throw new ArithmeticException("Access denied - You must be at least 18 years old.");
        }
        else {
            System.out.println("Access granted - You are old enough!");
        }
    }

    public static void main(String[] args) {
        checkAge(15); // Set age to 15 (which is below 18...)
    }
}

```

| Error/Exception                 | Description                                                                    |
| ------------------------------- | ------------------------------------------------------------------------------ |
| ArithmeticError                 | Occurs when a numeric calculation goes wrong                                   |
| ArrayIndexOutOfBoundsException  | Occurs when trying to access an index number that does not exist in an array   |
| ClassNotFoundException          | Occurs when trying to access a class that does not exist                       |
| FileNotFoundException           | Occurs when a file cannot be accessed                                          |
| InputMismatchException          | Occurs when entering wrong input (e.g. text in a numerical input)              |
| IOException                     | Occurs when an input or output operation fails                                 |
| NullPointerException            | Occurs when trying to access an object reference that is null                  |
| NumberFormatException           | Occurs when it is not possible to convert a specified string to a numeric type |
| StringIndexOutOfBoundsException | Occurs when trying to access a character in a String that does not exist       |


### Multiple Exceptions

Sometimes, different errors (exceptions) can happen in the same `try` block. You can handle them with **multiple catch blocks**.

#### One try, Many catch

You can add more than one `catch` block, and Java will run the first one that matches the thrown exception type

```java
public class Main {
    public static void main(String[] args) {
        try {
            int[] numbers = {1, 2, 3};
            System.out.println(numbers[10]);  // ArrayIndexOutOfBoundsException
            int result = 10 / 0;              // ArithmeticException
        } 
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array index does not exist.");
        } 
        catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero.");
        } 
        catch (Exception e) {
            System.out.println("Something else went wrong.");
        }
    }
}

```

The output will be:

```
Array index does not exist.
```

> **Explanation**: Only the first exception (`ArrayIndexOutOfBoundsException`) is thrown, so only the first matching `catch` runs.

> **Order Matters**: You should always put more specific exceptions first, and general ones later. Otherwise, the general catch will grab the error and the specific ones will never run 

#### Multi-Catch

you can catch multiple exceptions in one catch block using the `|` symbol. This is useful when different exceptions should be handled in the same way, so you don't have to repeat code

```java
try {
    int result = 10 / 0;
    int[] numbers = {1, 2, 3};
    System.out.println(numbers[10]);
} 
catch (ArithmeticException | ArrayIndexOutOfBoundsException e) {
    System.out.println("Math error or array error occurred.");
}

```




## File Handling

File handling is an important part of any application.

Java has several methods for creating, reading, updating, and deleting files.

The `File` class from the `java.io` package, allows us to work with files.

To use the `File` class, create an object of the class, and specify the filename or directory name

```java
import java.io.File;  // Import the File class

File myObj = new File("filename.txt"); // Specify the filename

```

The File class has many useful methods for creating and getting information about files.

| Method              | Type      | Description                                   |
|---------------------|-----------|-----------------------------------------------|
| `canRead()`         | Boolean   | Tests whether the file is readable or not     |
| `canWrite()`        | Boolean   | Tests whether the file is writable or not     |
| `createNewFile()`   | Boolean   | Creates an empty file                         |
| `delete()`          | Boolean   | Deletes a file                                |
| `exists()`          | Boolean   | Tests whether the file exists                 |
| `getName()`         | String    | Returns the name of the file                  |
| `getAbsolutePath()` | String    | Returns the absolute pathname of the file     |
| `length()`          | Long      | Returns the size of the file in bytes         |
| `list()`            | String[]  | Returns an array of the files in the directory|
| `mkdir()`           | Boolean   | Creates a directory                           |

### Create Files

In Java, you can create a new file with the `createNewFile()` method from the `File` class.

This method returns:
- `true` - if the file was created successfully
- `false` - if the file already exists

> Note that the method is enclosed in a `try...catch` block. This is necessary because it throws an `IOException` if an error occurs (if the file cannot be created for some reason)

```java
import java.io.File;       // Import the File class
import java.io.IOException; // Import IOException to handle errors

public class CreateFile {
    public static void main(String[] args) {
        try {
            File myObj = new File("filename.txt"); // Create File object
            if (myObj.createNewFile()) {           // Try to create the file
                System.out.println("File created: " + myObj.getName());
            } 
            else {
                System.out.println("File already exists.");
            }
        } 
        catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace(); // Print error details
        }
    }
}

```

The output will be:

```
File created: filename.txt
```

> **Explanation**: The program tries to create a file called `filename.txt`. If the file does not exist, it will be created and a success message is printed. If the file already exists, you will see the message `"File already exists."` instead.

> **Note**: The `createNewFile()` method only creates an empty file. It does not add any content inside.

#### Create a File in a Specific Folder

To create a file in a specific directory (requires permission), specify the path of the file and use double backslashes to escape the "`\`" character (for Windows). On Mac and Linux you can just write the path, like: `/Users/name/filename.txt`

```java
File myObj = new File("C:\\Users\\MyName\\filename.txt");

```

### Write Files

If you are just starting with Java, the easiest way to write text to a file is by using the `FileWriter` class.

In the example below, we use `FileWriter` together with its `write()` method to create and write some text into a file.

**Note**: When you are done, you should close the writer with the `close()` method

```java
import java.io.FileWriter;   // Import the FileWriter class
import java.io.IOException;  // Import the IOException class

public class WriteToFile {
    public static void main(String[] args) {
        try {
            FileWriter myWriter = new FileWriter("filename.txt");
            myWriter.write("Hello World!");
            myWriter.close();  // must close manually
            System.out.println("Successfully wrote to the file.");
        } 
        catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}

```

The output will be:

```
Successfully wrote to the file.
```

> **Explanation**: This program tries to write some text into a file named `filename.txt`. If everything works, the program will print `"Successfully wrote to the file."` in the console. If something goes wrong (for example, the file cannot be opened), it will print `"An error occurred."` instead.

#### Write To a File with try-with-resources

```java
import java.io.FileWriter;
import java.io.IOException;

public class WriteToFile {
    public static void main(String[] args) {
        // FileWriter will be closed automatically here
        try (FileWriter myWriter = new FileWriter("filename.txt")) {
            myWriter.write("Hello World!");
            System.out.println("Successfully wrote to the file.");
        } 
        catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}

```

The output will be:

```
Successfully wrote to the file.
```

#### Append to a File

Normally, `FileWriter` will **overwrite** a file if it already exists. If you want to **add new content** at the end of the file (without deleting what's already there), you can use the two-argument constructor and pass `true` as the second parameter. This puts the writer into **append mode**

```java
import java.io.FileWriter;
import java.io.IOException;

public class AppendToFile {
    public static void main(String[] args) {
        // true = append mode
        try (FileWriter myWriter = new FileWriter("filename.txt", true)) {
            myWriter.write("\nAppended text!");
            System.out.println("Successfully appended to the file.");
        } 
        catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}

```

The output will be:

```
Successfully appended to the file.
```

> **Explanation**: This program adds the text `"Appended text!"` to the end of `filename.txt` instead of replacing the file's content.

> **Note**: If the file does not already exist, Java will create it before appending.

#### Other Ways to Write to Files

- `FileWriter` - easiest choice for `basic text`.
- `BufferedWriter` - better for `large text files`, because it is faster and supports handy features.
- `FileOutputStream` - best for `binary data` (images, audio, PDFs)

### Read Files

we use the `Scanner` class to read the contents of the text file

```java
import java.io.File;                  // Import the File class
import java.io.FileNotFoundException; // Import this class to handle errors
import java.util.Scanner;             // Import the Scanner class to read text files

public class ReadFile {
    public static void main(String[] args) {
        File myObj = new File("filename.txt");

        // try-with-resources: Scanner will be closed automatically
        try (Scanner myReader = new Scanner(myObj)) {
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                System.out.println(data);
            }
        } 
        catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}

```

The output will be:

```
Hello World!
```

> **Explanation**: This program opens the file named `filename.txt` and reads it line by line using a `Scanner`. Each line is printed to the console. If the file cannot be found, the program will print `"An error occurred."` instead

#### Get File Information

To get more information about a file, use any of the `File` methods

```java
import java.io.File;  // Import the File class

public class GetFileInfo { 
    public static void main(String[] args) {
        File myObj = new File("filename.txt");
        if (myObj.exists()) {
            System.out.println("File name: " + myObj.getName());
            System.out.println("Absolute path: " + myObj.getAbsolutePath());
            System.out.println("Writeable: " + myObj.canWrite());
            System.out.println("Readable " + myObj.canRead());
            System.out.println("File size in bytes " + myObj.length());
        }
        else {
            System.out.println("The file does not exist.");
        }
    }
}

```

The output will be:

```
File name: filename.txt
Absolute path: C:\Users\MyName\filename.txt
Writeable: true
Readable: true
File size in bytes: 0
```

#### Other Ways to Read Files

- `Scanner` - best for **simple text** and when you want to parse numbers or words easily.
- `BufferedReader` - best for **large text files**, because it is faster and reads line by line.
- `FileInputStream` - best for **binary data** (images, audio, PDFs) or when you need full control of raw bytes.

### Delete Files

To delete a file in Java, use the `delete()` method

```java
import java.io.File;  // Import the File class

public class DeleteFile {
    public static void main(String[] args) { 
        File myObj = new File("filename.txt"); 
        if (myObj.delete()) { 
            System.out.println("Deleted the file: " + myObj.getName());
        } 
        else {
            System.out.println("Failed to delete the file.");
        } 
    } 
}

```

The output will be:

```
Deleted the file: filename.txt
```

#### Delete a Folder

You can also delete a folder. However, it must be empty

```java
import java.io.File; 

public class DeleteFolder {
    public static void main(String[] args) { 
        File myObj = new File("C:\\Users\\MyName\\Test"); 
        if (myObj.delete()) { 
            System.out.println("Deleted the folder: " + myObj.getName());
        } 
        else {
            System.out.println("Failed to delete the folder.");
        } 
    } 
}

```

The output will be:

```
Deleted the folder: Test
```




# Java OOP