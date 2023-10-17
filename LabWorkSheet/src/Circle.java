public class Circle {

    public static void main(String[] args) {
        setRadious();

    }

    static void computeArea(int r0, int r1){
            double area = 3.14*r1*r1 - 3.14*r0*r0  ;
        System.out.println("The area of the circle = "+area);
    }

    static void computeCircomference(int r0, int r1){
            double circomference =  2*3.14*r0 + 2*3.14*r1;
        System.out.println("The circomference of the circle = "+ circomference);

    }

    static void setRadious(){
        int r0=7;
        int r1=14;
        computeArea(r0,r1);
        computeCircomference(r0,r1);

    }

}
