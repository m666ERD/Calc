import java.util.Scanner;
public class Program {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Введите коэффициент а");
        int a = in.nextInt();
        System.out.println("Введите коэффициент b");
        int b = in.nextInt();
        System.out.println("Введите коэффициент c");
        int c = in.nextInt();
        int D = b*b-(4*a*c);
        System.out.println(D);

        if (D<0) {
            System.out.println("Нет корней");
        }

        if (D == 0) {
            double x;
            x = -b/(2*a);
            System.out.println(x);
        }

        if (D>0) {
            double x1;
            x1 = (-b+(Math.sqrt(D)))/(2*a);
            double x2;
            x2 = (-b-(Math.sqrt(D)))/(2*a);
            System.out.println(x1);
            System.out.println(x2);
        }
    }
}


