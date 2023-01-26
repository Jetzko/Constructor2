public class Start {
    public static void main(String[] arg) {

        Student student1 = new Student("Mario", 23);
        Student student2 = new Student("Lucia", 28);
        Teacher teacher1 = new Teacher("Olga");
        teacher1.assignFinalGrade(student1, 27);
        teacher1.assignFinalGrade(student2, 30);

        student1.getStudentDetails();
        student2.getStudentDetails();
    }
}
