import java.util.Scanner;

public class assignment2 {
    public static void main(String[] args) {
        Scanner loop = new Scanner( System.in );
        // call the method of the body
        int side1 = 0;
        int side2 = 0;
        int side3 = 0;
        double x = 0;
        //introducing the input loop to print out the integers and double
        System.out.println( "input 1:" );
        side1 = loop.nextInt();
        System.out.println( "input 2" );
        side2 = loop.nextInt();
        System.out.println( "input 3" );
        side3 = loop.nextInt();
        // do the area of the triangle
        x = area( side1 , side2 , side3 );
        System.out.println( "the area of a triangle" );

    }

    public static double area(int a , int b , int c) {
        double x = 0.0;
     x = (a*b*c)/2;
     System.out.println( "area of a triangle" +(a*b*c/3));
      return x;
    }


}










