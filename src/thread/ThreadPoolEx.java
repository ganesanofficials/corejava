package thread;

import java.util.Scanner;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPoolEx {



    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(100);
        for(int i=0;i<10;i++){
            String a= "Thread "+i;
            Work work = new Work(a,i);
            executorService.execute(work);
        }
        executorService.shutdown();
    }
}
