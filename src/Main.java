import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int admNumber;
        String name;
        int rollNumber;
        String collegeName;
        long phoneNumber;
        String email;
        int choice = 1;
        while (choice != 0) {
            System.out.println("1.add student");
            System.out.println("2.view student");
            System.out.println("3.search student");
            System.out.println("4.delete student");
            choice = input.nextInt();
        }
    }
}