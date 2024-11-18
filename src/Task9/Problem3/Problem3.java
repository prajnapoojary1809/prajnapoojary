package Task9.Problem3;
import java.util.Arrays;

public class Problem3 {
    public static void main(String[] args) {
        String arr[]={"They","them","theirs"};
        System.out.println("Initially:" + Arrays.toString(arr));
        swap(arr,2,1);

        Integer arr1[]={10,20,30,40};
        System.out.println("Initially:" + Arrays.toString(arr1));
        swap(arr1,1,3);

    }
    public static <T> void swap(T[] a, int x, int y) {
        T temp = a[x];
        a[x] = a[y];
        a[y] = temp;

        System.out.println("Finally:" + Arrays.toString(a));

    }
}
