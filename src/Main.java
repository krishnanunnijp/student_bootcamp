import java.util.ArrayList;
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
        ArrayList<Student> student = new ArrayList<Student>();
        Student student1 ;
        int choice = 1;
        while (choice != 0) {
            System.out.println("1.add student");
            System.out.println("2.view student");
            System.out.println("3.search student");
            System.out.println("4.delete student");
            choice = input.nextInt();
            switch (choice) {

                case 1:
                    admNumber = input.nextInt();
                    name = input.next();
                    rollNumber = input.nextInt();
                    collegeName = input.next();
                    phoneNumber = input.nextLong();
                    email = input.next();
                    student1 = new Student();
                    student1.addEmployee(admNumber, name, rollNumber,collegeName, phoneNumber, email);
                    student.add(student1);
                    break;
            }
        }
    }
}