package Demo.SharePrograming.btTongHop;

public class Worker extends Officer {
    private int Level;

    public Worker(String name, int age, String gender, String address, int level) {
        super(name, age, gender, address);
        this.Level = level;
    }



    public int getLevel() {
        return Level;
    }

    public void setLevel(int level) {
        Level = level;
    }

    @Override
    public String toString() {
        return "Worker{" + super.toString() +
                "Level=" + Level +
                '}';
    }
}
