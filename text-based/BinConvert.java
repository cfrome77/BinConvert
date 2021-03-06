import java.util.*;

/**
 * This is the text based version of the decimal conversion program.
 * 
 * @author Chris Frome
 * @version 1.0 05/2018
 */
public class BinConvert
{
    public static Scanner scanIn = new Scanner(System.in);

    /**
     * This the main method to use the menu get the value and display the
     * answer. It also performs lots of error checking/
     * 
     * @param args
     *            - not used
     */
    public static void main(String[] args)
    {
        long input = 0;
        double inputIEEE = 0.0;
        boolean validAnswer = false;

        // Print the welcome message the first time
        System.out.println("Welcome to Bin Convert a binary conversion program\n");

        // Declare variable for user's option and defaulting to 0
        int menuOption = 0;
        do
        {
            try
            {
                do
                {

                    // Setting menuOption equal to return value from showMenu();
                    menuOption = showMenu();

                    // Switching on the value given from user and validating the
                    // input
                    switch (menuOption)
                    {

                    case 0:
                        System.out.println("Quitting Program...");
                        break;
                    case 1:
                        do
                        {
                            validAnswer = true;
                            try
                            {
                                System.out
                                        .print("Enter the number to convert to 32 bit unsigned: ");
                                input = scanIn.nextLong();
                                if (input < 0)
                                {
                                    System.out
                                            .println("Sorry, Invalid entry for unsigned(number < 0)...Please Retry!");
                                    validAnswer = false;
                                }
                            }
                            catch (Exception ex)
                            {
                                // Print error message
                                System.out
                                        .println("Sorry, Invalid entry for unsigned. Only decimal numbers allowed...Please Retry!");
                                // flush scanner
                                scanIn.next();
                                validAnswer = false;
                            }
                        }
                        while (!validAnswer);

                        System.out.println("\nOriginal number: " + input);
                        System.out.println("32 bit unsigned number: " + unsigned(input) + "\n");
                        break;
                    case 2:
                        do
                        {
                            validAnswer = true;
                            try
                            {
                                System.out
                                        .print("Enter the number to convert to 32 bit signed magnitude: ");
                                input = scanIn.nextLong();
                            }
                            catch (Exception ex)
                            {
                                // Print error message
                                System.out
                                        .println("Sorry, Invalid entry for sign magnitude. Only decimal numbers allowed...Please Retry!");
                                // flush scanner
                                scanIn.next();
                                validAnswer = false;
                            }
                        }
                        while (!validAnswer);

                        System.out.println("\nOriginal number: " + input);
                        System.out
                                .println("32 bit sign magnitude number: " + signMag(input) + "\n");
                        break;
                    case 3:
                        do
                        {
                            validAnswer = true;
                            try
                            {
                                System.out
                                        .print("Enter the number to convert to 32 bit ones compliment: ");
                                input = scanIn.nextLong();
                            }
                            catch (Exception ex)
                            {
                                // Print error message
                                System.out
                                        .println("Sorry, Invalid entry for ones comp. Only decimal numbers allowed...Please Retry!");
                                // flush scanner
                                scanIn.next();
                                validAnswer = false;
                            }
                        }
                        while (!validAnswer);

                        System.out.println("\nOriginal number: " + input);
                        System.out.println("32 bit ones complement number: " + onesComp(input)
                                + "\n");
                        break;
                    case 4:
                        do
                        {
                            validAnswer = true;
                            try
                            {
                                System.out
                                        .print("Enter the number to convert to 32 bit twos compliment: ");
                                input = scanIn.nextLong();
                            }
                            catch (Exception ex)
                            {
                                // Print error message
                                System.out
                                        .println("Sorry, Invalid entry for two's comp. Only decimal numbers allowed...Please Retry!");
                                // flush scanner
                                scanIn.next();
                                validAnswer = false;
                            }
                        }
                        while (!validAnswer);

                        System.out.println("\nOriginal number: " + input);
                        System.out.println("32 bit two's complement number: " + twosComp(input)
                                + "\n");
                        break;
                    case 5:
                        do
                        {
                            validAnswer = true;
                            try
                            {
                                System.out.print("Enter the number to convert to BCD: ");
                                input = scanIn.nextLong();
                            }
                            catch (Exception ex)
                            {
                                // Print error message
                                System.out
                                        .println("Sorry, Invalid entry for BCD. Only decimal numbers allowed...Please Retry!");
                                // flush scanner
                                scanIn.next();
                                validAnswer = false;
                            }
                        }
                        while (!validAnswer);

                        System.out.println("\nOriginal number: " + input);
                        System.out.println("BCD number: " + BCD(input) + "\n");
                        break;
                    case 6:
                        do
                        {
                            validAnswer = true;
                            try
                            {
                                System.out.print("Enter the number to convert to octal: ");
                                input = scanIn.nextLong();
                            }
                            catch (Exception ex)
                            {
                                // Print error message
                                System.out
                                        .println("Sorry, Invalid entry for octal. Only decimal numbers allowed...Please Retry!");
                                // flush scanner
                                scanIn.next();
                                validAnswer = false;
                            }
                        }
                        while (!validAnswer);

                        System.out.println("\nOriginal number: " + input);
                        System.out.println("octal number: " + octal(input) + "\n");
                        break;
                    case 7:
                        do
                        {
                            validAnswer = true;
                            try
                            {
                                System.out
                                        .print("Enter the number to convert to 32 bit hexadecimal: ");
                                input = scanIn.nextLong();
                            }
                            catch (Exception ex)
                            {
                                // Print error message
                                System.out
                                        .println("Sorry, Invalid entry for hexadecimal. Only decimal numbers allowed...Please Retry!");
                                // flush scanner
                                scanIn.next();
                                validAnswer = false;
                            }
                        }
                        while (!validAnswer);

                        System.out.println("\nOriginal number: " + input);
                        System.out.println("hexidecimal number: " + hexadecimal(input) + "\n");
                        break;
                    case 8:
                        do
                        {
                            validAnswer = true;
                            try
                            {
                                System.out
                                        .print("Enter the number to convert to IEEE single precision: ");
                                inputIEEE = scanIn.nextDouble();
                            }
                            catch (Exception ex)
                            {
                                // Print error message
                                System.out
                                        .println("Sorry, Invalid entry for IEEE single precision. Only decimal numbers allowed...Please Retry!");
                                // flush scanner
                                scanIn.next();
                                validAnswer = false;
                            }
                        }
                        while (!validAnswer);

                        System.out.println("\nOriginal number: " + inputIEEE);
                        System.out.println("IEEE single precision number: " + ieeeSingle(inputIEEE)
                                + "\n");
                        break;
                    case 9:
                        do
                        {
                            validAnswer = true;
                            try
                            {
                                System.out
                                        .print("Enter the number to convert to IEEE double precision: ");
                                inputIEEE = scanIn.nextDouble();
                            }
                            catch (Exception ex)
                            {
                                // Print error message
                                System.out
                                        .println("Sorry, Invalid entry for IEEE double precision. Only decimal numbers allowed...Please Retry!");
                                // flush scanner
                                scanIn.next();
                                validAnswer = false;
                            }
                        }
                        while (!validAnswer);

                        System.out.println("\nOriginal number: " + inputIEEE);
                        System.out.println("IEEE double precision number: " + ieeeDouble(inputIEEE)
                                + "\n");
                        break;
                    default:
                        System.out
                                .println("Sorry, please enter a valid Option. Only decimal numbers allowed.");
                        validAnswer = false;
                    }
                }
                while (menuOption != 0);

                // Exiting message when user decides to quit Program
                System.out.println("Thanks for using this Program...");
            }
            catch (InputMismatchException ime)
            {
                // Error Message
                System.out
                        .println("Sorry, please enter a valid Option. Only decimal numbers 0-9 allowed");
                scanIn.next();
                validAnswer = false;
            }
        }
        while (!validAnswer);
    }

    /**
     * Method that prints menu to screen and gets returns user's option from
     * menu
     *
     * @return Returns user Option
     */
    public static int showMenu()
    {
        // Declaring variable for user option and defaulting to 0
        int option = 0;
        boolean bad = false;

        // Printing menu to screen
        System.out.println("Menu:");
        System.out.println("0: exit");
        System.out.println("1. 32 bit unsigned");
        System.out.println("2. 32 bit sign magnitude number");
        System.out.println("3. 32 bit ones complement number");
        System.out.println("4. 32 bit two's complement number");
        System.out.println("5. BCD number");
        System.out.println("6. octal number");
        System.out.println("7. hexadcecimal number");
        System.out.println("8. IEEE Single Precision number");
        System.out.println("9. IEEE Double Precision number");

        do
        {
            System.out.print("\nEnter the choice to convert to: ");
            option = scanIn.nextInt();

            bad = (option < 0 || option > 9);

            if (bad)
                System.out.println("\nERROR IN INPUT\nEnter a number between 0 and 9\n");
        }
        while (bad);

        return option;
    }

    /**
     * A helper function for converting a number to a String.
     * 
     * @param number
     *            - the number n=being converted
     * @param size
     *            - the of the number
     * @param base
     *            - the base being used (i.e. octal or binary)
     * @return answer - the answer of the conversion
     */
    public static String convert(long number, int size, int base)
    {
        String answer = "";

        while (size > -1)
        {
            answer += (long) (number / Math.pow(base, size));
            number %= Math.pow(base, size);
            size--;
        }

        return answer;
    }

    /**
     * This function converts to 32 bit unsigned.
     * 
     * @param number
     *            - the number being converted
     * @return answer - the answer of the conversion
     */
    public static String unsigned(long number)
    {
        String answer = "";

        answer = convert(number, 31, 2);

        return answer;
    }

    /**
     * This method converts to 32 bit signed magnitude.
     * 
     * @param number
     *            - the number being converted
     * @return answer - the answer of the conversion
     */
    public static String signMag(long number)
    {
        String answer = "";

        if (number < 0)
        {
            number = -number;
            answer = 1 + convert(number, 30, 2);
        }
        else
        {
            answer = 0 + convert(number, 30, 2);

        }

        return answer;
    }

    /**
     * This method converts to 32 bit ones complement.
     * 
     * @param number
     *            - the number being converted
     * @return answer - the answer of the conversion
     */
    public static String onesComp(long number)
    {
        String answer = "";
        String unsigned = "";

        unsigned = convert(Math.abs(number), 31, 2);

        if (number < 0)
            for (int count = 0; count < 32; count++)
            {
                if (unsigned.charAt(count) == '0')
                    answer += "1";
                else
                    answer += "0";
            }
        else
            answer = unsigned;

        return answer;
    }

    /**
     * This method converts to 32 bit twos complement.
     * 
     * @param number
     *            - the number being converted
     * @return answer - the answer of the conversion
     */
    public static String twosComp(long number)
    {
        String answer = "";
        String unsigned = "";

        if (number < 0)
            unsigned = convert((Math.abs(number) + 1), 32, 2);
        else
            unsigned = convert(Math.abs(number), 31, 2);

        if (number < 0)
            for (int count = 0; count < 32; count++)
            {

                if (unsigned.charAt(count) == '0')
                    answer += "1";
                else
                    answer += "0";
            }

        else
            answer = unsigned;

        return answer;
    }

    /**
     * This method converts to binary-coded decimal.
     * 
     * @param number
     *            - the number being converted
     * @return answer - the answer of the conversion
     */
    public static String BCD(long number)
    {
        String answer = "";
        String BCDString = "";
        long remainder = 0;

        do
        {
            remainder = number % 10;
            answer = convert(remainder, 3, 2);
            BCDString = answer + BCDString;
            number = number / 10;
        }
        while (number != 0);

        return BCDString;
    }

    /**
     * This method converts to octal.
     * 
     * @param number
     *            - the number being converted
     * @return answer - the answer of the conversion
     */
    public static String octal(long number)
    {
        String answer = "";
        long remainder = 0;

        do
        {
            remainder = number % 8;

            answer = remainder + answer;

            number = number / 8;
        }

        while (number != 0);

        return answer;
    }

    /**
     * This method converts to hexadecimal.
     * 
     * @param number
     *            - the number being converted
     * @return answer - the answer of the conversion
     */
    public static String hexadecimal(long number)
    {
        String answer = "";
        long remainder = 0;

        do
        {
            remainder = number % 16;
            answer = (remainder <= 9 && remainder >= 0) ? ((char) ('0' + remainder) + answer)
                    : ((char) ('A' + (remainder - 10)) + answer);
            number = number / 16;
        }
        while (number != 0);

        return answer;
    }

    /**
     * This method converts to IEEE single precision.
     * 
     * @param number
     *            - the number being converted
     * @return answer - the answer of the conversion
     */
    public static String ieeeSingle(double number)
    {
        String answer = "";
        String IEEEString = "";
        long mantissa = 0;
        long exp = 127;

        if (Math.abs(number) > 1.0)
        {
            do
            {
                number /= 2.0;
                exp++;
            }
            while (Math.abs(number) >= 2.0);
        }
        else
        {
            do
            {
                number *= 2.0;
                exp--;
            }
            while (Math.abs(number) < 1.0);
        }

        mantissa = (long) ((Math.abs(number) - 1.0) * (Math.pow(2.0, 23.0)));
        IEEEString = convert(mantissa, 22, 2);
        answer = IEEEString;
        IEEEString = convert(exp, 7, 2);
        answer = IEEEString + answer;

        if (number < 0)
            answer = "1" + answer;
        else
            answer = "0" + answer;

        return answer;
    }

    /**
     * This method converts to IEEE double precision.
     * 
     * @param number
     *            - the number being converted
     * @return answer - the answer of the conversion
     */
    public static String ieeeDouble(double number)
    {
        String answer = "";
        String IEEEString = "";
        long mantissa = 0;
        long exp = 1023;

        if (Math.abs(number) > 1.0)
        {
            do
            {
                number /= 2.0;
                exp++;
            }
            while (Math.abs(number) >= 2.0);
        }
        else
        {
            do
            {
                number *= 2.0;
                exp--;
            }
            while (Math.abs(number) < 1.0);
        }

        mantissa = (long) ((Math.abs(number) - 1.0) * (Math.pow(2.0, 52.0)));
        IEEEString = convert(mantissa, 51, 2);
        answer = IEEEString;
        IEEEString = convert(exp, 9, 2);
        answer = IEEEString + answer;

        if (number < 0)
            answer = "1" + answer;
        else
            answer = "0" + answer;
        return answer;
    }
}
