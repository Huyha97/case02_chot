package bai15.baitap01;

public class TriangleException extends Throwable {

    public TriangleException(){
        super("IllegalTriangleException");
    }

    public TriangleException(String s) {
        super(s);
    }
}
