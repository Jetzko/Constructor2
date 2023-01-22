public class Teacher {
    private String teacherName;
    public  Teacher (String teacherName) {
      System.out.println(teacherName + " is Here!");
    }
    public void assignFinalGrade(Student student, int finalGrade){
        System.out.println(student + "'s final grade is " + finalGrade);
    }
}
