import java.util.Scanner;

public class Main
{

    public static void main(String[] args)
    {
	    Scanner input = new Scanner(System.in);

        System.out.print("Please tell the kiosk attendant your age: ");
        int age = input.nextInt();

        if (age >= 21)
            System.out.println("Congratulations! You receive a wristband!: ");
    }
}
