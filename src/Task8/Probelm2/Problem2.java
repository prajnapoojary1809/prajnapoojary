package Task8.Probelm2;

    public class Problem2 {
        public static void main(String[] args) {
            try{
                checkprice(4000);
            }catch (ArithmeticException e ){
                System.out.println(e.toString());
            }
        }
        public static void checkprice(Integer price) {
            if(price>5000){
                throw new ArithmeticException("price is not upto the level");
            }else{
                System.out.println("price is perfect");
            }

        }
    }

