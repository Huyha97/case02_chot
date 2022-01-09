package thucHanh;

public class Student01 {
    private String name = "John";
    private String classes = "C02";

    public Student01() {
    }

    void setName(String name) {
        this.name = name;
    }

//    public void setClasses(String lop){
//        this.classes = lop;
//    }

    void setClasses(String classes) {
        this.classes = classes;
    }

    @Override
    public String toString() {
        return "Student01{" +
                "name='" + name + '\'' +
                ", classes='" + classes + '\'' +
                '}';
    }
}
