package Test;

public class TestOne {
    public int TestOneInt = 0;

    public void test(){
        System.out.println("test printed");
    }

    public static void main(String[] args) {
        rearrange(new int[]{1,2,3,4,5,6,7,8,9});
    }
    public static void rearrange(int arr[]){
        int newArr[]= new int[arr.length];
        int r=arr.length-1,l=0;

        for (int a:newArr) {
            System.out.print(a+" ");
        }
    }
}
