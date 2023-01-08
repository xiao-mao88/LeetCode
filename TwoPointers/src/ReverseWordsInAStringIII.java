public class ReverseWordsInAStringIII {
    public static String reverseWords(String s) {
        String theString = "";
        String add = "";
        int count = 0;
        for(int i = 0; i<s.length(); i++){
            String newString = "";
            if(s.charAt(i) == ' '){
                for(int j = 0; j<i; j++){
                    if(!s.substring(i-j-1, i-j).equals(" ")){
                        newString += s.substring(i-j-1, i-j);
                    }
                    else{
                        j = i+1;
                    }
                }
                theString += newString + " ";
            }
        }
        int k=0;
        while(s.charAt(s.length() - k - 1) != ' '&& k<s.length()-1){
            add += s.substring(s.length()-k-1, s.length()-k);
            if(k==s.length()-2){
                add += s.substring(s.length()-k-2, s.length()-k-1);
            }
            k++;
        }
        s = theString + add;
        return s;
    }

    public static void main (String[] args){
        /*
        Given a string s, reverse the order of characters in each word within a sentence
        while still preserving whitespace and initial word order.

        Example 1:
        Input: s = "Let's take LeetCode contest"
        Output: "s'teL ekat edoCteeL tsetnoc"

        Example 2:
        Input: s = "God Ding"
        Output: "doG gniD"
         */
        String test1 = "Let's take LeetCode contest";
        String test2 = "God Ding";
        String test3= "hehhhhhhe";

        System.out.println(reverseWords(test1));
        System.out.println(reverseWords(test2));
        System.out.println(reverseWords(test3));
    }
}
