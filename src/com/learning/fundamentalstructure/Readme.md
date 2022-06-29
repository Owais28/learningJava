# Chapter 1 - Fundamental Structure of Java  
1. [A Simple Java Program](#11-a-simple-java-program)
2. [Comments](#12-comments)
3. [Data Types](#13-data-types)
4. [Variables and Constants](#14-variables-and-constants)
5. OperatorsK
6. Strings
7. Input and Output
8. Control Flow
9. Big Numbers 
10. Arrays

---

## 1.1 A simple Java Program
This is a very simple java program that prints a message to console. This program consist of a [class]() `SimpleJavaProgram`,
a [variable]() `greetings` of type [String]() and a [method]() `main`.
```java
// SimpleJavaProgram.java
public class SimpleJavaProgram {
    public static void main(String[] args) {
        String greetings = "Hello World";  // variable
        System.out.println(greetings); // printing on console
    }
}
// Hello World
```
General Program Structure :
```
public class ClassName {
        public static void main(String[] args){
            program statements
    }
}
```
## 1.2 Comments 
Comments in Java, as in most programming languages, do not show up in the
executable program. Thus, you can add as many comments as needed without
fear of bloating the code.

Java has three ways of marking comments.

### 1.2.1 Single Line Comment `//`.
The most common form is a `//`. Use this for a comment that runs from the `//` to the end
of the line.

```java
    System.out.println("We will not use 'Hello, World!'"); // is this too cute?
```

### 1.2.2 Multiline Comment `/* */`
```java
/*
        This is multiline comment,
        I use this to comment on multiple lines
 */
    System.out.println("We will not use 'Hello, World!'"); // is this too cute?
```
### 1.2.3 Generating Documentation `/** */`
Finally, a third kind of comment is used to generate documentation
automatically.

```java
/**
* This is the first sample program in Core Java Chapter 3
* @version 1.0.0 2022-06-24
* @author Owais Athar
*/
public class FirstSample {
    public static void main(String[] args) {
        System.out.println("We will not use 'Hello, World!'");
    }
}
```

## 1.3 Data Types 
Java is a _strongly typed language_. This means that every variable must have
a declared type. There are **eight** **[primitive types]()** in Java. Four of them are
**[integer](#131-integer-types)** types; two are **[floating-point]()** number types; one is the **[character]()** type
`char`, used for code units in the Unicode encoding scheme  and one is a [boolean]() type for truth values.

### 1.3.1 `Integer` Types
The `integer` types are for numbers without fractional parts. 
- Negative values are allowed. 
- Java provides the four `integer` types shown in the following table :

|Type|Storage Requirement|Range|
| --- | --- |---|
|`int`|4 bytes|-2,147,483648 to 2,147,483,647 (just over two billion)|
|`short`|2 bytes|-32,768 to 32,677 |
|`long`|8 bytes|-9,233,372,036,854,775,808 to 9,233,372,036,854,775,807 |
|`byte`|1 byte|-128 to 127|
- Long `integer` numbers have a suffix `L` or `l` (for example, `4000000000L`).
- Hexadecimal numbers have a prefix `0x` or `0X` (for example, `0xCAFE`).
- Octal numbers have a prefix `0` (for example, `010` is 8).
- You can write numbers in binary, with a prefix `0b` or `0B`. For example, `0b1001`
  is 9.
- You can add underscores to number literals, such as 1_000_000 (or
  0b1111_0100_0010_0100_0000) to denote one million. The underscores are for
  human eyes only. The Java compiler simply removes them.


> ⚠️ Under Java, the ranges of the `integer` types do not depend on the machine on
which you will be running the Java code.

### 1.3.2 Floating-Point Types
The floating-point types denote numbers with fractional parts.
- `float` - 4 bytes
- `double` - 8 bytes

- Numbers of type `float` have a suffix `F` or `f `(for example, `3.14F`).
- Floating-point numbers without an `F` suffix (such as 3.14) are always considered 
to be of type `double`.
- You can optionally supply the `D` or `d` suffix (for example, `3.14D`).

> ⚠️ **Cuation :** Floating-point numbers are not suitable for financial calculations in which
roundoff errors cannot be tolerated. For example, the command
System.out.println(2.0 - 1.1) prints 0.8999999999999999, not 0.9 as you
would expect. Such roundoff errors are caused by the fact that floating-point
numbers are represented in the binary number system. There is no precise
binary representation of the fraction 1/10, just as there is no accurate
representation of the fraction 1/3 in the decimal system. If you need precise
numerical computations without roundoff errors, use the BigDecimal class,
which is introduced later in this chapter


### 1.3.3 The `char` Type
The `char` type was originally intended to describe individual characters.
However, this is no longer the case. Nowadays, some Unicode characters can
be described with one `char` value, and other Unicode characters require two
`char` values.

Literal values of type `char` are enclosed in single quotes. For example, 'A' is
a character constant with value 65.

Escape Sequences for Special Characters

![img.png](img.png)

### 1.3.5 The boolean Type
The `boolean` type has two values, `false` and `true`. It is used for evaluating
logical conditions. You cannot convert between `integers` and `boolean` values.


## 1.4 Variables and Constants
As in every programming language, variables are used to store values.
Constants are variables whose values don’t change. In the following sections,
you will learn how to declare variables and constants.

### 1.4.1 Declaring Variables
In Java, every variable has a type. You declare a variable by placing the type
first, followed by the name of the variable. Here are some examples:
```java
double salary;
int vacationDays;
long earthPopulation;
boolean done;
```

- The identifier for a variable name (as well as for other names) is made up of
  letters, digits, currency symbols, and “punctuation connectors”. The first
  character cannot be a digit.
- Symbols like '+' or '©' cannot be used inside variable names, nor can
  spaces. 
- Letter case is significant: `main` and `Main` are distinct identifiers.
- The length of an identifier is essentially unlimited.

> 💡 **Note :** The terms “letter,” “digit,” and “currency symbol” are much broader in Java
than in most languages. A letter is any Unicode character that denotes a letter
in a language. For example, German users can use umlauts such as 'ä' in
variable names; Greek speakers could use a π. Similarly, digits are 0–9 and
any Unicode characters that denote a digit. Currency symbols are $, €, ¥, and
so on. Punctuation connectors include the underscore character _, a “wavy
low line” , and a few others. In practice, most programmers stick to A-Z, a-z,
0-9, and the underscore _.

> ✅ **Tip :** Even though $ is a valid character in an identifier, you should not use it in
your own code. It is intended for names that are generated by the Java
compiler and other tools

- You also cannot use a Java keyword such as `class` as a variable name.
- You can declare multiple variables on a single line:
```java
int i, j; // both are integers
```
_However, I don’t recommend this style. If you declare each variable
separately, your programs are easier to read._

### 1.4.2 Initializing Variables
After you declare a variable, you must explicitly initialize it by means of an
assignment statement—you can never use the value of an uninitialized
variable.
```java
int vacationDays;
System.out.println(vacationDays); // ERROR--variable not
initialized
```
You assign to a previously declared variable by using the variable name on
the left, an equal sign (=), and then some Java expression with an appropriate
value on the right.

```java
int vacationDays;
vacationDays = 12;
```

You can both declare and initialize a variable on the same line. For example:
```java
int vacationDays = 12;
```

⭐ Starting with Java 10, you do not need to declare the types of local variables
if they can be inferred from the initial value. Simply use the keyword `var`
instead of the type:
```java
var vacationDays = 12; // vacationDays is an int
var greeting = "Hello"; // greeting is a String
```

### 1.4.3 Constants
In Java, you use the keyword `final` to denote a constant.
- The keyword `final` indicates that you can assign to the variable once, and
  then its value is set once and for all.
- It is customary to name constants in all
  uppercase.
- It is probably more common in Java to create a constant so it’s available to
  multiple methods inside a single class. These are usually called `class
  constants`.

Set up a class constant with the keywords static final. Here is an example  of using a class constant:
```java
public class Constants2 {
  public static final double CM_PER_INCH = 2.54;
  public static void main(String[] args) {
    double paperWidth = 8.5;
    double paperHeight = 11;
    System.out.println("Paper size in centimeters: "
    + paperWidth * CM_PER_INCH + " by " + paperHeight *
  CM_PER_INCH);
  }
}
```
> 💡 Note that the definition of the class constant appears outside the main method.
Thus, the constant can also be used in other methods of the same class.
Furthermore, if the constant is declared, as in this example, `public`, methods
of other classes can also use it.

### 1.4.4 Enumerated Types
Sometimes, a variable should only hold a restricted set of values. For
example, you may sell clothes or pizza in four sizes: small, medium, large,
and extra large. Of course, you could encode these sizes as integers 1, 2, 3, 4
or characters S, M, L, and X. But that is an error-prone setup. It is too easy for a variable to
hold a wrong value (such as 0 or m).

You can define your own _enumerated type_ whenever such a situation arises.

An enumerated type has a finite number of named values. For example,
```java
enum Size { SMALL, MEDIUM, LARGE, EXTRA_LARGE };
```
Now you can declare variables of this type:
```java
enum Size { SMALL, MEDIUM, LARGE, EXTRA_LARGE };
Size s = Size.MEDIUM;
```
A variable of type `Size` can hold only one of the values listed in the type
declaration, or the special value `null` that indicates that the variable is not set
to any value at all.


<button type="button" name="button" class=".btn .btn-purple">Edit This</button>