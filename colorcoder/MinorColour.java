package colorcoder;

public enum MinorColour {
    BLUE(0),
    ORANGE(1),
    GREEN(2),
    BROWN(3),
    SLATE(4);
    
    private int index;
    
    private MinorColour(int index) {
        this.index = index;
    }
    int getIndex() {
        return index;
    }
    public static MinorColour fromIndex(int index) {
        for(MinorColour color: MinorColour.values()) {
            if(color.getIndex() == index) {
                return color;
            }
        }
        return null;
    }
};
