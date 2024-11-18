package Task8.Problem3;

import java.io.*;

public class Problem3 {

    public static void file() throws IOException {
        BufferedReader buffer=null;
        try {
            File f = new File("C:\\Users\\Prajna Poojary\\Desktop\\fil.txt");
            System.out.println(f);
            buffer=new BufferedReader(new FileReader(f));
            String st="";
            while((st=buffer.readLine())!=null)
            {
                System.out.println(st);
            }
        }
        catch (FileNotFoundException e) {
            throw e;
        }
        finally {
            if(buffer!=null) {
                buffer.close();
            }
        }
    }

    public static void main(String[] args) {
        try {
            file();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

}

