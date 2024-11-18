package Task2;

import java.util.Scanner;

public class Problem4 {
        static void letterCheck(char ch) {
            if(ch<'a'||ch>='z'){
                System.out.println("invalid input");
            }
            switch (ch) {
                case 'a', 'e', 'i', 'o', 'u':
                    System.out.println("its a vowel");
                    break;
                default:
                    System.out.println("its a consonent");
            }
        }

        public static void main(String[] args){
            Scanner sc=new Scanner(System.in);

            System.out.println("enter a character");
            char letter = sc.next().toLowerCase().charAt(0);
            letterCheck(letter );
        }
    }

