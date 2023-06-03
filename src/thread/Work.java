package thread;

class Work implements Runnable{
    String msg;
    int num;
    Work(String msg,int i){
        this.msg = msg;
        this.num = i;
    }
    @Override
    public void run() {
        System.out.println("Thread is working "+num+" "+msg);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
