package lamda;


import java.util.function.Function;

public class LamdaExample {

    public static void main(String[] args) {
        Function<Integer, Integer>  function = new Function<Integer, Integer>() {
            @Override
            public Integer apply(Integer integer) {
                return null;
            }
        };

        Function<Integer,Integer> function1 = (a)-> a*a; // single line lambda expression


    }

}
