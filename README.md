<div align="center">

# 🚀 STEP-SEM-3

### Java Control Flow — Level 3 Practice Programs
*Loops · Break Statements · Nested Conditions*

![Java](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white)
![Status](https://img.shields.io/badge/Status-Completed-brightgreen?style=for-the-badge)
![CodInClub](https://img.shields.io/badge/CodInClub-BridgeLabz-blueviolet?style=for-the-badge)

</div>

---

## 📖 About

This repository contains solutions to the **Category C** problem set from CodInClub (powered by BridgeLabz) — five programs that combine loops, `break` statements, and control flow logic to solve classic computer science problems.

---

## 🗂️ Programs

<table>
<tr>
<th>#</th>
<th>Program</th>
<th>File</th>
<th>Concept</th>
</tr>

<tr>
<td>1️⃣</td>
<td><b>Prime Number Checker</b><br><sub>Determines whether an input number is prime</sub></td>
<td><code>primenumber.java</code></td>
<td><code>for</code> loop + <code>break</code></td>
</tr>

<tr>
<td>2️⃣</td>
<td><b>Star Pattern Printer</b><br><sub>Draws a right-angled triangle of stars</sub></td>
<td><code>starpattern.java</code></td>
<td>Nested <code>for</code> loops</td>
</tr>

<tr>
<td>3️⃣</td>
<td><b>Palindrome Checker</b><br><sub>Checks if a number reads the same forwards and backwards</sub></td>
<td><code>palindrome.java</code></td>
<td><code>while</code> loop, digit reversal</td>
</tr>

<tr>
<td>4️⃣</td>
<td><b>GCD Finder</b><br><sub>Finds the Greatest Common Divisor of two numbers</sub></td>
<td><code>greatestcommondivisor.java</code></td>
<td>Euclidean Algorithm</td>
</tr>

<tr>
<td>5️⃣</td>
<td><b>Armstrong Number Checker</b><br><sub>Checks if a number equals the sum of the cubes of its digits</sub></td>
<td><code>armstrong.java</code></td>
<td><code>while</code> loop, digit cubing</td>
</tr>

<tr>
<td>🎮</td>
<td><b>Rock Paper Scissors</b><br><sub>Bonus — a simple interactive game</sub></td>
<td><code>rockpaperscissor.java</code></td>
<td><code>switch</code> / conditionals</td>
</tr>

</table>

---

## ⚙️ How to Run

```bash
# Compile
javac primenumber.java

# Run
java primenumber
```

Swap `primenumber` for any other filename (without `.java`) to run a different program.

---

## 🧠 Sample Output

<table>
<tr><td>

**Prime Check**
```
enter number: 17
Is the number 17 a Prime Number true
```

</td><td>

**Star Pattern**
```
rows  5
# 
# # 
# # # 
# # # # 
# # # # # 
```

</td></tr>
<tr><td>

**Palindrome**
```
Number 121
Is the number 121 a Palindrome? true
```

</td><td>

**GCD**
```
Enter first number 36
Enter second number 60
The GCD of 36 and 60 is 12
```

</td></tr>
</table>

---

## 📝 Notes

> ⚠️ `armstrong.java` cubes each digit (matches the classic `153 = 1³ + 5³ + 3³` example) rather than raising to the power of the digit count — correct for 3-digit numbers, but won't generalize to other digit lengths.

---

<div align="center">

### 🏫 Submitted as part of Programming Fundamentals — Week 3
**CodInClub · Powered by BridgeLabz**

</div>
