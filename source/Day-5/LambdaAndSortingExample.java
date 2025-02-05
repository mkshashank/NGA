/*Write a Java program that demonstrates the use of lambda expressions to sort a list of strings in reverse alphabetical order. Then, implement a functional interface StringProcessor
with a method process(String str) that takes a string and returns its uppercase version. Use this functional interface in conjunction with a lambda expression to process a list of
strings and print their uppercase forms. Hint: Use List.sort(), lambda expressions, and String::toUpperCase*/
import java.util.*;

public class LambdaAndSortingExample
{
    public static void main(String[] args)
    {
        List<String> words = Arrays.asList("Banana", "Apple", "Cherry", "Mango");

        words.sort((s1, s2) -> s2.compareTo(s1));
        System.out.println("Sorted list in reverse order: " + words);

        StringProcessor processor = str -> str.toUpperCase();

        List<String> upperCaseWords = words.stream()
                                           .map(processor::process)
                                           .toList();

        System.out.println("Uppercase list: " + upperCaseWords);
    }
}

@FunctionalInterface
interface StringProcessor
s{
    String process(String str);
}
