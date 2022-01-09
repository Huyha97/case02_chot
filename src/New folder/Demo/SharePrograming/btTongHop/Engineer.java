package Demo.SharePrograming.btTongHop;

public class Engineer extends Officer {
    private String branch;

    public Engineer(String name, int age, String gender, String address, String branch) {
        super(name, age, gender, address);
        this.branch = branch;
    }

    public String getbranch() {
        return branch;
    }

    public void setbranch(String branch) {
        branch = branch;
    }

    @Override
    public String toString() {
        return "Engineer{" + super.toString() +
                "branch='" + branch + '\'' +
                '}';
    }
}
