class Solution {
    public String removeStars(String s) {
        StringBuilder c = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '*') {
                c.deleteCharAt(c.length() - 1);
            } else {
                c.append(s.charAt(i));
            }
        }
        return c.toString();
    }
}

/*
This code defines a function removeStars that takes a string s as input and returns a modified version of the input string with all asterisks (*) removed along with the preceding character.

Here is a step-by-step explanation of the code:

Initialize an empty list ans that will be used to build the modified string.
Loop through each character i in the input string s.
If the current character i is an asterisk, remove the last element from the ans list.
If the current character i is not an asterisk, add it to the end of the ans list.
Join the elements in the ans list into a string and return the result.
For example, if the input string is abc*d*ef*g*, the function would first create an empty list ans = []. Then, it would loop through each character in the string as follows:

i = 'a': append 'a' to ans (ans = ['a'])
i = 'b': append 'b' to ans (ans = ['a', 'b'])
i = 'c': append 'c' to ans (ans = ['a', 'b', 'c'])
i = '*': remove the last element from ans (ans = ['a', 'b'])
i = 'd': append 'd' to ans (ans = ['a', 'b', 'd'])
i = '*': remove the last element from ans (ans = ['a','b'])
i = 'e': append 'e' to ans (ans = ['a','b', 'e'])
i = 'f': append 'f' to ans (ans = ['a','b', 'e', 'f'])
i = '*': remove the last element from ans (ans = ['a','b', 'e'])
i = 'g': append 'g' to ans (ans = ['a','b', 'e', 'g'])
i== '*': remove the last element from ans (ans = ['a','b', 'e'])
Finally, the function would join the elements in ans into a string ('abe') and return the result.
*/
