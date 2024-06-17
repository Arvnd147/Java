package simple;
import java.util.Scanner;

public class Product {
    String name;
    int id;
    int price;
    static Scanner sc = new Scanner(System.in);
    void getData(){
        name = sc.next();
        id = sc.nextInt();
        price = sc.nextInt();
    }
    static void search(String sname,Product p[],int n){
        for(int i=0;i<n;i++){
            if(sname.equals(p[i].name)){
                System.out.println("Found");
                break;
            }
            if(i==n-1){
                System.out.println("Not Found");
            }
        }
    }
    public static void main(String[] args) {
        int n = sc.nextInt();
        Product p[] = new Product[n];
        for(int i=0;i<n;i++){
            p[i] = new Product();
            p[i].getData();
        }
        while(true){
            String sname = sc.next();
            if(sname.equalsIgnoreCase("exit"))
                break;
            search(sname, p, n);
        }
    }
}