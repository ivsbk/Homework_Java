import java.util.InputMismatchException;
import java.util.Scanner;

public class Task3_Ticket {
    public static void main (String[] args){
        int number, numberCount, count = 0, number1, number2;
        Scanner sc = new Scanner(System.in);

            System.out.println("Введите номер билета:");
            try {
            number = sc.nextInt();
            numberCount = number;

                while (numberCount != 0) {
                    numberCount /= 10;
                    ++count;
                }

                if (count != 6) {
                    System.out.print("Неподходящий номер, нужно 6 цифр.");
                }

                number1 = number / 100000 + (number % 100000) / 10000 + (number % 10000) / 1000;
                number2 = (number % 1000) / 100 + (number % 100) / 10 + (number % 10);
                System.out.println(number1 + " " + number2);

                if (number1 == number2) {
                    System.out.println("Счастливый!");
                } else {
                    System.out.println("Не счастливый. Повезёт в другой раз.");
                }

            }
            catch (InputMismatchException e) {
                System.out.print("Неподходящий номер, работает только с цифрами.");
            }
        }

    }

