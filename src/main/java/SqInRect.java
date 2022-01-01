import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class SqInRect {
    /**
     * https://www.codewars.com/kata/55466989aeecab5aac00003e
     *
     * @param lng  The rectangle length
     * @param wdth The rectangle width
     * @return A List<Integer> of square sizes
     */
    public static List<Integer> sqInRect(int lng, int wdth) {
        List<Integer> rtn = new ArrayList<>();
        int[] arr = {lng, wdth};

        if (lng == wdth) {
            return null;
        }

        while (arr[1] > 0) {
            Arrays.sort(arr);
            rtn.add(arr[0]);
            arr[1] = arr[1] - arr[0];
        }


        return rtn;
    }


}
