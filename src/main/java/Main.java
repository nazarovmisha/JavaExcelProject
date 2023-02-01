import java.io.IOException;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        List<University> universities = Input.inputUniversities("src/main/resources/universityInfo.xlsx");
        for (University u:universities){
            System.out.println(u);
        }

        List<Student> students = Input.inputStudents("src/main/resources/universityInfo.xlsx");
        for (Student s:students){
            System.out.println(s);
        }

   }
}
