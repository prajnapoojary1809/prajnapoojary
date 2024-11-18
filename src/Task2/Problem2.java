package Task2;

import java.util.Scanner;

public class Problem2 {
    public class CollatzConjecture {
        public static void main(String[] args){
            System.out.println("Enter the number:");
            Scanner sc= new Scanner(System.in);
            int n=sc.nextInt();
            while(n>0){
                if(n%2==0){
                    n=n/2;
                }else n=n*3+1;
                System.out.println(n);
                if(n==1){
                    break;
                }
            }
        }
    }
}
