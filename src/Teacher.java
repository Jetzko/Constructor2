public class Teacher {
    private String teacherName;
    public  Teacher (String teacherName) {
      System.out.println(teacherName + " is Here!");
    }
    public int assignFinalGrade(Student student, int finalGrade){
      return student.grade = finalGrade;
    }
}
