public class Student {
    public String name;
    public int grade;
    public  Student (String name, int grade){
        this.name = name;
        this.grade = grade;
        System.out.println(name + " is here!");
    }
    public void getStudentDetails(){
        System.out.println(name + "'s final grade is " + grade);
    }
}
