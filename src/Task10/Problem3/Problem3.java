package Task10.Problem3;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Problem3 extends Thread{

    public static void main(String[] args) {
        ExecutorService ex= Executors.newFixedThreadPool(3);//created a thread-pool with fixed no. of threads-here fixed no. is 3
        for(int i=1;i<=6;i++){
            Runnable task=new ThreadPoolHandle("Task-"+i);//for each iteration of loop a new task is created
            ex.execute(task);
        }
        ex.shutdown();
    }
}


