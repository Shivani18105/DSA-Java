package Functions;
import java.util.Scanner;
public class areaofcircle {
    public static void area(int r){
        double a=3.14*r*r;
        System.out.println("Area is :"+a);


    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter radius:");
        int r=sc.nextInt();
        area(r);

    }
}
