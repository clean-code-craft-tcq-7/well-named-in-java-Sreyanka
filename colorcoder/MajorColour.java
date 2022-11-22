package colorcoder;

public enum MajorColour {
    WHITE(0),
    RED(1),
    BLACK(2),
    YELLOW(3),
    VIOLET(4);
    
    private int index;
    
    private MajorColour(int index) {
        this.index = index;
    }
    int getIndex() {
        return index;
    }
    public static MajorColour fromIndex(int index) {
        for(MajorColor color: MajorColour.values()) {
            if(color.getIndex() == index) {
                return color;
            }
        }
        return null;
    }
};
