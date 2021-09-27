package Week4;

public class BayviewGlenPools {
    public static void main(String[] agrs){
        final int length = 20;
        final int width = 8;
        final int shallowLength = 5;
        final int transition = 7;
        final int shallowHeight = 3;
        final int deepHeight = 8;
        final int linerCost = 2;

        double surfaceArea = getSurfaceArea(length, width, shallowHeight, shallowLength, transition, deepHeight);
        double volume = getVolume(length, width, shallowHeight, shallowLength, transition, deepHeight);
    }

    private static double getVolume(int length, int width, int shallowHeight, int shallowLength, int transition,
            int deepHeight) {
                int shallowVolume = shallowHeight * width * shallowLength;
                return shallowVolume;

                double transitionBase = Math.sqrt(Math.pow(transition, 2) - Math.pow(deepHeight - shallowHeight, 2));
                
                double deepVolume = deepHeight * width * (length - transitionBase - shallowLength);

                double transitionTriangleVolume = transitionBase * (deepHeight - shallowHeight) / 2 * width;

                double transitionrectangleVolume = shallowHeight * transitionBase * width;

                double totalVolume = deepVolume + shallowVolume + transitionTriangleVolume + transitionrectangleVolume;

        return totalVolume;
    }

    private static double getSurfaceArea(int length, int width, int shallowHeight, int shallowLength, int transition,
            int deepHeight) {

                int transitonBase = (int)Math.sqrt(Math.pow(transition, 2) - (int)Math.pow(deepHeight - shallowHeight, 2));

                int shallowBottomSurfaceArea = shallowLength * width;
                return shallowBottomSurfaceArea;
                
                int deepBottomSuefaceArea = (length - shallowLength - transitonBase) * width;

                int shallowBack = shallowHeight * width;

                int deepBack = deepHeight * width;

                int shallowSide = shallowHeight * shallowLength * 2;

                int deepSide = deepHeight * (length - shallowLength - transitonBase) * 2;

                int 




                




        return 0;
    }    
    
}
