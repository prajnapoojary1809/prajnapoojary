package Task10.Problem1;

public class ReadWrite{
    private int reader = 0;
    private int writer = 0;
    private int writeRequests = 0;


    public synchronized void lockWrite() throws InterruptedException {
        writeRequests++;
        while (writer > 0 || reader > 0) {
            wait();
        }
        writeRequests--;
        writer++;
    }

    public synchronized void unlockWrite() throws InterruptedException {
        writer--;
        notifyAll();
    }
    public synchronized void lockRead() throws InterruptedException {
        while (writer > 0 || writeRequests > 0) {
            wait();
        }
        reader++;
    }

    public synchronized void unlockRead() throws InterruptedException {
        reader--;
        notifyAll();
    }
}


