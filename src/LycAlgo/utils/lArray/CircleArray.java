package LycAlgo.utils.lArray;

/**
 * Created by lyc on 2017/9/15.
 */
public class CircleArray {

    int[] circleArray;

    public CircleArray(int[] i) {
        int l = i.length;

        circleArray = new int[l];
        for (int j = 0; j < circleArray.length; j++) {
            j = j % l;
            circleArray[j] = i[j];
        }

    }

    public int get(int index) {
        int j = index % circleArray.length;
        return circleArray[j];
    }

    public int[] getCircleArray() {
        return circleArray;
    }

}
