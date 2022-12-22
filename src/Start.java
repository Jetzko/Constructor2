public class Start {
    public static void main(String[] arg) {

        Student student1 = new Student("Mario", 26);
        Student student2 = new Student("Lucia", 28);
        Teacher teacher1 = new Teacher("Olga");
        teacher1.assignFinalGrade("Mario", 27);
        teacher1.assignFinalGrade("Lucia", 27);
    }
}
