package madeira.cs;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
            Problem I
            --------
            Write a program that prints your full name
            You must:
                a. Print your full name on a single output line
                b. Use 1 print statement for each part of your name (i.e. first, middle, last)
         */

        System.out.print("Eliza");
        System.out.print (" Mallory");
        System.out.print (" Reed");

        /*
            Problem II
            --------
            Write a program that prints "Hello World"
            You must:
                a. Print on two separate lines
                b. Not use the "println()" method
         */

        System.out.print ("\nHello,\nWorld\n");


        /*
            Problem III
            --------
            Write a program that reads your age in years
            You must:
                a. Print the variable type of their age (i.e. int)
         */
System.out.println ("Please enter my age in years.");

Scanner myScanner = new Scanner (System.in);
String ScannerString = myScanner.nextLine();

        try
        {
            Integer.parseInt(ScannerString);
            System.out.println(ScannerString + " is an integer.");
        }
        catch (NumberFormatException e)
        {
            System.out.println(ScannerString + " is not an integer.");
        }


        /*
            Problem IV
            --------
            Write a program that reads your first and last name (in two separate prompts).
            You must:
                a. Notify the user whether they've entered your first or last name
                b. The names can be entered in any order
         */
System.out.println ("Please enter my first or last name.");

Scanner myScanner2 = new Scanner (System.in);

String ScannerString2 = myScanner2.nextLine ();

        if (ScannerString2.equals("Eliza")) {
            System.out.println ("You have entered my first name.");
        }
        else if(ScannerString2.equals("Reed")) {
            System.out.println ("You have entered my last name.");
        }
else {
            System.out.println ("You have not entered any part of my name.");
        }
System.out.println ("Please enter my first or last name.");
        Scanner myScanner3 = new Scanner (System.in);

        String ScannerString3 = myScanner3.nextLine ();

        if (ScannerString3.equals("Eliza")) {
            System.out.println ("You have entered my first name.");
        }
        else if(ScannerString3.equals("Reed")) {
            System.out.println ("You have entered my last name.");
        }
        else {
            System.out.println("You have not entered any part of my name.");
        }

        /*
            Problem V
            --------
            Fix the errors such that the following will print false.
            You must:
                a. Only change the numbers, not the boolean assignment
         */
        int i = 2;
        int x = 1;
        int j = 2;
        boolean b = false;
        b = j % x == i;
        System.out.print(b);



        // ==================
        // EXTRA CREDIT BELOW
        // ==================


        /*
            Problem VI
            --------
            Write a program that prints your age in 5 years
            You must:
                a. Read your current age
                b. Manipulate that number
         */









        /*
            Problem VII
            --------
            Write a program that reads 3 numbers, sums them & divides the sum by 2
            You must:
                a. Print the result
                b. Use a mix of decimals and integers
                c. Your result should be a decimal
         */







        /*
            Problem VIII
            --------
            Write a program that reads in a string and identifies if the string is your name
            You must:
                a. Give the user 3 guesses
                b. Present them with a success or fail message
         */






        /*
            Problem IX
            --------
            Write a program that reads input from a file called "readme.txt"
            You must:
                a. Print the content of the file
            Hints:
                a. Create the file, write some stuff, save it to the same folder as your program
         */









        /*
            Problem X
            --------
            Write a program that reads a 10 digit number & adds 1 to each DIGIT in the number.
            Print the result as a recombined whole number
            e.g.
            Initial number: 12345678910
            New number: 234567891011
         */












    }
}