public class for_loop {
    public static void main(String[] args) {
        for (int i = 10; i < 50; i++) {
            if ( i == 19 || i == 29 || i==39) {
                System.out.println(i);
            } else {
                System.out.printf(String.valueOf(i)+" ");
            }
        }
    }
}
