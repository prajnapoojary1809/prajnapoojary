package Task7.Problem2;

public class ProdObject {
    private String name;
    private int id;
    private float price;

    ProdObject (int id, float price, String name){//constructor
        this.name=name;
        this.id=id;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public float getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }

}
