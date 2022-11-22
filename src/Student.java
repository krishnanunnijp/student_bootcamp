import java.util.ArrayList;

public class Student {
    int admNumber;
    String name;
    int rollNumber;
    String collegeName;
    long phoneNumber;
    String email;

    public void addEmployee(int admNumber, String name, int rollNumber, String collegeName, Long phoneNumber, String emailAddress) {
        this.admNumber = admNumber;
        this.name = name;
        this.rollNumber = rollNumber;
        this.collegeName = collegeName;
        this.phoneNumber = phoneNumber;
        this.email = emailAddress;
    }

    @Override
    public String toString() {
        return "Student{" +
                "admNumber=" + admNumber +
                ", name='" + name + '\'' +
                ", rollNumber=" + rollNumber +
                ", collegeName='" + collegeName + '\'' +
                ", phoneNumber=" + phoneNumber +
                ", email='" + email + '\'' +
                '}';
    }
    public static void viewEmployees(ArrayList<Student> student) {
        System.out.println(student.size());
        for (int i = 0; i < student.size(); i++) {
            System.out.println(student.get(i).toString());
        }
    }
}
