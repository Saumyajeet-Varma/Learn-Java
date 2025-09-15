# Learn Java

## Table of Contents

- [Getting Started](#getting-started)

## Getting Started

In Java, every application begins with a class name, and that class must match the filename.

Every line of code that runs in Java must be inside a `class`. And the class name should always start with an uppercase first letter. In our example, we named the class **HelloWorld**.

**NOTE**: Java is case sensitive, `MyClass` and `myClass` has different meaning.

> The curly braces {} marks the beginning and the end of a block of code.
> `System` is a built-in Java class that contains useful members, such as `out`, which is short for "output". The `println()` method, short for "print line", is used to print a value to the screen (or a file). 
> You should also note that each code statement must end with a semicolon (`;`)

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
