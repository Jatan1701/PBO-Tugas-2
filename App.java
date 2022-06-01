import java.util.Scanner;
import Model.Kubus;

public class App {
    public static void main(String[] args)throws Exception{
        System.out.println("Rumus volume Kubus by Jason sutanto : ");
        System.out.println("=============================================\n");
        Scanner keyboard = new Scanner (System.in);
    
        Kubus Kubus1 = new Kubus();
        System.out.print ("Masukkan sisi kubus =");
        Kubus1.s = keyboard.nextInt();
        Kubus1.volumeKubus();
    }

}