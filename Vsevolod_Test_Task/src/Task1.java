import java.util.Scanner;
public class Task1 {
    public void counter (){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число: ");
        int number = scanner.nextInt();
        if(number > 7){
            System.out.println("Привет");
        }
    }
}
