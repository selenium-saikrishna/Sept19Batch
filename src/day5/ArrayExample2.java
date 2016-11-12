package day5;

public class ArrayExample2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[] a={30,90,80,70};
		int max=0;
		for(int i=0;i<a.length;i++)
		{
			if(max<a[i])
			{
				max=a[i];
			}
		}
		System.out.println("Maximum value is "+max);

	}

}
