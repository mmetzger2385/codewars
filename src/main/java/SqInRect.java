import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class SqInRect {

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
