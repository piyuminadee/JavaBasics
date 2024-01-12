public class MathOperations {

    static double pi = 3.14159;
    //public double area;
    //public  double side;

    public void calculateCircleArea(double radius){
        double area = pi * radius * radius;
        System.out.println("area of a circle:"+area);
    }

    public void calculateSquareArea(double side){
        //Object side = null;
       double area = side * side;
        System.out.println("area of a square:"+ area);
    }
}
