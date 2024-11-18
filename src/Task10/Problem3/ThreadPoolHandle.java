package Task10.Problem3;

    public class ThreadPoolHandle implements Runnable{
        private String name;
        public ThreadPoolHandle(String name){
            this.name=name;
        }
        @Override
        public void run() {
            System.out.println(name +" is being executed by: "+ Thread.currentThread().getName());
            try{
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(name +" is completed by: "+ Thread.currentThread().getName());
        }
    }