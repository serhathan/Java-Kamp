public class Instructor extends User{
    String ─▒nstrucatorRank;
    int lessonUnit;

    public Instructor(int id, String firstName, String lastName, String mail, String password, String ─▒nstrucatorRank, int lessonUnit) {
        super(id, firstName, lastName, mail, password);
        this.─▒nstrucatorRank = ─▒nstrucatorRank;
        this.lessonUnit = lessonUnit;
    }
}
