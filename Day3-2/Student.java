public class Student extends User{
    String studentRank;
    int score;

    public Student(int id, String firstName, String lastName, String mail, String password, String studentRank, int score) {
        super(id, firstName, lastName, mail, password);
        this.studentRank = studentRank;
        this.score = score;
    }
}
