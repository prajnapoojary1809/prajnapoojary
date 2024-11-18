package Task5;
public class Problem1 {
    public static void main(String[] args) {
        String str1="Hello";
        System.out.println("String:"+str1);//string

        StringBuilder str2 =new StringBuilder(str1);//converting string to stringBuffer
        str2.append(5);
        System.out.println("Converted String to StringBuilder:"+str2);//

        System.out.println("Converted StringBuilder to String:"+str2.toString());

        StringBuffer str3=new StringBuffer(str1);
        str3.reverse();

        System.out.println("Converted String to StringBuffer:"+str3);
        System.out.println("reverse:"+str3);

        System.out.println("StringBuffer to String:"+str3.toString());

    }
}

