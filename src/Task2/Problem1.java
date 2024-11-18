package Task2;

public class Problem1 {
    public static void main(String[] args) {
            int[] id = {1, 2, 3};
            double totalValue = 0;
            String[] name = {"laptop", "smartphone", "tablet"};
            double[] price = {999.99, 499.99, 299.99};
            boolean[] inStock = {true, false, true};

            //i
            for (int i = 0; i <inStock.length; i++) {
                if (inStock[i] == true) {
                    totalValue += price[i];

                }
            }
            System.out.println("total value of stock is: " + totalValue);

            //iii
            Prices(price);
            HighestValue(price,name);

        }

        static void Prices(double[] p)
        {
            int count = 0;
            for (int i = 0; i <p.length; i++) {
                if (p[i] > 400)
                    count++;
            }
            System.out.println(count);
        }

        //ii
        static void HighestValue(double[] value,String[] name)
        {
            double highestvalue=0;
            int index=0;
            for(int i=0;i<value.length;i++){
                if(highestvalue<value[i]){
                    highestvalue=value[i];
                    index=i;
                }
            }
            System.out.println("most expensive product:"+ name[index]+ ",price:"+value[index]);
        }
    }

