public class InstructorManager extends UserManager {
    public void add(User user){
        System.out.println("Öğretmen eklendi:"+user.getFirstName());
    }
    public void delete(User user){
        System.out.println("Öğretmen silindi:"+user.getFirstName());
    }
    public void update(User user){
        System.out.println("Öğretmen Güncellendi:"+user.getFirstName());
    }
}
