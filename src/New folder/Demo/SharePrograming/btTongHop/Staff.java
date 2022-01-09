package Demo.SharePrograming.btTongHop;

public class Staff extends Officer{
    private String task;

    public Staff(String name, int age, String gender, String address, String task) {
        super(name, age, gender, address);
        this.task = task;
    }

    public String gettask() {
        return task;
    }

    public void settask(String task) {
        task = task;
    }

    @Override
    public String toString() {
        return "Staff{" + super.toString() +
                 "task='" + task + '\'' +
                '}';
    }
}
