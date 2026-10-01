# Java Notes — Strings

## 1. String Pool

The **String Pool** (String Constant Pool) is a special area in the JVM's heap memory where Java stores **String literals**.

String literals are reused whenever the same literal already exists in the pool. This helps avoid creating duplicate String objects.

### Example

```java
String s1 = "Java";
String s2 = "Java";
```

Both `s1` and `s2` refer to the same `"Java"` String object in the String Pool.

```java
System.out.println(s1 == s2);
```

Output:

```text
true
```

> `==` compares the references of the objects, while `equals()` compares their contents.

---

## 2. How String Literals Are Stored in the String Pool

Suppose we write:

```java
String s1 = "Java";
String s2 = "Python";
String s3 = "Java";
```

Conceptually:

```text
String Pool

┌─────────┐
│ "Java"  │ ← s1
└─────────┘
     ↑
     └──── s3

┌──────────┐
│ "Python" │ ← s2
└──────────┘
```

When Java encounters `"Java"` again, it reuses the existing String object from the pool.

---

## 3. Same Literal in Multiple Variables

When the same String literal is assigned to multiple variables, the variables can refer to the same String object.

```java
String s1 = "Java";
String s2 = "Java";

System.out.println(s1 == s2);
```

Output:

```text
true
```

This happens because `"Java"` already exists in the String Pool.

---

## 4. Creating a String Using `new String()`

```java
String str = new String("Java");
```

Using `new String()` explicitly creates a **new String object**.

Example:

```java
String s1 = "Java";
String s2 = new String("Java");

System.out.println(s1 == s2);
System.out.println(s1.equals(s2));
```

Output:

```text
false
true
```

### Why?

```text
String Pool
┌─────────┐
│ "Java"  │ ← s1
└─────────┘

Heap
┌─────────┐
│ "Java"  │ ← s2
└─────────┘
```

- `s1` refers to the `"Java"` object in the String Pool.
- `s2` refers to a separate String object created using `new`.
- Both contain the same characters, so `equals()` returns `true`.
- They are different objects, so `==` returns `false`.

---

## 5. Creating a String Using `char[]`

A String can also be created from a character array.

```java
char[] arr = {'J', 'a', 'v', 'a'};

String str = new String(arr);

System.out.println(str);
```

Output:

```text
Java
```

The `new String(char[])` constructor converts the character array into a String.

### Example

```java
char[] arr = {'a', 'b', 'c', 'd'};

String str = new String(arr);

System.out.println(str);
```

Output:

```text
abcd
```

---

## 6. Common Ways to Create a String

### Using a String literal

```java
String str1 = "Java";
```

### Using `new String()`

```java
String str2 = new String("Java");
```

### Using a character array

```java
char[] arr = {'J', 'a', 'v', 'a'};
String str3 = new String(arr);
```

---

## Key Points

- **String Pool** stores String literals.
- String literals with the same value can be **reused** from the pool.
- `String s1 = "Java";` uses the String Pool.
- `String s2 = new String("Java");` creates a new String object.
- `==` compares **references**.
- `equals()` compares **String contents**.
- A `char[]` can be converted into a String using `new String(char[])`.
