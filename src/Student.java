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
}
