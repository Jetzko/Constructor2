public class Teacher {
    private String teacherName;
    public  Teacher (String teacherName) {
      System.out.println(teacherName + " is Here!");
    }
    public void assignFinalGrade(String alumn, int finalGrade){
        System.out.println(alumn + "'s final grade is " + finalGrade);
    }
}
