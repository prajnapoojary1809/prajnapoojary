package Task10.Problem1;

import java.time.LocalTime;

public class Write implements Runnable {
    private ReadWrite lock = new ReadWrite();
    private int data = 10;

    public Write(int data, ReadWrite lock) {
        this.data = 10;
        this.lock=lock;
    }

    public void run(){
        try {
            lock.lockWrite();
            System.out.println(Thread.currentThread().getName() + "is writing data-" + data);
            Thread.sleep(1000);
            System.out.println(data+"Completed writing "+ "With Lime"+LocalTime.now());
            lock.unlockWrite();
        }
        catch (InterruptedException e){
            Thread.currentThread().getName();
        }
    }
}