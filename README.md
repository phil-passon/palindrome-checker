# 🪞 PalindromeChecker

**Package:** `com.philpasson.pp.palindromechecker`

A simple Java class for checking if a string is a **palindrome** (reads the same forwards and backward).

## 🎯 Purpose

I created this project to practice fundamental Java concepts and algorithm design, specifically in preparation for upcoming university assignments/examinations.

## ✨ Features

* **Case-Insensitive:** Checks are performed on the lowercase version of the input, so "Madam" and "madam" are both recognized as palindromes.
* **Simple API:** Includes a single, easy-to-use static method.

## 🚀 How to Use

Call the `isPalindrome` method with any string you want to check.

```java
import com.philpasson.pp.palindromechecker.PalindromeChecker;

public class Example {
    public static void main(String[] args) {
        // Returns true (Case-insensitive check)
        String word1 = "Level"; 
        System.out.println("'" + word1 + "' is a palindrome: " + PalindromeChecker.isPalindrome(word1)); 

        // Returns false
        String word2 = "Algorithm"; 
        System.out.println("'" + word2 + "' is a palindrome: " + PalindromeChecker.isPalindrome(word2)); 
    }
}
```
# ⚠️ Note on Checking
The current implementation performs a strict character check:

It does not ignore spaces or punctuation.

Example: "race car" will return false.

For more complex phrase palindromes, you would need to modify the code to filter out non-alphanumeric characters.
I will still probably do this but I had to focus on other classes as well.
