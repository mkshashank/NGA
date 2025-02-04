/*Write a Java program to implement a HashMap that stores student roll numbers (Integer) as keys and their names (String) as values. Perform the following operations:
Insert five student records.
Retrieve and display the name of a student using a specific roll number.
Remove a student entry using a roll number.
Display all student records.*/
import java.util.*;
public class TestHashMap
{
	public static void main(String[] args)
	{
		Map<Integer,String> map = new HashMap<Integer,String>();
		map.put(1001,"Ramu");
		map.put(1002,"Lakshmu");
		map.put(1003,"Seetu");
		map.put(1004,"Shyamu");
		map.put(1005,"Bheemu");

		for(Map.Entry<Integer,String> entry : map.entrySet())
			System.out.println("Student roll no. : " + entry.getKey() + ", Student name : " + entry.getValue());

		map.remove(1004);
		System.out.println(map);
	}
}