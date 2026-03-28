import java.util.Arrays;
import java.util.Scanner;

public class Javapedia {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        System.out.println("\nHow many historical firgures will you register? ");
        int numberofFigures = scan.nextInt();
        scan.nextLine();

        String[][] figuresTable = new String[numberofFigures][3];

        for (int i = 0 ; i < figuresTable.length; i++) {
            System.out.println("\nFigure: " + (i + 1));
            System.out.println("Enter Name: ");
            String name = scan.nextLine();
            System.out.println("Date of Birth: ");
            String dateofBirth = scan.nextLine();
            System.out.println("Occupation: ");
            String occupation = scan.nextLine();

            figuresTable[i][0] = name;
            figuresTable[i][1] = dateofBirth;
            figuresTable[i][2] = occupation;
        }

        for (int x = 0; x< figuresTable.length; x++) {
            System.out.println(Arrays.toString(figuresTable[x]));
        }

        System.out.println("\nWhose info do you need? ");
        String person = scan.nextLine();

        String pullInfo = "";
        for (int p = 0; p < figuresTable.length; p++ ) {
            if (figuresTable[p][0].toLowerCase().equals(person.toLowerCase())) {
                pullInfo = figuresTable[p][0];
                System.out.println(Arrays.toString(figuresTable[p]));
                break;
            } }

        if (pullInfo.equals("")) {
            System.out.println(person + " Not in Database.");
            }
            
        scan.close();
    }
}
    
