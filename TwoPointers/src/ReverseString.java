import java.util.Arrays;

public class ReverseString {
    public static void reverseString(char[] s) {
        for(int i = 0; i<(s.length/2); i++){
            char temp = s[i];
            s[i] = s[s.length-1-i];
            s[s.length-1-i] = temp;
        }

        System.out.println(Arrays.toString(s));
    }

    public static void main (String args[]){
        /*
        Write a function that reverses a string. The input string is given as an array of characters s.
        You must do this by modifying the input array in-place with O(1) extra memory.

        Example 1:
        Input: s = ["h","e","l","l","o"]
        Output: ["o","l","l","e","h"]

        Example 2:
        Input: s = ["H","a","n","n","a","h"]
        Output: ["h","a","n","n","a","H"]
         */

        char[] test1 = {'h','e','l','l','o'};
        char[] test2 = {'H','a','n','n','a','h'};

        reverseString(test1);
        reverseString(test2);
    }
}
