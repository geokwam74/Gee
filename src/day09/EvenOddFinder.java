package day09;

public class EvenOddFinder {
    public static void main(String[] args) {

        int myNumber = 301;

        // System.out.println( myNumber/2);
        //System.out.println( myNumber%2);


        int remainder = myNumber % 2;
        //if( remainder == 0 ){

        if (remainder == 1) {
            if (myNumber % 2 == 0) {
                System.out.println("Even Number !!!");
            } else {
                System.out.println("Odd Number !!!");
            }
            System.out.println("End");
        }
    }
}