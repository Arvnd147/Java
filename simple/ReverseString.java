package simple;

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nn = sc.nextInt();
        sc.nextLine();
        for(int i=0; i<nn; i++){
            String str = sc.nextLine();
            char[] chr = str.toCharArray();
            int n = chr.length;
            char[] temp = new char[n];
            int j=0 ;
            while(n>0){
                if(Character.isLetter(chr[n-1]))
                    temp[j++]=chr[n-1];
                n--;
            }
            int k=0;
            while(k<chr.length){
                if (Character.isWhitespace(chr[k])){
                    System.out.print(" ");
                    System.out.print(temp[k]);
                }else{
                    System.out.print(temp[k]);
                }
                k++;
            }
            System.out.println();
        }
        sc.close();
    }
}