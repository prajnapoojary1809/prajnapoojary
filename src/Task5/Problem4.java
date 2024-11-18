package Task5;

public class Problem4 {
        public static void main(String[] args) {
            String str=" prajna";
            int count=3;
            System.out.println("Repeat:"+str.repeat(count));
            System.out.println("Concat:"+str.concat("poojary"));
            System.out.println("Trim:"+str.trim());
            System.out.println("replace:"+str.replace(" p","P"));

            StringBuilder str1=new StringBuilder(str);
            System.out.println("Append:"+str1.append(" "+"Poojary"));
            System.out.println("lastIndexOf:"+str1.lastIndexOf("o"));
            System.out.println("Length:"+str1.length());
            System.out.println("String:"+str1.toString());

            StringBuffer str2=new StringBuffer(str);
            System.out.println("Append:"+str2.append("Hi"));
            System.out.println("charAt(4):"+str2.charAt(4));
            System.out.println("delete:"+str2.delete(7,9));
            System.out.println("String:"+str2.toString());

        }
    }

