import java.util.Scanner;

public class IfElse implements Solution{
    @Override
    public void run() {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        scanner.skip("(\\r\\n|[\\n\\r\\u2028\\u2029\\u0085])?");
        findWeirdOrNotWeirdNumber(N);
        scanner.close();
    }

    private void findWeirdOrNotWeirdNumber(int N) {
        int number = N%2;
        // If n is even and in the inclusive range of 2 to 5 , print Not Weird
        if ( number == 0 && ( N >= 2 && N <= 5) ) {
            System.out.println("Not Weird");
        }
        // If n is even and in the inclusive range of 6 to 20, print Weird
        if ( number == 0 && ( N >= 6 && N <= 20) ) {
            System.out.println("Weird");
        }
        // If n is even and in the inclusive range of 6 to 20, print Weird
        if ( number == 0 && ( N > 20) ) {
            System.out.println("Not Weird");
        }
        // Odd number print Weird
        if ( number != 0) {
            System.out.println("Weird");
        }
    }
}
