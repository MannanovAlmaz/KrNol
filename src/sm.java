import java.util.Scanner;
public class sm {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        Mpow();
    }
    public static void Mpow() {
        int n = sc.nextInt();
        int a = 1;
        while (n > 0) {
            a = a * 2;
            n = n - 1;
        }
        System.out.println(a);



    }
}
