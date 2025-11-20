import java.util.*;
import java.util.stream.Collectors;


public class Solution {
    public static String reverseWords(String sentence) {

        // Replace this placeholder return statement with your code
         String[] words = sentence.trim().split("\\s+");
        
        // Reverse the array using streams and join with a single space
        return Arrays.stream(words)
                     .collect(Collectors.collectingAndThen(
                         Collectors.toList(), // Collect into a list
                         list -> {
                             java.util.Collections.reverse(list); // Reverse the list
                             return list.stream()
                                        .collect(Collectors.joining(" ")); // Join with single space
                         }
                     ));
    }
}
