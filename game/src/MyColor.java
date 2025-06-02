/**
 * Class used to get custom colors for the plots
 */

import java.awt.*;

public class MyColor {

    /**
     * @param colorName - name of a color from the color palette ComboBoxes, uppercase
     * @return - a custom color from the conditionBased color palettes
     */
    public static Color getColor(String colorName) {
        return (switch (colorName) {
            case "BLACK" -> Color.BLACK;
            case "WHITE" -> Color.WHITE;
            case "RED" -> Color.decode("#F5002A");
            case "GREEN" -> Color.decode("#35A049");
            case "BLUE" -> Color.decode("#4C599C");
            case "YELLOW" -> Color.decode("#DBB235");
            case "ORANGE" -> Color.decode("#DB7618");
            case "TURQUOISE" -> Color.decode("#38889C");
            default -> throw new IllegalStateException("Unexpected value: " + colorName);
        });
    }
}
