import java.util.Scanner;

import static java.lang.Integer.parseInt;

public class Task1_Calc {
    public static void main(String[] args) {

        String num1="", num2="", operator;
        String stopWord = "stop";
        int number1=0, number2=0, result=0;
        Scanner sc = new Scanner(System.in);

       while(true){
           System.out.println("Введите первое число");
           num1 = sc.nextLine();
           if (num1.equals(stopWord)) break;

           System.out.println("Введите второе число");
           num2 = sc.nextLine();
           if (num2.equals(stopWord)) break;

           System.out.println("Введите знак действия " +  '+' + '-' + '/' + '*' + '%');
           operator = sc.nextLine();
           if (operator.equals(stopWord)) break;


           try {
               number1 = parseInt(num1);
           } catch (NumberFormatException e) {
               System.out.println("Первое число — совсем не число. Давайте заново.");
           }

           try {
               number2 = parseInt(num2);
           } catch (NumberFormatException e) {
               System.out.println("Второе число — совсем не число. Давайте заново.");
           }

           switch (operator) {

               case "+":
                   result = number1 + number2;
                   System.out.println("Результат: " + result);
                   break;

               case "-":
                   result = number1 - number2;
                   System.out.println("Результат: " + result);
                   break;

               case "*":
                   result = number1 * number2;
                   System.out.println("Результат: " + result);
                   break;

               case "/":
                  try{
                      result = number1 / number2;
                      System.out.println("Результат: " + result);
                  }
                  catch(java.lang.ArithmeticException e) {
                      System.out.println("На ноль не делим!");
                  }
                   break;

               case "%":
                   result = number1 % number2;
                   System.out.println("Результат: " + result);
                   break;

               default:
                   System.out.println("Ваше действие — совсем не действие");
                   break;
           }



       }
    }
    }
