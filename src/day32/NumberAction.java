package day32;

public class NumberAction {

    public static void numberComparison() {

    }

    public static void main(String[] args) {
        //String strToRepeat;
        // repeatString(strToRepeat "Java", count:3);
        int num1 = 0;
        int num2 = 1;
        if (num1>num2) {
            System.out.println("num1 is more than num2");
        }else if (num2 > num1) {
            System.out.println();

        }
        //for (int x=num1; x>num2; x++) {
        //  System.out.println(x);

    }




    /*
    Create static void methods as below

    numberComparison
    this method has 2 parameters called num1 and num2
    if num1 is more than num2 print num1 is more than num2
    if num2 is more than num1 print num2 is more than num1
    if num2 are equals num1 print they are equal

    skipCountBy3From0to50

    create a method that has no parameter
    and skip count by 3 from 0 to 50*/
    public static void skipCountBy3From0to50(){

    }

  /*  countDownByEvenNumberFrom50to0
    create a method that has no parameter
    and count Down By Even Number From 50 to 0
    for example 50, 48, 46 ........0

    public static void countDownByEvenNumberFrom50to0(int x ,int y){
    for (int i =x ; i>=y; i--) {
    if (i % 2==0)
    System.out.print(i+ " ")

    }

    }
    System.out.println()

    print1toX
    create a method that has 1 int parameter called x
    print from 1 to that number in one line
    print an empty line after the print.

     */
    //String repeater
    //    this method has 2 parameters
    //    String strToRepeat and int count
    //    repeat printing the string as many times as <count> number define
    public static void repeatString(String strToRepeat, int count){

        for (int i = 1; i<= count; i++)  {
            System.out.println(strToRepeat + " ");
        }
        System.out.println();


    }
}
