/**
 * OOPSBannerApp UC5 – Banner using Inline Array Initialization
 * @author Chakradhar
 * @version 5.0
 */

public class OOPSBannerApp {

    public static void main(String[] args) {

        // Declare and initialize array in one step
        String[] lines = {
            String.join(" ", " *** ", " *** ", " ***** ", " ***** "),
            String.join(" ", "*   *", "*   *", "*    *", "*     "),
            String.join(" ", "*   *", "*   *", "***** ", "****  "),
            String.join(" ", "*   *", "*   *", "*     ", "*   * "),
            String.join(" ", " *** ", " *** ", "*     ", "***** ")
        };

        // Print using loop
        for (String line : lines) {
            System.out.println(line);
        }
    }
}