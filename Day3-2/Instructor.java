public class Instructor extends User{
    String ınstrucatorRank;
    int lessonUnit;

    public Instructor(int id, String firstName, String lastName, String mail, String password, String ınstrucatorRank, int lessonUnit) {
        super(id, firstName, lastName, mail, password);
        this.ınstrucatorRank = ınstrucatorRank;
        this.lessonUnit = lessonUnit;
    }
}
