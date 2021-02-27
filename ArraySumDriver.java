/**
 * 
 * @author Constance
 *
 */

public class ArraySumDriver {
	private final static int ARRAY_SIZE = 6;

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int index = 0;

		Integer[] myArray = new Integer[ARRAY_SIZE];
		
		myArray[index++] = 13;
		myArray[index++] = 5;
		myArray[index++] = 12;
		myArray[index++] = 6;
		
		int sum = sumOfArray(myArray, 3);
		System.out.println(sum);
		
		myArray[index++] = 7;
		myArray[index++] = 1;

		sum = sumOfArray(myArray, 5);
		System.out.println(sum);
		
		int f = 8;
		System.out.println(recursiveFibonacci(f));
		Integer[] fibArray = new Integer[f+1];
		
		System.out.println(dynamicFibonacci(8, fibArray));
		
		
		for(int i: fibArray) {
			System.out.print(i+" ");
		}
	}
	
	/**
	 * Recursive method for generating sum of values in array

	 * @param arr array of Integers
	 * @param num index of array to sum all previous index values (including num)
	 * @return sum of array values
	 */
	public static <T extends Integer> int sumOfArray(T[] arr, T num) {
		
		if(num > 0) {
			return sumOfArray(arr, num-1) + arr[num];
		}
		else {
			return arr[num] +num; 
		}
	}
	public static int recursiveFibonacci(int num) {
		if(num <=1) {
			return 1;
		}
		else 
			return recursiveFibonacci(num-1) + recursiveFibonacci(num-2);
	}
	public static int dynamicFibonacci(int num, Integer[] array) {
		int answer = 0;
		
		if(array[num] != null) {
			return array[num];
		}
		else if(num <=1) {
			array[num] = 1;
			return 1;
		}
		else {
			answer= dynamicFibonacci(num-1, array) + dynamicFibonacci(num-2, array);
			array[num] = answer;
		}
		return answer;
	}

}