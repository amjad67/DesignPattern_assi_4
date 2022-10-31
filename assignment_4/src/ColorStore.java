import java.util.HashMap;

public class ColorStore extends ValidateColor {
    private static HashMap<String,Color> colors = new HashMap<>();

    Color addColor(int red, int green, int blue) {
        if(checkColorsRanges(red, green, blue)) {
            Color temp = checkIfColorExist(colors,red,green,blue);
            if(temp == null){
                Color tempColor = new Color(red, green, blue);
                colors.put(getColorAsKey(red, green, blue),tempColor);
                System.out.println("Color stored successfully.\n");
                return tempColor;
            }
            else
            {
                System.out.println("Color already exist ... returned from cache.");
                return temp;
            }
        }
        else {
            System.out.println("Plz enter valid range...\n\n");
            return null;
        }
    }

    String getColorName(int red, int green, int blue) {
        if(!checkColorsRanges(red, green, blue)){
            return "Input out of range.";
        }
        String keyValue = getColorAsKey(red, green, blue);
        for(String key : colors.keySet()){
            if(key.equals(keyValue)) {
                return "The color is " + colors.get(key).getColorName();
            }
        }
        return "Color is not stored";
    }
}