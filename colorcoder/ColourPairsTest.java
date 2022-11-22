package colorcoder;
 
public class ColourPairsTest
{
static void testNumberToPair(int pairNumber,
        MajorColor expectedMajor,
        MinorColor expectedMinor)
    {
        ColourPairs colourPairs = ColourPairs.GetColorFromPairNumber(pairNumber);
        System.out.println("Got pair " + colourPairs.ToString());
        assert(colourPairs.getMajor() == expectedMajor);
        assert(colourPairs.getMinor() == expectedMinor);
    }

    static void testPairToNumber(
        MajorColor major,
        MinorColor minor,
        int expectedPairNumber)
    {
        int pairNumber = ColourPairs.GetPairNumberFromColor(major, minor);
        System.out.println("Got pair number " + pairNumber);
        assert(pairNumber == expectedPairNumber);
    }
}
