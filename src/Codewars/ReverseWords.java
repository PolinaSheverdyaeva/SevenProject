package Codewars;

public class ReverseWords {
// needs to be finished
    public static void main(String[] args) {
        String input = "The greatest victory is that which requires no battle";
        String reversed = reverseWords(input);
        System.out.println(reversed);
    }

    public static String reverseWords(String str) {
        // Split the string into words using the space delimiter
        String[] words = str.split(" ");
        String res = "";

        for (int i = 0; i < words.length - 1; i++) {
            res += words[words.length - 1 + i];
            if (i < words.length - 1) res += " ";
        }
        return res;
    }
}

        // Create a StringBuilder to store the reversed words
//        StringBuilder reversed = new StringBuilder();


        // Iterate over the words array in reverse order
//        for (int i = words.length - 1; i >= 0; i--) {
        // Append each word to the StringBuilder followed by a space
//            reversed.append(words[i]).append(" ");



        // Convert the StringBuilder to a string and remove the trailing space
//        return reversed.toString().trim();
//    }



//}

