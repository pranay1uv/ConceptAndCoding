package arrays; 
public class ReverseArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = {1,2,3,4,5};
		int length = array.length;
		int[] reverseArrayPrint = reverseArray(array,0,length-1);
		for(int element : reverseArrayPrint) {
			System.out.print(element+" ");
		}
	}
	
	static int temp = 0;
	public static int[] reverseArray(int[] array, int start, int end) {
        if(start<end) {
        	temp = array[start];
        	array[start] = array[end];
        	array[end] = temp;
        	reverseArray(array,start+1,end-1);
        }
		return array;
	}
}
