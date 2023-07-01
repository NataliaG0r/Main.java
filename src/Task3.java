import java.util.Scanner;

// Реализовать простой калькулятор
public class Task3 {
double num1;
double num2;
public String  act;
double result;
public String str1 = "+";
public String str2 = "-";
public String str3 = "*";
public String str4 = "/";
    public Task3() {
        System.out.println("Введите первое число");

        Scanner input = new Scanner(System.in);
        num1 = input.nextDouble();
        System.out.println("Введите второе число");
        num2 = input.nextDouble();
        input.close();
    }

    public  void getAction ()  {

        System.out.println("Выберите  действие: + --> сложить; - --> вычесть; * --> умножить; / --> разделить");
        Scanner input = new Scanner(System.in);
        act = input.next();

        input.close();

    }



    public void getResult () {
        if(str1.equals(act)){
            result = num1 + num2;
        }
        else if (str2.equals(act)) {
            result = num1 - num2;
        }
        else if (str3.equals(act)){
            result = num1 * num2;
        }
        else if (str4.equals(act)){
            result = num1 / num2;
        }
        System.out.println(act);
    }
}

