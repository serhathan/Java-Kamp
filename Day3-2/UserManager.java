public class UserManager {
    public void add(User user){
        System.out.println("Kullanıcı eklendi:"+user.getFirstName());
    }

    public void delete(User user){
        System.out.println("Kullanıcı silindi:"+user.getFirstName());
    }
    public void update(User user){
        System.out.println("Kullanıcı Güncellendi:"+user.getFirstName());
    }
}
