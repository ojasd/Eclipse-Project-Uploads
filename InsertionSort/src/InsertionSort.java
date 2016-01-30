import java.util.Scanner;


public class InsertionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n, i; 
		Scanner s = new Scanner(System.in);
		System.out.println("How many numbers to sort?");
		n = s.nextInt();
		int a[]= new int[n];
		System.out.println("Enter the numbers you want to sort");
		for(i=0; i<n; i++){
			a[i]= s.nextInt();	
		}
		sort(a);
		System.out.println("The sorted values are");
		for(i=0; i< n; i++){
			System.out.println(a[i]);
		}
	}

	private static void sort(int[] a) {
		// TODO Auto-generated method stub
		int j, i, key;
		int num = a.length;
			for (i = 1; i< num; i++) 
	        {
	            j = i;
	            key = a[i];    
	            while (j > 0 && key < a[j-1])
	            {
	                a[j] = a[j-1];
	                j = j-1;
	            }
	            a[j] = key;            
	        }    
		}
	}
