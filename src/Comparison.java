
import java.util.Scanner;

public class Comparison {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int first;
        int second;

        System.out.print( "Input first integer: " );
        first = input.nextInt();

        System.out.print( "Input second integer: " );
        second = input.nextInt();

        if ( first == second)
            System.out.printf( "%d == %d\n", first, second );
        // if equals
        if ( first != second )
            System.out.printf( "%d != %d\n", first,  second);
        if ( first < second )
            System.out.printf( "%d < %d\n", first,  second );
        if ( first > second )
            System.out.printf( "%d > %d\n", first,  second );
        if ( first <= second )

            System.out.printf( "%d <= %d\n", first,  second );
        if ( first >= second )
            System.out.printf( "%d >= %d\n", first,  second );
    }



}


