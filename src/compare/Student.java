package compare;

public class Student {//implements Comparable<Student>{
    int age;
    String name;
    String dept;

    public Student(int age, String name, String dept) {
        this.age = age;
        this.name = name;
        this.dept = dept;
    }
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    @Override
    public int hashCode() {
        int a = 17;
        return a*35+this.name.hashCode()+age;
      //  return super.hashCode();
    }


   //     @Override
    public int compareTo(Student o) {
        return this.age - o.age;
    }


}
