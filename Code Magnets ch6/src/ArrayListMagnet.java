/**
 * @author Jimmeh Camara
 * 
 * This exercise consisted of a bunch snippets of code that were mixed up and I had 
 * to reconstruct them and make the program produce a specific output.
 * 
 * @output: 
 * 			zero one two three  
			zero one three four  
			zero one three four 4.2  
			zero one three four 4.2 
 * 
 */

import java.util.*;
public class ArrayListMagnet {

	public static void main(String[] args) {
		
		ArrayList<String> a = new ArrayList<String>();
		a.add(0, "zero");
		a.add(1, "one");
		a.add(2, "two");
			
		a.add(3, "three");
		printAl(a);
		a.remove(2);
		
		if(a.contains("three")) {
			a.add("four");//index position not specified
		}printAl(a);
			
		if(a.indexOf("four") !=4) {
			a.add(4,"4.2");
			
		}printAl(a);
		if(a.contains("two")) {
			a.add("2.2");
		}
		 printAl(a);
	}
	
	public static void printAl(ArrayList<String> al) {//takes an array to iterate through
		//and perform a task
			
		for(String element : al) {
			System.out.print(element + " ");	
			
			}System.out.println(" ");		
	}
	
	
}
