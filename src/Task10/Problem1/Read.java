package Task10.Problem1;

import java.time.LocalTime;

public class Read implements Runnable{

    private ReadWrite lock = new ReadWrite();
    private int data = 10;

    public Read(int data,ReadWrite lock) {
        this.data = data;
        this.lock = lock;
    }

    public void run() {
        try {
            lock.lockRead();
            System.out.println(Thread.currentThread().getName() + "is reading data-" + data);
            Thread.sleep(1000);
            System.out.println(data+"Completed reading "+ LocalTime.now());
            lock.unlockRead();
        }
        catch (InterruptedException e){
            Thread.currentThread().getName();
        }

    }
}

