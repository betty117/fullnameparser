package Com.pluralsight;

import java.util.Scanner;

public class FullNameParser {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        //prompt user for input
        System.out.print("please inter your name:");
        String input = scanner.nextLine().trim();
        // split by spaces
        String[] parts = input.split("\\s+");

        String firstName = "";
        String middleName = "(none)";
        String lastName = "";

        //process based on number of parts
        if (parts.length == 2) {
             firstName = parts[0];
             lastName= parts[1];
        } else if (parts.length ==3) {

            firstName = parts[0];
            middleName = parts[1];
            lastName = parts[2];
        }     else {

            System.out.println("Invalid name formal.plc enter eight 'first last' or 'first middle'.");
            return;
        }
        // display result
                System.out.println("first name: " + firstName );
                System.out.println(" middle name:"+ middleName );
                System.out.println(" last name:"+ lastName );
                //print fill name
                if (middleName.equals("(none)")) {
                    System.out.print(" firstName: " + firstName + " " + lastName);
            } else{
                     System.out.print(" firstName: "  + middleName +  " "  + lastName);
                    }
                }


            }










