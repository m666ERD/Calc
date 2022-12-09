import java.util.Scanner;
public class Calc {

    public static void main(String[]args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Калькулятор \n");
        System.out.println("Выберите операцию:\n"+
                            "Умножение(*)\n"+
                            "Деление(/)\n"+
                            "Сложение(+)\n"+
                            "Возведение в квадрат(^)\n"+
                            "Вычитание(-)");
        String b = in.nextLine();
        System.out.println("Введите первое число ");
        int a = in.nextInt();
        in.nextLine();


            if (b.equals("^")) {
                System.out.println(a*a);
            }

            else {
                System.out.println("Введите второе число");
                int c = in.nextInt();
                in.nextLine();

                if (b.equals("*")) {
                    System.out.println(a * c);
                }

                if (b.equals("/")) {
                    System.out.println(a / c);
                }

                if (b.equals("+")) {
                    System.out.println(a + c);
                }

                if (b.equals("-")) {
                    System.out.println(a - c);
                }
            }
    }

}