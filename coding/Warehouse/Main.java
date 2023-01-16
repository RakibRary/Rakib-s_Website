import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        boolean loop = true;
        Scanner scanner = new Scanner(System.in);    //Scanner Import
        ProductCollection pc = new ProductCollection();

        while (loop) {
            pc.printMenu();
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    pc.productList();
                    break;
                case 2:
                    pc.addItem();
                    break;
                case 3:
                    System.out.println("Program ended good-bye!");
                    loop = false;
                    break;
            }
        }
    }
}