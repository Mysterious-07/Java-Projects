import java.util.*;

public class Pattern {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("\n|| THIS PROGRAM GENERATES PATTERNS ||\n");
        System.out.println(
                "1. Solid Rectangle\n2. Hollow Rectangle\n3. Left Right Triangle\n4. Left Right Inverted Triangle\n5. Right Right Triangle\n6. Inverted Right Right Triangle\n7. Right Number Triangle of Column\n8. Right Number Inverted Triangle of Column\n9. Right Continous Number Triangle\n10. Right 01010 Pattern Triangle");
        System.out.print("\nEnter desired number between 1 to 10 : ");
        int button = sc.nextInt();
        switch (button) {
            case 1: // Solid Rectangle :-
                System.out.print("\nEnter the number of rows : ");
                int n = sc.nextInt();
                System.out.print("Enter the number of columns : ");
                int m = sc.nextInt();
                for (int i = 1; i <= n; i++) {
                    for (int j = 1; j <= m; j++) {
                        System.out.print("*" + " ");
                    }
                    System.out.println();
                }
                break;

            case 2: // Hollow Rectangle :-
                System.out.print("\nEnter the number of rows : ");
                int a = sc.nextInt();
                System.out.print("Enter the number of columns : ");
                int b = sc.nextInt();
                for (int i = 1; i <= a; i++) {
                    for (int j = 1; j <= b; j++) {
                        if (i == 1 || i == a || j == 1 || j == b) {
                            System.out.print("*" + " ");
                        } else {
                            System.out.print("  ");
                        }
                    }
                    System.out.println();
                }
                break;

            case 3: // Left Right Triangle :-
                System.out.print("\nEnter the number of rows : ");
                int c = sc.nextInt();
                for (int i = 1; i <= c; i++) {
                    for (int j = 1; j <= i; j++) {
                        System.out.print("*" + " ");
                    }
                    System.out.println();
                }
                break;

            case 4: // Left Right Inverted Triangle :-
                System.out.print("\nEnter the number of rows : ");
                int d = sc.nextInt();
                for (int i = d; i >= 1; i--) {
                    for (int j = 1; j <= i; j++) {
                        System.out.print("*" + " ");
                    }
                    System.out.println();
                }
                break;

            case 5: // Right Right Triangle :-
                System.out.print("\nEnter the number of rows : ");
                int e = sc.nextInt();
                for (int i = e; i >= 1; i--) {
                    for (int j = 1; j < i; j++) {
                        System.out.print("  ");
                    }

                    for (int j = 0; j <= e - i; j++) {
                        System.out.print("*" + " ");
                    }
                    System.out.println();
                }
                break;

            case 6: // Inverted Right Right Triangle :-
                System.out.print("\nEnter the number of rows : ");
                int f = sc.nextInt();
                for (int i = 1; i <= f; i++) {
                    for (int j = 1; j <= i - 1; j++) {
                        System.out.print("  ");
                    }

                    for (int j = f; j >= i; j--) {
                        System.out.print("*" + " ");
                    }
                    System.out.println();
                }
                break;

            case 7: // Right Number Triangle of Column :-
                System.out.print("\nEnter the number of rows : ");
                int g = sc.nextInt();
                for (int i = 1; i <= g; i++) {
                    for (int j = 1; j <= i; j++) {
                        System.out.print(j + " ");
                    }
                    System.out.println();
                }
                break;

            case 8: // Right Number Inverted Triangle of Column :-
                System.out.print("\nEnter the number of rows : ");
                int h = sc.nextInt();
                for (int i = h; i >= 1; i--) {
                    for (int j = 1; j <= i; j++) {
                        System.out.print(j + " ");
                    }
                    System.out.println();
                }
                break;

            case 9: // Right Continous Number Triangle :-
                System.out.print("\nEnter the number of rows : ");
                int k = sc.nextInt();
                int number = 1;
                for (int i = 1; i <= k; i++) {
                    for (int j = 1; j <= i; j++) {
                        System.out.print(number + " ");
                        number++;
                    }
                    System.out.println();
                }
                break;

            case 10: // Right 01010 Pattern Triangle :-
                System.out.print("\nEnter the number of rows : ");
                int l = sc.nextInt();
                for (int i = 1; i <= l; i++) {
                    for (int j = 1; j <= i; j++) {
                        if ((i + j) % 2 == 0) {
                            System.out.print(1 + " ");
                        } else {
                            System.out.print(0 + " ");
                        }
                    }
                    System.out.println();
                }
                break;

            default:
                System.out.println("\nInvalid Number!\n");
        }
    }
}



