public class Main {

    public static void main(String[] args) {
        Instructor instructor1=new Instructor(1,"Engin","Demirog","abc@gmail.com","123456","1",3);
        Student student1=new Student(1,"Serhat","Güney","serhathan98@gmail.com","321456","1",100);

        StudentManager studentManager=new StudentManager();
        studentManager.add(student1);
        studentManager.delete(student1);
        studentManager.update(student1);

        InstructorManager instructorManager=new InstructorManager();
        instructorManager.add(instructor1);
        instructorManager.delete(instructor1);
        instructorManager.update(instructor1);

    }
}
