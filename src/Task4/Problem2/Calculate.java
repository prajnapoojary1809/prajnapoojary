package Task4.Problem2;

public class Calculate {
        public void numbers(int num1,int num2){
            System.out.println("number1:" +num1+ "\n"  +"number2:"+num2);

        }
        public void show(String S1,String S2){
            System.out.println("String:" +S1+S2);
        }
    }
    class Number extends Calculate{
        public void numbers(int num1,int num2,int num3){//overload
            System.out.println("number1:" +num1+ "\n" +"number2:" +num2+ "\n" +"number3:" +num3);
        }
    }
    class Word extends Calculate{
        @Override public void show(String S1, String s2){
            System.out.println("String:" +S1);//override
        }
    }

