package Task10.Problem1;

import java.time.LocalTime;

public class Problem1 {
    public static void main(String[] args) {
        ReadWrite rw=new ReadWrite();

        for(int i=0;i<3;i++){
            new Thread(new Write(10,rw),"Writer-"+i+ LocalTime.now()).start();
            new Thread(new Read(10,rw),"Reader-"+i+ LocalTime.now()).start();

        }

    }
}

