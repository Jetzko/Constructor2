public class Student {
    private String name;
    private int grade;


    public  Student (String name, int grade){
        this.name = name;
        this.grade = grade;
        System.out.println(name + " is here!");
    }
    public void getStudentDetails(){
        System.out.println(name + " " + grade);
    }
}
