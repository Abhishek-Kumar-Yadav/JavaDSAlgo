package pattern;
import java.util.Scanner;



public class Pattern2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
			for(int j=0;j<1;j++) {
				System.out.print("* ");
			}
			System.out.println();
			for(int j=1;j<=n-2;j++) {
				for(int k=0;k<1;k++)
					System.out.print("* ");
				
				for(int k=1;k<j;k++)
					System.out.print("  ");
				
				for(int k=0;k<1;k++)
					System.out.print("* ");
				System.out.println();
			}
			if(n>1)
			for(int j=0;j<n;j++) {
				System.out.print("* ");
			}
		sc.close();

	}

}
