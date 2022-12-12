import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;


class Result {

    /*
     * Complete the 'findModeCount' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER num
     *  2. INTEGER base
     *  3. STRING start
     */

    public class Solution {
        public static void main(String[] args) throws IOException {
            Scanner in = new Scanner (System.in);

            int num = Integer.parseInt(in.nextLine());

            int base = Integer.parseInt(in.nextLine());

            String start = in.nextLine();

            String convert = "";
            int digit = 0;
            int secondDigit = 10;
            int count = 0;
            int[] array = new int[num];
            String[] convertArray = new String[num];
            int[] scores = new int[16];
            int pos = 0;
            int begin = 0;
            String temp = "";
            int highest = 0;
            int highestDigit = 0;

            int zeroOccur = 0;
            int oneOccur = 0;
            int twoOccur = 0;
            int threeOccur = 0;
            int fourOccur = 0;
            int fiveOccur = 0;
            int sixOccur = 0;
            int sevenOccur = 0;
            int eightOccur = 0;
            int nineOccur = 0;
            int aOccur = 0;
            int bOccur = 0;
            int cOccur = 0;
            int dOccur = 0;
            int eOccur = 0;
            int fOccur = 0;

            // Converting back to base 10
            int newStart = 0;
            int exponent = 0;
            String convertString = "";


            for (int i = start.length() - 1; i >= 0; i--) {
                if (start.charAt(i) == 'A') {
                    newStart = (int) (newStart + (int) 10 * (Math.pow(base, exponent)));
                    exponent++;
                } else if (start.charAt(i) == 'B') {
                    newStart = (int) (newStart + (int) 11 * (Math.pow(base, exponent)));
                    exponent++;
                } else if (start.charAt(i) == 'C') {
                    newStart = (int) (newStart + (int) 12 * (Math.pow(base, exponent)));
                    exponent++;
                } else if (start.charAt(i) == 'D') {
                    newStart = (int) (newStart + (int) 13 * (Math.pow(base, exponent)));
                    exponent++;
                } else if (start.charAt(i) == 'E') {
                    newStart = (int) (newStart + (int) 14 * (Math.pow(base, exponent)));
                    exponent++;
                } else if (start.charAt(i) == 'F') {
                    newStart = (int) (newStart + (int) 15 * (Math.pow(base, exponent)));
                    exponent++;
                } else if (start.charAt(i) != '0') {
                    newStart = (int) (newStart + (int) Integer.parseInt(String.valueOf(start.charAt(i))) * (Math.pow(base, exponent)));
                    exponent++;
                } else {
                    exponent++;
                }
            }

            array[0] = newStart;

            for (int i = 1; i < array.length; i++) {
                array[i] = newStart + i;
            }

            for (int x = 0; x < array.length; x++) {
                convertArray[x] = Integer.toString(array[x], base);
                System.out.println(convertArray[x]);
            }

            for (int x = 0; x < convertArray.length; x++) {
                convertString = convertString + convertArray[x];
            }

            convertString = convertString.toUpperCase();

            for (int i = 0; i < convertString.length(); i++) {
                if (convertString.charAt(i) == '1') {
                    oneOccur++;
                } else if (convertString.charAt(i) == '0') {
                    zeroOccur++;
                } else if (convertString.charAt(i) == '2') {
                    twoOccur++;
                } else if (convertString.charAt(i) == '3') {
                    threeOccur++;
                } else if (convertString.charAt(i) == '4') {
                    fourOccur++;
                } else if (convertString.charAt(i) == '5') {
                    fiveOccur++;
                } else if (convertString.charAt(i) == '6') {
                    sixOccur++;
                } else if (convertString.charAt(i) == '7') {
                    sevenOccur++;
                } else if (convertString.charAt(i) == '8') {
                    eightOccur++;
                } else if (convertString.charAt(i) == '9') {
                    nineOccur++;
                } else if (convertString.charAt(i) == 'A') {
                    aOccur++;
                } else if (convertString.charAt(i) == 'B') {
                    bOccur++;
                } else if (convertString.charAt(i) == 'C') {
                    cOccur++;
                } else if (convertString.charAt(i) == 'D') {
                    dOccur++;
                } else if (convertString.charAt(i) == 'E') {
                    eOccur++;
                } else if (convertString.charAt(i) == 'F') {
                    fOccur++;
                }

                scores[0] = zeroOccur;
                scores[1] = oneOccur;
                scores[2] = twoOccur;
                scores[3] = threeOccur;
                scores[4] = fourOccur;
                scores[5] = fiveOccur;
                scores[6] = sixOccur;
                scores[7] = sevenOccur;
                scores[8] = eightOccur;
                scores[9] = nineOccur;
                scores[10] = aOccur;
                scores[11] = bOccur;
                scores[12] = cOccur;
                scores[13] = dOccur;
                scores[14] = eOccur;
                scores[15] = fOccur;

                for (int x = 0; x < scores.length; x++) {
                    if (scores[x] > highest) {
                        highest = scores[x];
                        highestDigit = x + 1;
                    }
                }
            }
        }
    }
}
