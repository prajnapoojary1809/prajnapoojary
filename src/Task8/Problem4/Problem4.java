package Task8.Problem4;

    class InvalidAgeException extends ArithmeticException{
        public InvalidAgeException(String string){
            super(string);
        }
    }
    public class Problem4 {
        public static void checkAge(int age){
            try{
                if(age >0 && age<120){
                    System.out.println("Valid age");

                } else
                    throw new InvalidAgeException("Invalid age");
            }
            catch (ArithmeticException e) {
                System.out.println(e.toString());
            }
        }
        public static void main(String[] args) {
            checkAge(125);

        }
    }

