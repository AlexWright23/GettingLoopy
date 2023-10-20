import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int num;

        System.out.print("1).  ");
        for (num = 0; num <= 30; num++) {
            System.out.print(num + ", ");

        }

        System.out.println();

        System.out.print("2).  ");
        for (num = 30; num >= 0; num--) {
            System.out.print(num + ", ");

        }

        System.out.println();

        System.out.print("3).  ");
        for (num = 0; num <= 18; num += 3) {
            System.out.print(num + ", ");

        }

        System.out.println();

        System.out.print("4).  ");
        for (num = 10; num >= 0; num -= 2) {
            System.out.print(num + ", ");
        }

        System.out.println();

        System.out.print("5).");
        System.out.println();
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println("6).");
        System.out.println();
        for (int i = 1; i <= 5; i++) {
            for (int j = 5; j >= i; j--) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println();

        System.out.print("7). ");
        System.out.println();
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("Extra Credit: A  ");

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 15 - i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < 2 * i + 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 12; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < 7; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
