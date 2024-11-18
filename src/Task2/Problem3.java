package Task2;

import java.util.Scanner;

public class Problem3 {
        public static void main(String[] args) {
            String word;
            int ccount = 0;
            int vcount = 0;
            System.out.println("Enter the String");
            Scanner sc=new Scanner(System.in);
            word=sc.next();
//        word.matches()
            word = word.toLowerCase();
            for(int i=0;i<word.length();i++){
                if(word.charAt(i)=='a'||word.charAt(i)=='e'||word.charAt(i)=='i'||word.charAt(i)=='o'||word.charAt(i)=='u'){
                    vcount++;
                }else ccount++;
            }
            System.out.println("no. of vowels are:"+vcount);
            System.out.println("no. of consonents are:"+ccount);
        }
    }

