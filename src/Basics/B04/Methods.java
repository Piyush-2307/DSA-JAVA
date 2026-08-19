package Basics.B04;

public class Methods {
        static void table(){
            for (int i = 1; i <= 10; i++) {
                System.out.println(2 * i);
            }
        }
        static void sum(int x,int y){
            System.out.println("SUM -> " + (x + y));
        }
        static int add(int a, int b){
            int sum = a + b;
            return sum;
        }

        static void solve(int num){
            System.out.println("Inside solve: " + num);
            num = num * 10;
            System.out.println("Inside solve: " + num);
        }
    public static void main(String[] args) {
//            int num = 5;
//            System.out.println("Inside main: " + num);
//            solve(num);
//            System.out.println("Inside main: " + num);
//        System.out.println("in");
//        table();
//        System.out.println("out");
//        sum(10,20);
//        int result = add(324,453);
//        System.out.println("Total -> " + result);
    }
}
