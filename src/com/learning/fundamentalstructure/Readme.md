# Chapter 1 - Fundamental Structure of Java  
1. [A Simple Java Program](#a-simple-java-program)
2. [Comments](#Comments)
3. [Data Types](#data-types)
4. [Variables and Constants](#comments)
5. [Operators](#operators)
6. [Strings]()
7. Input and Output
8. Control Flow
9. Big Numbers 
10. Arrays

---

## A simple Java Program
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
## Comments 
Comments in Java, as in most programming languages, do not show up in the
executable program. Thus, you can add as many comments as needed without
fear of bloating the code.

Java has three ways of marking comments.

### Single Line Comment `//`.
The most common form is a `//`. Use this for a comment that runs from the `//` to the end
of the line.

```java
    System.out.println("We will not use 'Hello, World!'"); // is this too cute?
```

### Multiline Comment `/* */`
```java
/*
        This is multiline comment,
        I use this to comment on multiple lines
 */
    System.out.println("We will not use 'Hello, World!'"); // is this too cute?
```
### Generating Documentation `/** */`
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

## Data Types 
Java is a _strongly typed language_. This means that every variable must have
a declared type. There are **eight** **[primitive types]()** in Java. Four of them are
**[integer](#131-integer-types)** types; two are **[floating-point]()** number types; one is the **[character]()** type
`char`, used for code units in the Unicode encoding scheme  and one is a [boolean]() type for truth values.

### Integer Types
The `integer` types are for numbers without fractional parts. 
- Negative values are allowed. 
- Java provides the four `integer` types shown in the following table :

|Type      |Storage Requirement|Range                                                    |
|:---------|:------------------|:--------------------------------------------------------|
|`int`     |4 bytes            |-2,147,483648 to 2,147,483,647 (just over two billion)   |
|`short`   |2 bytes            |-32,768 to 32,677                                        |
|`long`    |8 bytes            |-9,233,372,036,854,775,808 to 9,233,372,036,854,775,807  |
|`byte`    |1 byte             |-128 to 127                                              |
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

### Floating-Point Types
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


### The char Type
The `char` type was originally intended to describe individual characters.
However, this is no longer the case. Nowadays, some Unicode characters can
be described with one `char` value, and other Unicode characters require two
`char` values.

Literal values of type `char` are enclosed in single quotes. For example, 'A' is
a character constant with value 65.

Escape Sequences for Special Characters

![img.png](img.png)

### The boolean Type
The `boolean` type has two values, `false` and `true`. It is used for evaluating
logical conditions. You cannot convert between `integers` and `boolean` values.


## Variables and Constants
As in every programming language, variables are used to store values.
Constants are variables whose values don’t change. In the following sections,
you will learn how to declare variables and constants.

### Declaring Variables
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

### Initializing Variables
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

### Constants
In Java, you use the keyword `final` to denote a constant.
- The keyword `final` indicates that you can assign to the variable once, and
  then its value is set once and for all.
- It is customary to name constants in all
  uppercase.
```java
public class Constants { 
    public static void main(String[] args) {
      final double CM_PER_INCH = 2.54;
      double paperWidth = 8.5;
      double paperHeight = 11;
      System.out.println("Paper size in centimeters: "
            + paperWidth * CM_PER_INCH + " by " + paperHeight *
            CM_PER_INCH);
    }
}
```
It is probably more common in Java to create a constant so it’s available to
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
Furthermore, if the constant is declared, as in this example, `public`, __methods
of other classes can also use it.__

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


## Operators
### Arithmetic Operators
The usual arithmetic operators `+`, `-`, `*`, `/` are used in Java for addition,
subtraction, multiplication, and division. The `/` operator denotes integer
division if both arguments are integers, and floating-point division otherwise.
Integer remainder (sometimes called _modulus_) is denoted by `%`. For example,
`15 / 2` is `7`, `15 % 2` is `1`, and `15.0 / 2` is `7.5`.

> 📝 Note that _integer division by `0` raises an exception_ whereas _floating-point
division by `0` yields_ an __infinite__ or `NaN` result.

### Mathematical Functions and Constants
The `Math` class contains an assortment of mathematical functions that you may
occasionally need, depending on the kind of programming that you do.

#### Methods and Fields in `Math` Class
1. Square root : `Math.sqrt()`
2. Raising a quantity to a power - `Math.pow(x,a)`
3. Trigonometric Functions 
   1. `Math.sin` 
   2. `Math.cos`
   3. `Math.tan`
   4. `Math.atan`
   5. `Math.atan2`
4. Exponential function - `Math.exp()`
5. Natural Logarithm - `Math.log()`
6. Decimal Logarithm - `Math.log10()`
7. Mathematical constants - `Math.PI` π , `Math.E` e

> The Math class provides several methods to make integer arithmetic safer.
The mathematical operators quietly return wrong results when a computation
overflows. For example, one billion times three (1000000000 * 3) evaluates
to -1294967296 because the largest int value is just over two billion. If you
call Math.multiplyExact(1000000000, 3) instead, an exception is generated.
You can catch that exception or let the program terminate rather than quietly
continue with a wrong result.


💡 There are also methods `addExact`,
`subtractExact`, `incrementExact`, `decrementExact`, `negateExact`, and
`absExact`, all with `int` and `long` parameters.

8. `Math.abs(double a)` : Returns the **absolute value** of a `double` value. 
Available Methods :   `abs(int a)`, `abs(float a)`, `abs(long a)`.
9. `Math.cbrt(double a)` : Returns the **cube root** of a `double` value.
10. `Math.floor(double a)` : Returns the largest (closest to positive infinity) `double` value that is less than or equal 
to the argument and is equal to a mathematical integer.
11. `Math.max()` : Returns the greater of two given values.
12. `Math.min()` : Returns the smaller of two double values.
13. `Math.random()` : Returns a `double` value with a positive sign, greater than or equal to 0.0 and less than 1.0. 
14. `Math.round(double a)` : Returns the closest `long` to the argument, with ties rounding to positive infinity.
Available Methods : `Math.round(float a)` Returns the closest `int` to the argument, with ties rounding to positive infinity.

... more 

### Conversion between Numeric Types
It is often necessary to convert from one numeric type to another.
When two values are combined with a binary operator (such as n + f where n
is an integer and f is a floating-point value), both operands are converted to a
common type before the operation is carried out.

- If either of the operands is of type double, the other one will be converted to
  a double.
- Otherwise, if either of the operands is of type float, the other one will be
  converted to a float. 
- Otherwise, if either of the operands is of type long, the other one will be
  converted to a long.
- Otherwise, both operands will be converted to an int.

### Casts
In the preceding section, you saw that int values are automatically converted
to `double` values when necessary. On the other hand, there are obviously times
when you want to consider a `double` as an `integer`. Numeric conversions are
possible in Java, but of course information may be lost. Conversions in which
loss of information is possible are done by means of casts. The syntax for
casting is to give the target type in parentheses, followed by the variable
name. For example: 

```java
    double x = 9.997;
    int nx = (int) x;
    // Now, the variable nx has the value 9 because casting a floating-point value to
    // an integer discards the fractional part.
```
If you want to round a floating-point number to the nearest integer (which in
most cases is a more useful operation), use the `Math.round` method:
```java
    double x = 9.997;
    int nx = (int) Math.round(x);
```
Now the variable `nx` has the value 10. You still need to use the cast `(int)`
when you call round. The reason is that the return value of the round method is
a `long`, and a `long` can only be assigned to an `int` with an `explicit` cast
because there is the possibility of information loss.

### Assignments 
Note that in Java, an assignment is an expression. That is, it has a value—
namely, the value that is being assigned. You can use that value—for example,
to assign it to another variable. Consider these statements:
```java
  int x = 1;
  int y = x += 4;
```
The value of `x += 4` is `5`, since that’s the value that is being assigned to `x`.
Next, that value is assigned to `y`.
