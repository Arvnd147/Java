package simple;

import java.util.Scanner;
public class Nfibo {


	public static void main(String[] args) {
		
		/* Your class should be named Solution.
	 	* Read input as specified in the question.
	 	* Print output as specified in the question.
		*/

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
        sc.close();
		int a1 = 1;
		int a2 = 1;
		int a3 = 0;

		if(n==1 || n==2){
			System.out.println(1);
		}
		else{
			n-=2;
			for(int i=0;i<n;i++){
				a3 = a1 + a2;
                a1 = a2;
				a2 = a3;
			}
			System.out.println(a3);
		}
		// 1 1 2 3 5 8 13
	}

}

