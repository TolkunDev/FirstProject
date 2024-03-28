public class Student {
     private String name;
    private int age;
   private int course;
    private String group;
    public Student(){}
    public Student (String name, int age,int course, String group){
        this.name = name;
        this.age = age;
        this.course = course;
        this.group = group;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public  void setAge(int age){
        this.age = age;
    }
    public int getAge(){
        return age;
    }
    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }


}
