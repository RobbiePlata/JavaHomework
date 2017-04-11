/**
 * Robert Cyril Plata III
 */
import java.util.Random;
import java.util.Set;
public class ArraySorter{
	
	// Random Number Generator Object
	static Random rand = new Random();
	
	// Random Numbers Generated for alphabetical variables
	static int  a = rand.nextInt(100);
	static int  b = rand.nextInt(100);
	static int  c = rand.nextInt(100);
	static int  d = rand.nextInt(100);
	static int  e = rand.nextInt(100);
	static int  f = rand.nextInt(100);
	static int  g = rand.nextInt(100);
	static int  h = rand.nextInt(100);
	static int  i = rand.nextInt(100);
	static int  j = rand.nextInt(100);
	static int  k = rand.nextInt(100);
	static int  l = rand.nextInt(100);
	static int  m = rand.nextInt(100);
	static int  n = rand.nextInt(100);
	static int  o = rand.nextInt(100);
	static int  p = rand.nextInt(100);
	static int  q = rand.nextInt(100);
	static int  r = rand.nextInt(100);
	static int  s = rand.nextInt(100);
	static int  t = rand.nextInt(100);
	
	// Random Number Arrays
	static int[] set = {a, b, c, d, e, f, g, h, i, j};
	static int[] set2 = {k, l, m, n, o, p, q, r, s, t};
	static int[] set3 = {a, c, e, g, i, k, m, o, q, s};

	// Bubble Sort Algorithm
	public static void bubbleSort(int[] anArray){
		System.out.print("\nBubble Sort Algorithm\n");
		for (int index = 0; index < anArray.length - 1; index ++){
			for (int index2 = 0; index2 < anArray.length - 1; index2 ++){
				if (anArray[index2] > anArray[index2+1]){
					interchange(index2, index2 + 1, anArray);
				}
			}
		}
		printArray(anArray);
		System.out.println("");
	}
	
	// Selection Sort Algorithm
	public static void selectionSort(int[] anArray){
		System.out.print("\nSelection Sort Algorithm\n");
		for (int index = 0; index < anArray.length - 1; index ++)
		{   // Place the correct value in anArray[index]
			int indexOfNextSmallest = getIndexOfSmallest(index, anArray);
			interchange(index, indexOfNextSmallest, anArray);
		}
		printArray(anArray);
		System.out.println("");
	}
	
	// Insertion Sort Algorithm
	public static int[] insertionSort(int[] anArray){
		System.out.println("\nInsertion Sort Algorithm");
		for(int index = 1; index < anArray.length; index++){;
			for(int index2 = index; index2 >= 0; index2--){
				int smallest = getIndexOfSmallest(index2, anArray);
				interchange(smallest, index2, anArray);
			}
		}
		printArray(anArray);
		System.out.println("");
		return anArray;
	}
	
	// Print Curly Brace Array
	public static void printArray(int[] anArray){
		System.out.print("{ ");
		for(int i = 0; i < anArray.length; i++){
			System.out.print(anArray[i] + " ");
		}
		System.out.print("}");
		System.out.println("");
	}

	// Smallest Value in Index
	private static int getIndexOfSmallest(int startIndex, int[] a)
	{
		int min = a[startIndex];   
		int indexOfMin = startIndex;
		for (int index = startIndex + 1; index < a.length; index++)
		{
			if (a[index] < min)
			{
				min = a[index];
				indexOfMin = index;
			}
		}
		return indexOfMin;
	}
	
	// Overwrite Index Location
	private static void interchange(int i, int j, int[] a){
		int temp = a[i];
		a[i] = a[j];
		a[j] = temp; //original value of a[i]
	}
	
	public static void main(String[] args){
	
	System.out.println("Generated Random Set 1");

	printArray(set);
	bubbleSort(set);
	
	System.out.println("Generated Random Set 2");

	printArray(set2);
	selectionSort(set2);
	
	System.out.println("Generated Random Set 3");
	
	printArray(set3);
	insertionSort(set3);
	
	}
}