package generic;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

enum Season{
    WINTER(10),SUMMER(20);
    private int value;
    Season(int value){
        this.value=value;
    }
    public int getSeason(){
        return WINTER.value;
    }
}

class A{
    int a,b,c;
    A(int a){
        this.a = a;
//        Season.WINTER.getSeason();
    }
    A(int a,int b){
        this.a = a;
        this.b = b;
    }
    A(int a,int b,int c){
        this.a = a;
        this.b = b;
        this.c= c;
    }

    void print(){
        System.out.println(a+" "+b+" "+c);

    }

    public static void main(String args[]){
        A a = new A(5);
        A b = new A(5,10);
        A c = new A(5,10,15);
        a.print();
        b.print();
        c.print();

    }

}

class B extends A {
    B(int a) {
        super(a);
    }

    // B class implementation
    public void print(){
        System.out.println("print from B");
    }
}

class C extends A {
    C(int a) {
        super(a);
    }

    // C class implementation
    public void print(){
        System.out.println("print from C");
    }
}

class D extends C{
    D(int a) {
        super(a);
    }

    public void print(){
        System.out.println("print from D");
    }
}
class Gen<T extends A> {
    T t;
    Gen(T g){
        t = g;
    }

    void print() {
        t.print();
    }



}


public class GenericTest {
    public static void main(String[] args) {
        List<? super A> list = new ArrayList<A>();
        List<? extends A> list1 = new ArrayList<>();
        List<A> list2 = new ArrayList<>(List.of(new A(5),new A(5),new A(5)));
        List<B> list3 = new ArrayList<>(List.of(new B(5),new B(5),new B(5)));
        Set<Integer> set = new HashSet<>();
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(4);
        set.add(5);
        System.out.println(set);
        list1 = list2;
       // list1 = list3;
        // Adding elements to the list
        list.add(new A(5));
        list.add(new B(5));
        list.add(new C(5));





//        Gen<B> gen = new Gen(new B());
//        gen.print();

        // list.add(new Object());  // Error: Cannot add Object or any unrelated types to the list

        // Accessing elements from the list
        Object element1 = list.get(0);  // Allowed: Element treated as Object
        // A element2 = list.get(0);  // Error: Cannot assign element as A type
        // B element3 = list.get(1);  // Error: Cannot assign element as B type
        // C element4 = list.get(2);  // Error: Cannot assign element as C type

        // Iterating over the list
        for (A a : list1) {
        //    a.print();
            // Process each element (treated as Object)
        }
    }
}
