package thread;


public class NewThread {

    private static void newThread(){
        Thread thread1 = new Thread(()->{
            System.out.println("Thread 1 is running");
        });

        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Thread2 is running");
            }
        });

        Thread thread3 = new Thread(){
            @Override
            public void run() {
                super.run();
                System.out.println("Thread3 is running");
            }
        };

        thread1.start();
        thread2.start();
        thread3.start();


    }

    public static void main(String[] args) {
        newThread();
    }

}
