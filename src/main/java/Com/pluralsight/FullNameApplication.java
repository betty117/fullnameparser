package Com.pluralsight;

import java.util.Scanner;

public class FullNameApplication {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.println("First Name:");
       String firstName =  (sc.nextLine());
       System.out.println("Middle Name:");
       String middleName =  (sc.nextLine());
       System.out.println("Last Name:");
       String lastName =  (sc.nextLine());
       System.out.println("suffix:");
       String suffix =  (sc.nextLine());
       //Build full name
        String fullName = firstName ;
        if (!middleName.isEmpty()) {
            fullName += " " +middleName;
        }
                fullName += " " +lastName;
                if (!suffix.isEmpty()) {
                fullName += "," + suffix;
              }
                //Output full name
                System.out.println( "Full Name: " + fullName);
                //clean input
        String Cleaned = cleanInput(fullName);
        System.out.println( " Cleaned Full Name: " + Cleaned);}

                //Method to trim space and remove invalid characters
            public static String cleanInput (String input) {
                //keep only letter,dots,and spaces
            return input.trim().replaceAll("[^a-zA-Z.]","");
            }


        }


