package compare;

public class User implements Cloneable{

    int age;
    String name;

    public User(int a,String s){
        age = a;
        name = s;
    }
    @Override
    protected User clone() throws CloneNotSupportedException {
        return (User)super.clone();
    }
}
