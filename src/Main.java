public class Main {
    public static void main(String[] args) {

        Course math = new Course("Math", "MAT101", "MAT");
        Course physic = new Course("Physic", "PHY101", "PHY");
        Course chemistry = new Course("Chemistry", "CHM101", "CHM");

        Teacher t1 = new Teacher("Mahmut ", "90550000000", "MAT");
        Teacher t2 = new Teacher("Fatma ", "90550000001", "PHY");
        Teacher t3 = new Teacher("Ali ", "90550000002", "CHM");

        math.addTeacher(t1);
        physic.addTeacher(t2);
        chemistry.addTeacher(t3);

        Student s1 = new Student("Tuba", 4, "140144015", math, physic, chemistry);
        s1.addBulkExamNote(50,30,60);
        s1.addVerbalNote(50,80,100);
        s1.isPass();

        Student s2 = new Student("Ceren", 4, "2211133", math, physic, chemistry);
        s2.addBulkExamNote(100,50,40);
        s2.addVerbalNote(90,90,90);
        s2.isPass();

        Student s3 = new Student("Ece", 4, "221121312", math, physic, chemistry);
        s3.addBulkExamNote(50,40,60);
        s3.addVerbalNote(100,100,100);
        s3.isPass();

    }
}