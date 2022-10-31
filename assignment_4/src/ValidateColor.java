import java.util.HashMap;

public class ValidateColor {

    String getColorAsKey(int red, int green, int blue) {
        return String.valueOf(red) + String.valueOf(green) + String.valueOf(blue);
    }

    Color checkIfColorExist(HashMap<String,Color> colors, int red, int green, int blue) {
        String keyValue = getColorAsKey(red, green, blue);
        for(String key : colors.keySet()){
            if(key.equals(keyValue)) {
                return colors.get(key);
            }
        }
        return null;
    }

    boolean checkColorsRanges(int red, int green, int blue) {
        if(validRange(red) && validRange(green) && validRange(blue)){
            return true;
        }
        return false;
    }

    boolean validRange(int color){
        if(color >= 0 && color <=255){
            return true;
        }
        return false;
    }
}
