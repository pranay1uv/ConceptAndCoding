package arrays;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class OccurencesOfelementBruteForce {
	        // The above array is the Input
			// I have to find out the occurences of each element in the above array
			// How to do that
			// Traverse through each and every element of the array
			// if array[i] == array[j] -- increment the count variable
			// after the inner loop is done, before going to outer loop again
			// use map to store the occurences of each element 
			// Finally after the entire nested loop is done 
			// Print all the values in the map
			
			// WHat is the concept behind this Boolean Array
			// I will create a boolean array of length input array
			// i will mark true for the jth index in our nested loop
			// why mark jth index as tru
			// becoz in outer loop when i get to the jth index i need run that operation
			// i will skip it

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] array = {1,2,3,4,2,3};
		int count = 1;
		boolean[] visited = new boolean[array.length];
		Map<Integer,Integer> map = new HashMap<>();
		
		for(int i = 0; i<array.length; i++) {
			if(visited[i] == true) {
				continue;
			}
			for(int j = i+1; j<array.length;j++) {
				if(array[i] == array[j]) {
					visited[j] = true;
					count++;
				}
			}
			System.out.println(array[i] +" "+ count);
			count = 1;
		}
	}

}
