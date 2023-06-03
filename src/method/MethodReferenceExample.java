package method;

import java.util.Arrays;

public class MethodReferenceExample {

    public static void staticMethod(String str) {
        System.out.print("Static method: " + str);
    }

    public void instanceMethod(String str) {
        System.out.println("Instance method: " + str);
    }

    public static int sum(int a,int b){
        return a+b;
    }

    public static void main(String[] args) {
        // Reference to a static method
        Arrays.asList("One", "Two", "Three").forEach(MethodReferenceExample::staticMethod);

        // Reference to an instance method of a particular object
        MethodReferenceExample obj = new MethodReferenceExample();
        Arrays.asList("Four", "Five", "Six").forEach(obj::instanceMethod);

        // Reference to an instance method of an arbitrary object of a particular type
        Arrays.asList("Seven", "Eight", "Nine").forEach(MethodReferenceExample::instanceMethodCaller);

        // Reference to a constructor

        MyInterface myInterface = MethodReferenceExample::new;
        MethodReferenceExample example = myInterface.createInstance();
        example.instanceMethod("121232");

        Calc calc = MethodReferenceExample::sum;

    }

    public static void instanceMethodCaller(String str) {
        MethodReferenceExample example = new MethodReferenceExample();
        example.instanceMethod(str);
    }

    public interface MyInterface {
        MethodReferenceExample createInstance();
    }

    public interface Calc{
        public int add(int a,int b);

    }
}

