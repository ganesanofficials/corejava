package compare;

import java.util.ArrayList;
import java.util.List;

public class TestApp {

    final int a ;
     int b = 10;

    public TestApp(int a) {
        this.a = a;
    }


    public static void main(String[] args) throws ClassNotFoundException, CloneNotSupportedException {
        List<Student> list = new ArrayList<>();
        list.add(new Student(18,"aaa","cse"));
        list.add(new Student(18,"aaa","cse"));
        list.add(new Student(22,"ccc","mech"));
        list.add(new Student(21,"aab","ece"));
        list.add(new Student(20,"bbc","ece"));

        list.sort(new NameComparator());

        System.out.println(list.get(0)==list.get(1));
        for(Student s : list){
            System.out.println(s.name+" "+s.age+" "+s.dept+" "+s.hashCode());
        }



        try {
            int variable = 5;
            int a = variable/5;
        }
        catch (Exception exception) {
            System.out.println("Exception occurred");
        }
        finally {
            System.out.println("Execution of finally block");
        }
        check();
    }

    private static void check() throws CloneNotSupportedException {
        User user = new User(5,"aaa");
        User user1 = user;

        System.out.println(user.age+" "+user1.age);
        user.age = 50;
        System.out.println(user.age+" "+user1.age);
        //System.out.println(user1.age+" "+user1.name);

    }

}
