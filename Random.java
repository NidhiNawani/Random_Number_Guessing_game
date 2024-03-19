import java.util.Scanner;
public class Random {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int start = 1;
        int end = 100;
        int b;
        do {
            System.out.println("Enter the number from 1 to 100");
            int n = sc.nextInt();
            while (start <= end) {
                int mid = (start + end) / 2;
                System.out.println(mid + ": Is it the right guess  type (Y/N)");
                char c = sc.next().charAt(0);
                if (c == 'Y'|| c=='y') {
                    System.out.println("hoooray !!! we guessed it right ");
                    break;
                } else if (c == 'N' || c == 'n') {
                    System.out.println("was your number greater or lesser than this (type G/L)");
                    char m = sc.next().charAt(0);
                    if (m == 'G' || m == 'g') {
                        start = mid + 1;
                    } else if (m == 'L' || m=='l') {
                        end = mid - 1;
                    } else {
                        System.out.println("invalid input");
                    }
                } else {
                    System.out.println("invalid input");
                }
            }
            System.out.println("type 1 to play again");
            b=sc.nextInt();
        }while(b==1);
    }
}
