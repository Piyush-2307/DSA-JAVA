package Basics.Day02;

public class Operator {
    public static void main(String[] args){
        int weekOneSales = 12834;
        int weekTwoSales = 9865;

        int total = weekOneSales + weekTwoSales;
        int difference = weekOneSales - weekTwoSales;
        int projected = weekOneSales * 4;
        int avg = weekOneSales / 7;
        int remainder = weekOneSales % 7;

        System.out.println(total);
        System.out.println(difference);
        System.out.println(projected);
        System.out.println(avg);
        System.out.println(remainder);

//      Relational operator
        System.out.println(weekOneSales == weekTwoSales);
        System.out.println(weekOneSales != weekTwoSales);
        System.out.println(weekOneSales > weekTwoSales);
        System.out.println(weekOneSales < weekTwoSales);
        System.out.println(weekOneSales >= weekTwoSales);
        System.out.println(weekOneSales <= weekTwoSales);

//      Logical operator
        boolean completeDSA = true;
        boolean completecore = false;

        System.out.println(completeDSA && completecore);
        System.out.println(completeDSA || completecore);
        System.out.println(!completeDSA);

//      Unary
        int a = 5;
        int b = -a;
        System.out.println(b);

        int inc = 10;
        int prefix = ++inc;
        int postfix = inc++;
        System.out.println(prefix);
        System.out.println(postfix);
        System.out.println(inc);

//      Ternary
        int first = 12;
        int second = 113;
    }
}
