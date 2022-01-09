package buoi06.point_Moveablepoint;

public class MoveablePoint extends  Point{

    private double xSpeed = 0;
    private double ySpeed = 0;
    public MoveablePoint(){}

    public MoveablePoint(double x, double y, double xSpeed, double ySpeed) {
        super(x, y);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public MoveablePoint(double xSpeed, double ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }


    public double getxSpeed() {
        return xSpeed;
    }

    public void setxSpeed(double xSpeed) {
        this.xSpeed = xSpeed;
    }

    public double getySpeed() {
        return ySpeed;
    }

    public void setySpeed(double ySpeed) {
        this.ySpeed = ySpeed;
    }

    public void setSpeed(double xSpeed, double ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public double[] getSpeed() {
        double[] arr = new double[] {xSpeed,ySpeed};
        return arr;
    }


    public String toString() {
        return "MoveablePoint{" +
                "xSpeed =" + xSpeed +
                ", ySpeed =" + ySpeed +
                ",x= " + getX() +",y= " + getY();
    }
    public MoveablePoint moveablePoint(){
        double x = getX();
        double y = getY();
        x += xSpeed;
        y += ySpeed;
        return this;
    }
}
