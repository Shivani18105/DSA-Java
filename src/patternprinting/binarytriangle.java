package patternprinting;
import java.util.Scanner;
//1
//01
//101
//0101

public class binarytriangle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter n:");
        int n=sc.nextInt();


        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                if(i%2==1){
                    if(j%2==1){
                        System.out.print("1"+ " ");
                    }
                    else{
                        System.out.print("0"+ " ");
                    }
                }else{
                    if(i%2==0 && j%2==0){
                        System.out.print("1"+ " ");
                    }
                    else{
                        System.out.print("0" + " ");
                    }
                }



            }
            System.out.println();
        }

    }
}
