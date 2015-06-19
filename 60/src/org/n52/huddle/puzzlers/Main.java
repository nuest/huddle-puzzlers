package org.n52.huddle.puzzlers;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    /**
     * Puzzle 60: One-Liners: (A) and (B)
    */
    public static void main(String[] args) {
        List<String> input = Arrays.asList(new String[] { "spam", "sausage", "spam", "spam", "bacon", "spam", "tomato", "spam" } );
        
        List<String> output = sameOrderElementsWithSecondAndSubsequentDuplicatesRemoved(input);
        System.out.println("Cleaned up list: " + Arrays.toString(output.toArray()));
        
        System.out.println("Simple toString(): " + Arrays.toString(new Object[] { input, input.toArray(), new Object[] { new Object() } }));
        
        System.out.print("Better ...: ");
        printMultidimensionalArray(new Object[] { input, input.toArray(), new Object[] { new Object() } });
    }   
    
    private static List<String> sameOrderElementsWithSecondAndSubsequentDuplicatesRemoved(List<String> original) {
        // Set does not preserve order
//        return new ArrayList<String>(new LinkedHashSet<String>(original)); // maintains order at near hashmap performance
        
        // how to do it in Java 8 ???
        return original.stream().distinct().collect(Collectors.toList());
        
        // how with Guava?
//        return ImmutableList.copyOf(Sets.newLinkedHashSet(...))
    }

    private static void printMultidimensionalArray(Object[] input) {
        System.out.println(Arrays.deepToString(input));
    }
    
}
