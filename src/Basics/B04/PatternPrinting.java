package Basics.B04;

public class PatternPrinting {
    public static void main(String[] args) {
        for(int i = 0; i < 4; i++){ // rows
            for (int j = 0; j < 5; j++){ // columns
                System.out.print("* ");
            }
            System.out.println();
        }

        for (int i = 0; i <= 3; i++){
            for (int j = 0; j <= i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }

        for (int i = 1; i <= 5; i++){
            for (int j = 1; j <= 5 - i ; j++){
                System.out.print("- ");
            }
            for (int k = 1; k <= 5; k++){
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println("I am out");

        for (int i = 0; i < 5; i++){
            for (int j = 0; j < 5 - i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }

        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5 - i; j++) {
                System.out.print("-  ");
            }
            for (int k = 1; k <= i ; k++) {
                System.out.print("*  ");
            }
            System.out.println();
        }

        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5 - i; j++) {
                System.out.print("   ");
            }
            for (int k = 1; k <= 2 * i -1 ; k++) {
                System.out.print("*  ");
            }
            System.out.println();
        }
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("   ");
            }
            for (int k = 0; k < 2 * 5 - 2 * i - 1; k++) {
                System.out.print("*  ");
            }
            System.out.println();
        }
        for (int i = 1; i <= 4; i++){
            for (int j = 1; j <= 6; j++) {
                if (i == 1|| i == 4){
                    System.out.print("*  ");
                } else if (j == 1 || j == 6) {
                    System.out.print("*  ");
                } else {
                    System.out.print("-  ");
                }
            }
            System.out.println();
        }

        for (int i = 1; i <= 10; i++){
            if (i == 1 || i == 2 || i == 10){
                for (int j = 0; j < i; j++) {
                    System.out.print("*  ");
                }
            }
            else {
                System.out.print("*  ");

                for (int k = 1; k <= i - 2; k++) {
                    System.out.print("   ");
                }

                System.out.print("*  ");
            }
            System.out.println();
        }

        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5 - i; j++) {
                System.out.print("   ");
            }
            if (i == 1 || i == 5){
                for (int k = 1; k <= 2 * i - 1 ; k++) {
                    System.out.print("*  ");
                }
            }else {
                System.out.print("*  ");

                for (int l = 1; l <= 2 * i - 3 ; l++) {
                    System.out.print("   ");
                }

                System.out.print("*  ");
            }
            System.out.println();
        }

        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5 - i; j++) {
                System.out.print("   ");
            }
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("*  ");
            }
            System.out.println();
        }
            for (int l = 1; l <= 5 ; l++) {
                for (int m = 1; m <= l; m++){
                    System.out.print("   ");
                }
                for (int n = 1; n <= 2 * 5 - 2 * l - 1 ; n++) {
                    System.out.print("*  ");
                }
                System.out.println();
            }

        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= 4 - i; j++) {
                System.out.print("   ");
            }
            if(i == 1){
//                for (int k = 1; k <= 2 * i - 1 ; k++) {
                    System.out.print("*  ");
//                }
            }else {
                System.out.print("*  ");

                for (int l = 1; l <= 2 * i - 3 ; l++) {
                    System.out.print("   ");
                }

                System.out.print("*  ");
            }
            System.out.println();
        }
        for (int i = 1; i <= 3; i++){
            for (int j = 1; j <= i ; j++) {
                System.out.print("   ");
            }
            if (i == 3){
                System.out.print("*  ");
            }else {
                System.out.print("*  ");

                for (int k = 1; k <= 2 * 4 - 2 * i - 3 ; k++) { // or 2*(4-i)-3
                    System.out.print("   ");
                }

                System.out.print("*  ");
            }
            System.out.println();
        }

        for (int i = 1; i <= 4; i++){
            for (int j = 1; j <= i; j++) {
                System.out.print("*  ");
            }
            for (int k = 1; k <= 2 * 4 - 2 * i; k++) { // 2 * (4 - i)
                    System.out.print("   ");
            }
            for (int l = 1; l <= i; l++) {
                    System.out.print("*  ");
            }
            System.out.println();
        }

        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= 4 - i + 1; j++) {
                System.out.print("*  ");
            }
            for (int k = 1; k <= 2 * i - 2 ; k++) {
                System.out.print("   ");
            }
            for (int l = 1; l < 4 - i + 2; l++) {
                System.out.print("*  ");
            }
            System.out.println();
        }

        int count = 1;
        for (int i = 1; i <= 5 ; i++) {
            for (int j = 1; j <= 5 - i + 1; j++){
                System.out.print(count++  + " ");
            }
            System.out.println();
        }

        for (int i = 1; i <= 5; i++){
            for (int j = 1; j <= i; j++) {
                int b = ('A' - 1);
                int ans = j + b;
                char finalAns = (char)ans;
                System.out.print(finalAns + " ");
            }
            System.out.println();
        }

        for (int i = 1; i <= 5; i++){
            for (int j = 1; j <= i; j++){
                int a = 5 - j;
                int b = 'A';
                int ans = a + b;
                char finalAns = (char)ans;
                System.out.print(finalAns + " ");
            }
            System.out.println();
        }


        for (int i = 1; i <= 4; i++){
            for (int j = 1; j < 4 - i + 1; j++) {
                System.out.print("   ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print(k+ "  ");
            }
            int dec = i - 1;
            for (int l = 1; l <= i - 1 ; l++) {
                System.out.print(dec-- + "  ");
            }
            System.out.println();
        }

        for (int i = 1; i <= 4 ; i++) {
            for (int j = 1; j <= 4 - i; j++){
                System.out.print("-  ");
            }
            for (int k = 1; k <= 2 * i - 1; k++){
                System.out.print(i + "  ");
            }
            System.out.println();
        }

        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= 4 - i; j++) {
                System.out.print("-  ");
            }
            for (int k = 1; k <= i; k++) {
                int b = 'A' - 1;
                int ans = k + b;
                char finalAns = (char)ans;
                System.out.print(finalAns + "  ");
            }
            char dec = (char)(i + 'A' - 2);
            for (int l = 1; l < i; l++){
                System.out.print(dec-- + "  ");
            }
            System.out.println();
        }
    }
}

