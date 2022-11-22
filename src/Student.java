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
    public static void viewStudent(ArrayList<Student> student) {
        System.out.println(student.size());
        for (int i = 0; i < student.size(); i++) {
            System.out.println(student.get(i).toString());
        }
    }
    public static void searchStudent(int admNumber, ArrayList<Student> student) {
        int flag=0;
        for (int i = 0; i < student.size(); i++) {
            if(student.get(i).admNumber==admNumber){
                flag=1;
            }
        }
        if (flag == 0) {
            System.out.println("not found");
        }else {
            System.out.println("found");
        }
    }
    public static void deleteStudent(int admNumber,ArrayList<Student> student) {
        int flag=0;
        for (int i = 0; i < student.size(); i++) {
            if(student.get(i).admNumber==admNumber){
                student.remove(student.get(i));
            }
        }
    }
}
