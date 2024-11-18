package Task8.Probelm1;

    public class Problem1 {
        public static void main(String[] args) {
            String str=null;
            String str1="67th";
            try{
//            int num= Integer.parseInt(str1);
//            System.out.println(num);
                System.out.println(str.length());
            }catch(NumberFormatException n){
                System.out.println("Not a number " +n.getMessage());
            }catch (NullPointerException nul) {
                System.out.println("It is null "+nul.getMessage());;
            }

        }
    }

//    public static void parseStringInteger(String str){
//        try{
//            if(str.equalsIgnoreCase("null"))
//                System.out.println("null pointer exception");
//            System.out.println(Integer.parseInt(str));
//        }catch(NullPointerException | NumberFormatException e ){
//            System.out.println(e.toString());
//        }
//    }
//
//    public static void main(String[] args){
//        parseStringInteger("16565346523");
//        parseStringInteger("Hii");
//        parseStringInteger(null);
//    }

//}
