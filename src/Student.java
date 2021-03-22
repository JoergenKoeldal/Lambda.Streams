public class Student implements Comparable<Student> {

    public String group;
    public String email;
    public String firstName;
    public String lastName;

    public Student (String group, String email, String firstName, String lastName) {
        this.group = group;
        this.email = email;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return "Student{" +
                "group='" + group + '\'' +
                ", email='" + email + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }


    @Override
    public int compareTo(Student student) {
        if (group.compareTo(student.group) == 0) {
            return firstName.compareTo(student.firstName);
        }
        return group.compareTo(student.group);
    }
}
