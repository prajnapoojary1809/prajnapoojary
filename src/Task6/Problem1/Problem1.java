package Task6.Problem1;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Problem1 {

        public static void main(String[] args) {

            ArrayList<String> array = new ArrayList<>();

            array.add("Hi");
            array.add("Hello");
            array.add("All");
            array.add("Hi");
            array.add("Welcome");
//array.forEach();
            System.out.println("ArrayList:" +array);

            Set<String> set=new HashSet<>(array);

            System.out.println("Array Without Duplicates:" +set);
        }
    }



