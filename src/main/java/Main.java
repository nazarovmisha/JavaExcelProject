
public class Main {
    public static void main(String[] args) {

        University university = new University();
        university.setId("1")
                .setFullName("Nizhny Novgorod State Technical University named after R. E. Alekseev")
                .setShortName("NGTU")
                .setYearOfFoundation(1925)
                .setStudyProfile(StudyProfile.PHYSICS);

        Student student1 = new Student();
        student1.setFullName("Ivan Petrov")
                .setUniversityId("1")
                .setCurrentCourseNumber(1)
                .setAvgExamScore(425735752);
        System.out.println(university);
        System.out.println(student1);

    }
}
