import java.util.HashMap;

public class Color extends ColorName{
    private int red;
    private int green;
    private int blue;

    Color(int red, int green, int blue) {
        this.red = red;
        this.green = green;
        this.blue = blue;
    }

    String getColorName() {
        return nameOfColor(red,green,blue);
    }

}
