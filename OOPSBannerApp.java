/**
 * OOPSBannerApp UC4 – Banner using Array and Loop
 * @author Chakradhar
 * @version 4.0
 */

public class OOPSBannerApp {

    public static void main(String[] args) {

        // Create String array to store banner lines
        String[] lines = new String[5];

        // Populate array using String.join()
        lines[0] = String.join(" ", " *** ", " *** ", " ***** ","***** ");
        lines[1] = String.join(" ", "*   *", "*   *", "*    *", "*     ");
        lines[2] = String.join(" ", "*   *", "*   *", "***** ", "*****");
        lines[3] = String.join(" ", "*   *", "*   *", "*     ", "    * ");
        lines[4] = String.join(" ", " *** ", " *** ", "*     ", "***** ");

        // Print using loop
        for (String line : lines) {
            System.out.println(line);
        }
    }
}
