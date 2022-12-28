import java.util.Scanner;

public class Age {
    public static void main(String[] args) {
        System.out.println("Когда ты родился (год)?");
        Scanner g = new Scanner(System.in);
        int y = g.nextInt();
        System.out.println("Тебе сейчас "+(2022-y));
    }
}
