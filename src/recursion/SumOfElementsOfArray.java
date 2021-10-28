package recursion;

public class SumOfElementsOfArray {

	public static void main(String[] args) {
		int[] n={1,2,3,4};
		System.out.println(sumElement(n,3));

	}
	static int sumElement(int arr[],int n)
	{
	    //Your code here
		if(n-1<=0) return 0;
	    return arr[n]+ sumElement(arr,n-1);
	}

}
