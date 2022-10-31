public class ColorName {
    String nameOfColor(int red, int green, int blue){
        ValidateColor validateColor = new ValidateColor();
        if(!validateColor.checkColorsRanges(red, green, blue)){
            System.out.println("Wrong ranges..");
        }
        if(red == 0 && green == 0 && blue == 0) {
            return "Black (Default)";
        }
        else if(red == 255 && green == 255 && blue == 255){
            return "White (Default)";
        }
        else if(red == 255 && green == 0 && blue == 0){
            return "Red (Default)";
        }
        else if(red == 0 && green == 128 && blue == 0){
            return "Green (Default)";
        }
        else if(red == 0 && green == 0 && blue == 255){
            return "Blue (Default)";
        }
        else{
            return "("+String.valueOf(red) + ","
                    + String.valueOf(green) + ","
                    + String.valueOf(blue) + ")";
        }
    }
}
