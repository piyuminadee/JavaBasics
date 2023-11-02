import java.util.StringTokenizer;

public class Sample {
    public static void main(String[] args) {
        String text = "C,Java:Python";
        StringTokenizer st = new StringTokenizer(text, ":");
        while (st.hasMoreTokens())
            System.out.println(st.nextToken());
    }
}
