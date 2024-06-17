package patterns;
import java.util.Scanner;

public class Pattern1 {

    public static void nForest(int n) {
        // Write your code here
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        
    }
    public static void nForest2(int n) {
        // Write your code here
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i + 1; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void nTriangle(int n) {
        // Write your code here
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i + 1; j++) {
                System.out.print(j + 1 + " ");
            }
            System.out.println();
        }

    }
    public static void nTriangle2(int n) {
        // Write your code here
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i + 1; j++) {
                System.out.print(i + 1 + " ");
            }
            System.out.println();
        }
    }
    public static void seeding(int n) {
        // Write your code here
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }    
    public static void nNumberTriangle(int n) {
        // Write your code here
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i; j++) {
                System.out.print(j + 1 + " ");
            }
            System.out.println();
        }
    }
    public static void nStarTriangle(int n) {
        // Write your code here
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < 2 * i + 1; j++) {
                System.out.print("*");
            }
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print(" ");
            }
            System.out.println();
        }
    } 
    public static void nStarTriangle2(int n) {
        // Write your code here
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < 2 * (n -i)-1; j++) {
                System.out.print("*");
            }
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            System.out.println();
        }
    }
    public static void nStarDiamond(int n) {
        // Write your code here
        for(int i=0;i<n;i++){
            for(int j=0;j<n-i-1;j++){
                System.out.print(" ");
            }
            for(int j=0;j<2*i+1;j++){
                System.out.print("*");
            }
            for(int j=0;j<n-i-1;j++){
                System.out.print(" ");
            }
            System.out.println();
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<i;j++){
                System.out.print(" ");
            }
            for(int j=0;j<(2*n)-(2*i+1);j++){
                System.out.print("*");
            }
            for(int j=0;j<i;j++){
                System.out.print(" ");
            }
            System.out.println();
        }
    }    
    public static void rotatedTriangle(int n) {
        // Write your code here
        for (int i = 0; i <2*n-1 ; i++) {
            int stars = i+1;
            if (i+1>n) stars = 2*n -i-1 ;
            for (int j =0 ; j < stars ; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
    public static void nBinaryTriangle(int n) {
        // Write your code here.\
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i + 1; j++) {
                if (i % 2 == 0) {
                    if (j % 2 == 0)
                        System.out.print(1 + " ");
                    else
                        System.out.print(0 + " ");
                } else {
                    if (j % 2 == 0)
                        System.out.print(0 + " ");
                    else
                        System.out.print(1 + " ");
                }
            }
            System.out.println();
        }
        /* 
        int start = 1;for(
        for(int i = 0;i<n;i++)
        {
            if (i % 2 == 0)
                start = 1;
            else
                start = 0;
            for (int j = 0; j < i + 1; j++) {
                System.out.print(start + " ");
                start = 1 - start;
            }
            System.out.println();
        }
    */
    }
    public static void numberCrown(int n) {
        // Write your code here.
        for(int i=0;i<n;i++){
            for(int j=0;j<i+1;j++){
                 System.out.print(j+1+" ");
            }
            for(int j=0;j<4*(n-i)-2;j++){
                System.out.print(" ");
            }
            for(int j=0;j<i+1;j++){
                System.out.print(i+1-j+" ");
            }
            System.out.println();
        }
    }
    public static void nNumberTriangle2(int n) {
        // Write your code here
        int temp=0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i+1; j++) {
                System.out.print(++temp);
            }
            System.out.println();
        }
    }
    public static void nLetterTriangle(int n) {
        // Write your code here
        for (int i = 0; i < n; i++) {
            for (char ch = 'A'; ch <= 'A' + i; ch++) {
                System.out.print(ch + " ");
            }
            System.out.println();
        }
    }
    public static void nLetterTriangle2(int n) {
        // Write your code here
        for (int i = 0; i < n; i++) {
            for (char ch = 'A'; ch <= 'A' + n - i - 1; ch++) {
                System.out.print(ch + " ");
            }
            System.out.println();
        }
    }
    

    
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i=0; i<t;i++){
            int n = sc.nextInt();
            nLetterTriangle(n);
        }
        sc.close();
    }
}


