package Task7.Problem2;


import java.util.ArrayList;
import java.util.Collections;

public class Problem2 {
    public static void main(String[] args) {
        ArrayList<ProdObject> prod=new ArrayList<>();
        prod.add(new ProdObject(1,5000f,"Marry"));
        prod.add(new ProdObject(2,5002.7f,"Yulia"));
        prod.add(new ProdObject(3,4500,"Mania"));
        prod.add(new ProdObject(4,5002.5f,"Yulia"));

        Product p=new Product();//creating object

        Collections.sort(prod, p);
        for(ProdObject pr:prod){
            System.out.println(pr.getName() + " "+pr.getPrice() + " "+pr.getId());
        }
    }
}