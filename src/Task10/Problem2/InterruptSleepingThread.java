package Task10.Problem2;

    public class InterruptSleepingThread extends Thread{
        public void run(){
            try{
                System.out.println("Thread is going to sleep");
                Thread.sleep(10000);
                System.out.println("Thread Completed sleep without Interruption");
            } catch (InterruptedException e) {
                System.out.println("InterruptedException"+e.toString());
            }
        }
        public static void main(String[] args) {
            InterruptSleepingThread th=new InterruptSleepingThread();
            th.start();
            try{
                Thread.sleep(3000);
                th.interrupt();
            } catch (InterruptedException e) {
                System.out.println("Exception handeled"+e.toString());
            }
        }
    }

