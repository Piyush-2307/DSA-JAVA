package Basics.B05;

//import java.util.Scanner;

public class Str {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);

//        String firstName = "Peeyush";
//        String lastName = new String("Arora");
//        System.out.println(firstName + " " + lastName);
//        System.out.println(firstName.length());
//        System.out.println(firstName.charAt(3));
//        System.out.println(firstName.indexOf("y"));
//
//        String str = "";
//        for (int i = 0; i < 10; i++) {
//            str = str + "a";
//        }
//        System.out.println(str);

//        String name1 = "Peeyush";
//        String name2 = "PEEYUSH";
//
//        System.out.println(name1.equals(name2));
//        System.out.println(name1.equalsIgnoreCase(name2));
//
//        if (name1 == name2){
//            System.out.println("yes");
//        }else {
//            System.out.println("no");
//        }

//        String input = sc.next();
//        System.out.println(input);
//        String input1 = sc.nextLine();
//        System.out.println(input1);

//        String ss = "  ";
//        System.out.println(ss.isEmpty());
//        System.out.println(ss.isBlank());
//        String dd = "  peeyu  ";
//        System.out.println(dd.trim());

//        int num = 3452;
//        String str4 = String.valueOf(num);
//        System.out.println(num + 1);
//        System.out.println(str4 + 1);

//        String name = "Peeyush";
//        char[] ch = name.toCharArray();
//
//        for (char crr: ch){
//            System.out.println("Val of char: " + crr);
//        }

//        String spl ="Hi my name is Peeyush";
//        String[] word = spl.split(" ");
//        for (String str: word){
//            System.out.println(str);
//        }

//        String replace = "arora";
//        replace = replace.replace("a", "Q");
//        System.out.println(replace);

//        Practice

        String str = "peeyush";
//        System.out.println(palindrom(str).equalsIgnoreCase(str));
//        System.out.println(reverse(str));
          System.out.println(vow(str));
//          printString(str);
    }

//    static String palindrom(String str){
//        String palindromed = "";
//        for (int i = str.length() - 1; i >= 0; i--) {
//            char ch = str.charAt(i);
//            palindromed = palindromed + ch;
//        }
//            return palindromed;
//    }

//    static String reverse(String str){
//        String reversed = "";
//        for (int i = str.length() - 1; i >= 0; i--) {
//            char ch = str.charAt(i);
//            reversed = reversed +  ch;
//        }
//        return reversed;
//    }
//        static void printString(String str){
//            for (int i = 0; i < str.length(); i++) {
//                char ch = str.charAt(i);
//                System.out.println(ch);
//            }
//        }

    static  int vow (String str){
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){}
            else count++;

        }
        return count;
    }
}


