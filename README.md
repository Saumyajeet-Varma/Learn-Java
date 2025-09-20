# Learn Java




## Table of Contents

- [Getting Started](#getting-started)
- [Data Types](#data-types)
- [Operators](#operators)
- [Strings](#strings)
- [Maths](#math)




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

> For code example - [src/module04/Maths.java](./src/module04/Maths.java)