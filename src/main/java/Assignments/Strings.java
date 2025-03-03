package Assignments;

public class Strings {
//    Create a program to count vowels in a given string using string functions
    public static int countVowels(String str) {
        int count = 0;
        String vowels = "AEIOUaeiou";

        for (char ch : str.toCharArray()) {
            if (vowels.indexOf(ch) != -1) {
                count++;
            }
        }
        return count;
    }
//    Write a program to reverse the characters of a string.
public static String reverseString(String str) {
    char[] charArray = str.toCharArray();
    int left = 0, right = charArray.length - 1;
    while (left < right) {
        char temp = charArray[left];
        charArray[left] = charArray[right];
        charArray[right] = temp;
        left++;
        right--;
    }
    return new String(charArray);
}
//Write a program to reverse the words in a sentence.
public static String reverseWords(String sentence) {
    String[] words = sentence.split(" ");
    int left = 0, right = words.length - 1;
    while (left < right) {
        String temp = words[left];
        words[left] = words[right];
        words[right] = temp;
        left++;
        right--;
    }

    StringBuilder reversed = new StringBuilder();
    for (int i = 0; i < words.length; i++) {
        reversed.append(words[i]);
        if (i < words.length - 1) {
            reversed.append(" ");
        }
    }

    return reversed.toString();
}
//Write a program to validate email address (contains @ and proper domain format). Note: Don't use regular expressions
public static boolean validateEmail(String email) {
    int atIndex = email.indexOf('@');

    if (atIndex <= 0 || atIndex != email.lastIndexOf('@')) {
        return false;
    }

    String localPart = email.substring(0, atIndex);
    String domainPart = email.substring(atIndex + 1);

    int dotIndex = domainPart.indexOf('.');
    if (dotIndex <= 0 || dotIndex == domainPart.length() - 1) {
        return false;
    }

    return true;
}
//Write a program to capitalize the first letter of each words in a sentence.
public static String capitalizeWords(String sentence) {
    char[] charArray = sentence.toCharArray();
    boolean foundSpace = true;

    for (int i = 0; i < charArray.length; i++) {
        if (Character.isLetter(charArray[i])) {
            if (foundSpace) {
                charArray[i] = Character.toUpperCase(charArray[i]);
                foundSpace = false;
            }
        } else {
            foundSpace = true;
        }
    }

    return new String(charArray);
}

}
