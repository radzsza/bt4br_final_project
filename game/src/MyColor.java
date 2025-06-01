import java.awt.*;

public class MyColor {
    public static Color getColor(String colorName) {
        return (switch (colorName) {
            case "BLACK" -> Color.BLACK;
            case "WHITE" -> Color.WHITE;
            case "RED" -> Color.RED;
            case "BLUE" -> Color.BLUE;
            case "GREEN" -> Color.GREEN;
            case "YELLOW" -> Color.YELLOW;
            case "PINK" -> Color.PINK;
            default -> throw new IllegalStateException("Unexpected value: " + colorName);
        });
    }
}
