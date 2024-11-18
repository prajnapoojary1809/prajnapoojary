package Task10.Problem4;

import java.util.concurrent.CountDownLatch;

    public class CountDown extends Thread {

        public static void main(String[] args) throws InterruptedException {
            CountDownLatch latch = new CountDownLatch(5);

            CountDown first = new CountDown(1000,latch, "Worker-1");
            CountDown second = new CountDown(2000,latch, "Worker-2");
            CountDown third = new CountDown(3000, latch, "Worker-3");
            CountDown fourth = new CountDown(4000, latch, "Worker-4");
            CountDown fifth = new CountDown(5000, latch, "Worker-5");

            first.start();
            second.start();
            third.start();
            fourth.start();
            fifth.start();

            latch.await();
            System.out.println(Thread.currentThread().getName()+" has finished");

        }
        private int delay;
        private CountDownLatch latch;

        CountDown(int delay, CountDownLatch latch, String name) {
            super(name);
            this.delay = delay;
            this.latch = latch;
        }

        public void run() {
            try {
                Thread.sleep(delay);
                latch.countDown();
                System.out.println(Thread.currentThread().getName() + " Finishes,"+" "+"count is "+latch.getCount());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }

