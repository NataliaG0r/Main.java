//Вычислить n-ое треугольное число (сумма чисел от 1 до n), n! (произведение чисел от 1 до n)
import java.util.Scanner;
public class Task1 {
    //Конструктор класса
    int n;

    public Task1() {
        System.out.println("Введите натуральное число n ");

        Scanner input = new Scanner(System.in);
        n = input.nextInt();
        input.close();
    }

    public void getTriangle() {
        int triangle = (n * (n + 1) / 2);


        System.out.println("Треугольное число равно " + triangle);

    }

    public void getFactorial() {
        int factorial = 1;
        for (int i = 1; i < (n + 1); i++) {
        factorial = factorial * i;
        }


        System.out.println("Факториал числа введенного числа равен " + factorial);
    }
}