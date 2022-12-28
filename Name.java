import java.util.Scanner;

public class Name {
    public static void main(String[] args) {
        System.out.println("Как тебя зовут?");
        Scanner n =new Scanner(System.in);
        String s=n.nextLine();
        System.out.println("Привет "+s);
    }
}
