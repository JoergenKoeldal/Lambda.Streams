import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    static List<Student> studentList = new ArrayList<>();



    public static void main(String[] args) {
    studentList.add(new Student("A", "kat@kat.dk", "Maja", "Bijaigrk"));
    studentList.add(new Student("B", "hund@hund.dk", "Jørgen", "Køldal"));
        studentList.add(new Student("B", "kat@kat.dk", "Heerrtyaja", "Bijaigrk"));
        studentList.add(new Student("B", "hund@hund.dk", "Heiørgen", "Køldal"));
        studentList.add(new Student("A", "kat@kat.dk", "Dam", "Bijaigrk"));
        studentList.add(new Student("A", "hund@hund.dk", "Henrik", "Køldal"));
//        fileReader();

    String group =
            studentList.stream().filter((Student s) -> s.firstName.equals("Maja")).findFirst().get().group;
        System.out.println(group);

        studentList.stream().sorted((s1,s2) -> s1.firstName.compareTo(s2.firstName)).forEach(s -> System.out.println(s));

        studentList.stream().sorted(Student::compareTo).forEach(s -> System.out.println(s));



    }









    public static void fileReader(){

        try {
            File myFile = new File("group.txt");
            Scanner myReader = new Scanner(myFile);
            while (myReader.hasNextLine()) {
                String[] data = myReader.nextLine().split(";");
                studentList.add(new Student(data[0], data[1], data[2], data[3]));
            }
            myReader.close();
        }catch (FileNotFoundException e) {
            System.out.println("Virker ikke");
            e.printStackTrace();
        }
    }

}
