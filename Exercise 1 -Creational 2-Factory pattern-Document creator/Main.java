import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter document type (word/pdf): ");
        String type = scanner.nextLine();

        Document document = DocumentFactory.createDocument(type);
        document.open();
    }
}
