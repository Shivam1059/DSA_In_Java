import java.util.Scanner;

class FindEven {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");

        if (sc.hasNextInt()) {
            int element = sc.nextInt();
            sc.nextLine();
            if (element % 2 == 0) {
                System.out.println("Element " + element + " is Even");
            } else {
                System.out.println("Element " + element + " is Odd");
            }

        } else {
            System.out.println("Invalid input. Please enter a valid integer.");
        }

        sc.close();
    }
}