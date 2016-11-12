package day5;

public class ArraysExample1 {

	
	public static void main(String[] args) {
		int[] a={30,40,10,50};
		int sum=0;
		for(int i=0;i<a.length;i++)
		{
			sum=sum+a[i];
		}
		System.out.println("The total sum of all elements in array is "+sum);
	}

}
