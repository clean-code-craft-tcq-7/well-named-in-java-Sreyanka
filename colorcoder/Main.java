  
package colorcoder;


public class Main {
  public static void main(String[] args) {
        ColourPairsTest.testNumberToPair(4, MajorColor.WHITE, MinorColor.BROWN);
        ColourPairsTest.testNumberToPair(5, MajorColor.WHITE, MinorColor.SLATE);
    
        ColourPairsTest.testPairToNumber(MajorColor.BLACK, MinorColor.ORANGE, 12);
        ColourPairsTest.testPairToNumber(MajorColor.VIOLET, MinorColor.SLATE, 25);
    
    System.out.println("-- Reference Manual --");
       ColourPairs.printColorsAndPairNumber();
       System.out.println("------");
    }
}
