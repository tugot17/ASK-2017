package Recursion;

/**
 * Created by pmazurek on 30.04.2017.
 */
public class Recursion1 {

    // * http://codingbat.com/prob/p183649
    public static int bunnyEars(int bunniesAmount) {
        if (bunniesAmount == 0)
            return 0;

        else
            return 2 + bunnyEars( bunniesAmount-1);

    }

    // * http://codingbat.com/prob/p107330
    public static int bunnyEars2(int bunnies) {
        if (bunnies == 0)
            return 0;

        else if (bunnies % 2 == 1)
            return 2 + bunnyEars2(bunnies -1);

        else
            return 3 + bunnyEars2(bunnies -1);

    }

    // * http://codingbat.com/prob/p101409
    public static int count7(int n) {

        if (n/10 == 0) {

            if (n == 7)
                return 1;

            else
                return 0;
        }

        else if (n % 10 == 7)
            return 1 + count7(n/10);
        else
            return count7(n/10);


    }

    // * http://codingbat.com/prob/p120015
    public static int fibbonaciRecursion(int number) {

        if (number == 0)
            return 0;

        else if (number == 1)
            return 1;

        else
            return fibbonaciRecursion(number - 1) + fibbonaciRecursion( number - 2);

    }

    // * http://codingbat.com/prob/p163932
    public static int sumDigits(int n) {
        if (n / 10 == 0)
            return n;

        else
            return n % 10 + sumDigits(n/10);
    }

    // * http://codingbat.com/prob/p194781
    public static int triangle(int rows) {

        if (rows == 0)
            return 0;

        else
            return rows + triangle(rows - 1);

    }

    // * http://codingbat.com/prob/p192383
    public static int count8(int n) {
        if (n/10 == 0) {

            if (n == 8)
                return 1;

            else
                return 0;
        }

        else if (n % 10 == 8) {
            if (n/ 10 % 10 == 8)
                return 2 + count8(n/10);
            else
                return 1 + count8(n/10);
        }
        else
            return count8(n/10);

    }

    // * http://codingbat.com/prob/p158888
    public static int powerN(int base, int n) {

        if (n == 1)
            return base;
        else
            return base * (powerN(base, n-1));
    }

    // * http://codingbat.com/prob/p170371
    public static int countX(String str) {

        if (str.length() == 0)
            return 0;

        if (str.length() == 1) {
            if (str.charAt(0) == 'x')
                return 1;

            else
                return 0;
        }

        else {
            if (str.charAt(str.length() - 1) == 'x')
                return 1 + countX(str.substring(0, str.length() - 1));

            else
                return countX(str.substring(0, str.length() - 1));
        }



    }

    // * http://codingbat.com/prob/p184029
    public static int countHi(String str) {

        if (str.length() == 0)
            return 0;

        else if (str.length() == 1 )
            return 0;

        else if (str.length() == 2) {
            if (str.equals("hi"))
                return 1;
            else
                return 0;
        }

        else {
            if (str.substring(str.length() - 2, str.length()).equals("hi")) {
                return 1 + countHi(str.substring(0, str.length() - 1));
            }
            else
                return countHi(str.substring(0, str.length() - 1));
        }
    }



    }
