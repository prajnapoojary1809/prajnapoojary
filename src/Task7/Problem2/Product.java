package Task7.Problem2;

import java.util.Comparator;

class Product implements Comparator<ProdObject> {

    public int compare(ProdObject p1, ProdObject p2)
    {
        if(p1.getName().equalsIgnoreCase(p2.getName())) {
//                return (int) (p2.getPrice() - p1.getPrice());
            return (p2.getPrice() - p1.getPrice())>0? 1:-1;

        }else{
            return p1.getName().compareTo(p2.getName());
        }
    }
}



