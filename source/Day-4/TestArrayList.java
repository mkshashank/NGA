/*Write a Java program to create an ArrayList of integers. Perform the following operations:
Add five integer elements to the list.
Remove the third element.
Update the second element with a new value.
Display all the elements using a loop.
*/
import java.util.*;
public class TestArrayList
{
	public static void main(String[] args)
	{
		List<Integer> list = new ArrayList<Integer>();
		list.add(4);
		list.add(71);
		list.add(28);
		list.add(59);
		list.add(33);
		System.out.println(list);//[4, 71, 28, 59, 33]
		list.remove(2);
		System.out.println(list);//[4, 71, 59, 33]
		list.set(1,17);
		for(int x : list)
			System.out.print(x + " ");//4 17 59 33
	}
}