package compare;

import Test.*;



import java.util.Arrays;
import java.util.Arrays;

class Main {


    public static void main(String args[]) {
        A a = new A();
        a.start();
        System.out.println("main method");

    }
}

class A extends Thread{

    @Override
    public void run() {
        System.out.println("Thread is running ");
    }
}
class InterviewBit extends A{
    InterviewBit(){
        System.out.println(" Welcome to InterviewBit ");
    }
}
class Scaler extends InterviewBit{
    Scaler(){
        System.out.println(" Welcome to Scaler Academy ");
    }
    Scaler(int x){
        this();
       // super();
        System.out.println(" Welcome to Scaler Academy 2");
    }

    public int someMethod(int i){
        try{
            //some statement
            String s1= "s1";
            String  s2 = "s1";

            String s3 = new String("123");
            String s4 = new String("123");

            if(s1==s2)
                System.out.println(true);
            else System.out.println(false);

            if(s3==s4)
                System.out.println(true);
            else System.out.println(false);


            return 1;
        }catch(Exception e){
            //some statement
            return 999;
        }finally{
            //finally block statements
            System.out.println("finally");
        }
    }
}
