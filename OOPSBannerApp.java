/**
 * OOPSBannerApp UC6 – Banner using Static Methods
 * @author Chakradhar
 * @version 6.0
 */

public class OOPSBannerApp {

    public static void main(String[] args) {

        // Create banner using methods
        String[] lines = {
            String.join(" ", getOPattern()[0], getOPattern()[1], getPPattern()[0], getSPattern()[0]),
            String.join(" ", getOPattern()[2], getOPattern()[3], getPPattern()[1], getSPattern()[1]),
            String.join(" ", getOPattern()[4], getOPattern()[5], getPPattern()[2], getSPattern()[2]),
            String.join(" ", getOPattern()[6], getOPattern()[7], getPPattern()[3], getSPattern()[3]),
            String.join(" ", getOPattern()[8], getOPattern()[9], getPPattern()[4], getSPattern()[4])
        };

        // Print banner
        for (String line : lines) {
            System.out.println(line);
        }
    }

    // Helper method for O pattern
    public static String[] getOPattern() {
        return new String[] {
            " *** ", " *** ",
            "*   *", "*   *",
            "*   *", "*   *",
            "*   *", "*   *",
            " *** ", " *** "
        };
    }

    // Helper method for P pattern
    public static String[] getPPattern() {
        return new String[] {
            " ***** ",
            "*    *",
            "***** ",
            "*     ",
            "*     "
        };
    }

    // Helper method for S pattern
    public static String[] getSPattern() {
        return new String[] {
            " ***** ",
            "*     ",
            "****  ",
            "    * ",
            "***** "
        };
    }
}