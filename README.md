# Learn Java




## Table of Contents

- [Getting Started](#getting-started)
- [Data Types](#data-types)
- [Operators](#operators)
- [Strings](#strings)
- [Maths](#math)
- [Conditinal Statements](#conditional-statements)




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

### The var Keyword

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

There is also a `for-each` loop, which is used exclusively to loop through elements in an `array` (or other data structures)

#### Syntax

```java
for (type variableName : arrayName) {
    // code block to be executed
}

```

> The `for-each` loop is simpler and more readable than a regular `for` loop, since you don't need a counter (like `i < array.length`).

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

| Keyword   | Description                                   | Effect in Loop                         |
|-----------|-----------------------------------------------|----------------------------------------|
| `break`   | Stops the loop completely                     | Exits the loop immediately             |
| `continue`| Skips the current iteration and continues loop| Moves to the next iteration of the loop|

