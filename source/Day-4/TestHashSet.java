/*Write a Java program to create a HashSet of strings. Perform the following operations:Add five city names to the set, ensuring at least one duplicate entry.
Display the elements to show that duplicates are not allowed. Check if a particular city exists in the set.Remove a city and display the updated set.*/
import java.util.*;
public class TestHashSet
{
	public static void main(String[] args)
	{
		Set<String> set = new HashSet<String>();
		set.add("Bengaluru");
		set.add("Mysuru");
		set.add("Hyderabad");
		set.add("Chennai");
		set.add("Chennai");//duplicate
		System.out.println(set);//[Bengaluru, Chennai, Mysuru, Hyderabad]
		set.remove("Chennai");
		System.out.println(set);//[Bengaluru, Mysuru, Hyderabad]
	}
}