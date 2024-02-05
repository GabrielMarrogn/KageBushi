import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNext()) {

            int a = sc.nextInt();

            int clone = 1;
            int calc = 0;

            while (clone != a) {
                clone = clone * 2;
                calc++;
            }

            System.out.println(calc);
        }
        sc.close();
    }
}
