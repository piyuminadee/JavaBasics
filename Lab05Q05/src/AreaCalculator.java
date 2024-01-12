public class AreaCalculator {
     public static double calculateRectangleArea(double length, double width){
         double rectangleArea = length*width;
         return rectangleArea;

     }

     public static double calculateSquareArea(double sideLength){
         double SquareArea = sideLength*sideLength;
         return SquareArea;
     }

    public static void main(String[] args) {
       double rectangleLength = 5;
       double  rectangleWidth = 8;
       double squareSideLength = 4;
        calculateRectangleArea(rectangleLength, rectangleWidth);
        System.out.println("Area of Rectangle:"+ calculateRectangleArea(rectangleLength, rectangleWidth));
        calculateSquareArea(squareSideLength);
        System.out.println("Area of Square:"+  calculateSquareArea(squareSideLength));
    }
}
