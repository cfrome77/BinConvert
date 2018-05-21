package guiBased;
/**
 * This program takes a decimal number and converts it to other number formats.
 * 
 * @author kittfrome
 * @version 05/2018
 */
public class binConvert
{
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