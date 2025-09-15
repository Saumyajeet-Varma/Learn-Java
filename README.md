# Learn Java

## Table of Contents

- [Getting Started](#getting-started)

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