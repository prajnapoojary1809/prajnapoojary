package Task5;

public class Problem2 {
        public static void main(String[] args) {
            long startTime= System.currentTimeMillis();

            StringBuilder str=new StringBuilder();
            for(int i=0;i<1000000;i++)
            {
                str.append("Home");
            }
            long endTime=System.currentTimeMillis();

            long duration=endTime-startTime;

            System.out.println("Runtime:"+duration+" in ms");

            long initialTime= System.currentTimeMillis();

            String str1=" ";
            for(int i=0;i<100000;i++)
            {
                str1+="Sannidhi";
            }
            long finalTime =System.currentTimeMillis();


            System.out.println("Runtime:"+ (finalTime -initialTime)+" in ms");
        }

    }

