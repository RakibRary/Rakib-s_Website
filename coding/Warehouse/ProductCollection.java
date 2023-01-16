import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class ProductCollection {
    Scanner scan = new Scanner(System.in);

    void printMenu() {
        System.out.println("Warehouse Menu");
        System.out.println("1.LIST OF ITEMS");
        System.out.println("2.ADD ITEMS");
        System.out.println("3.EXIT");
        System.out.println("PLEASE ENTER CHOICE: ");

    }

    public void productList() throws FileNotFoundException {
        System.out.println("Items in Warehouse");
        try {
            File myObj = new File("./src/productcollection.txt");
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                System.out.println(data);
            }
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }

    public void addItem() {
        String userInput = null;
        try {
            FileWriter myWriter = new FileWriter("./src/productcollection.txt", true);
            System.out.println("Please enter item:");
            userInput = scan.nextLine();
            myWriter.write(userInput);
            myWriter.write("\n");
            myWriter.close();
            System.out.println("Successfully added items to warehouse");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }

}
