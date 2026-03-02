/**
 * OOPSBannerApp UC7 – Using Inner Static Class
 * @author Chakradhar
 * @version 7.0
 */

public class OOPSBannerApp {

    /**
     * Inner static class to store character and its pattern
     */
    public static class CharacterPatternMap {

        private char character;
        private String[] pattern;

        /**
         * Constructor
         * @param character
         * @param pattern
         */
        public CharacterPatternMap(char character, String[] pattern) {
            this.character = character;
            this.pattern = pattern;
        }

        public char getCharacter() {
            return character;
        }

        public String[] getPattern() {
            return pattern;
        }
    }

    public static void main(String[] args) {

        CharacterPatternMap O = new CharacterPatternMap('O', new String[]{
            " *** ",
            "*   *",
            "*   *",
            "*   *",
            " *** "
        });

        CharacterPatternMap P = new CharacterPatternMap('P', new String[]{
            "*****",
            "*   *",
            "*****",
            "*    ",
            "*    "
        });

        CharacterPatternMap S = new CharacterPatternMap('S', new String[]{
            " *****",
            "*     ",
            " **** ",
            "     *",
            "***** "
        });

        CharacterPatternMap[] word = {O, O, P, S};

        for (int i = 0; i < 5; i++) {
            StringBuilder line = new StringBuilder();

            for (CharacterPatternMap c : word) {
                line.append(c.getPattern()[i]).append("  ");
            }

            System.out.println(line);
        }
    }
}