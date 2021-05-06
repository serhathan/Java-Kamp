public class StudentManager extends UserManager{
    public void add(User user){
        System.out.println("Öğrenci eklendi:"+user.getFirstName());
    }
    public void delete(User user){
        System.out.println("Öğrenci silindi:"+user.getFirstName());
    }
    public void update(User user){
        System.out.println("Öğrenci Güncellendi:"+user.getFirstName());
    }
}
