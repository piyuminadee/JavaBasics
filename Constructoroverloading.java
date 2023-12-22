public class Constructoroverloading {
    private int value1;
    private int value2;

    public Constructoroverloading() {
        value2 = 0;
        value1 = 0;

    }

    public Constructoroverloading(int value1) {
        this.value1 = value1;
        value2 = 0;
    }

    public Constructoroverloading(int value1, int value2) {
        this.value1 = value1;
        this.value2 = value2;
    }
    public void displayValues(){
        System.out.println(value1);
        System.out.println(value2);
    }

    public static void main(String[] args) {
        Constructoroverloading obj1 = new Constructoroverloading();
        Constructoroverloading obj2 = new Constructoroverloading(34);
        Constructoroverloading obj3 = new Constructoroverloading(34,22);

        obj1.displayValues();
        obj2.displayValues();
        obj3.displayValues();
    }
}
