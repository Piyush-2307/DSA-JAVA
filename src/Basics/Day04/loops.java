package Basics.Day04;

public class loops {
    public static void main(String[] args) {
//        For loop
        for (int i = 1; i <= 5; i++){
            System.out.println("Value is: " + i);
        }

        for (int i = 1; i <= 5; i++){
            System.out.println("Peeyush");
        }

        for (int i = 2; i <= 20; i += 2){
            System.out.println(i);
        }

//        Nested
        for (int i = 1; i < 4; i++){ //rows
            for (int j = 1; j < 5; j++){ // columns
                System.out.print("* ");
            }
            System.out.println();
        }
        for(int i = 1; i < 4; i++){
            for (int j = 1; j < i + 1; j++){
                System.out.print("* ");
            }
            System.out.println();
        }

        for (int i = 0; i <= 3; i++){
            for (int j = 0; j<=3 ; j++ ){
                System.out.println("i: "+ i + " ,j: "+ j);
            }
        }

        for (int i = 1; i <= 10; i++){
            if (i == 4){
                break;
            }
            System.out.println(i);
        }
        for (int i = 1; i <= 10; i++){
            if (i == 4){
                continue;
            }
            System.out.println(i);
        }

//        While loop

        int i = 0;
        while (i <= 5){
            if (i == 3){
                i++;
                continue;
            }
            System.out.println(i);
            i++;
        }

        int i = 1;
        while (i <= 2){
            int j = 1;
            while (j <= 3){
                System.out.println("i = " + i + ", j = " + j);
                j++;
            }
            i++;
        }

        Do while loop
        int i = 1;
        do {
            System.out.println(i);
            i++;
        }while (i <= 3);

        HW
        for (int i = 0; i <= 12; i++){
            System.out.println(i);
        }
        for (int i = 12; i >= 0; i--){
            System.out.println(i);
        }
        int table = 10;
        for (int i = 1; i <= table; i++){
            System.out.println(i * table);
        }

        int even = 10;
        for (int i = 0; i <= even; i+= 2){
            System.out.println(i);
        }
        int sum = 0;
        for (int i = 1; i <= 10; i++){
            System.out.println(sum = sum + i);
        }

        for (int i = 50; i <= 100; i++){
            if(i % 7 == 0){
                System.out.println(i);
            }
        }


        for (int i = 1; i <= 100; i++) {
            int temp = 0;

            for (int j = 2; j <= i - 1; j++) {
                if (i % j == 0) {
                    temp++;
                }
            }

            if (temp == 0 && i > 1) {
                System.out.println(i);
            }
        }
    }
}
