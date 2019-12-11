import java.util.Scanner;

public class Exception4 {

    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.print("Enter an integer ");
        String intString = myScanner.next();
        try {
            int i = Integer.parseInt(intString);
            System.out.println(2 / i);

        } catch (NumberFormatException e) {
            System.out.println("Ошибка в формате введенного числа");
        }
        catch (ArithmeticException e) {
            System.out.println("Деление на 0");
        }
        finally
        {
            System.out.println("Конец");
        }
    }

}

