import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeSortedArrays {

    public static int[] mergeSortedArrays(int[] foo, int[] bar) {
        final int[] mergedArray = new int[foo.length + bar.length];
        int fooLength = foo.length;
        int barLength = bar.length;

        int fooPosition, barPosition, mergedPosition;
        fooPosition = barPosition = mergedPosition = 0;

        while (fooPosition < fooLength && barPosition < barLength) {
            if (foo[fooPosition] < bar[barPosition]) {
                mergedArray[mergedPosition] = foo[fooPosition];
                mergedPosition++;
                fooPosition++;
            } else {
                mergedArray[mergedPosition] = bar[barPosition];
                mergedPosition++;
                barPosition++;
            }
        }

        while (fooPosition < fooLength) {
            mergedArray[mergedPosition] = foo[fooPosition];
            mergedPosition++;
            fooPosition++;
        }

        while (barPosition < barLength) {
            mergedArray[mergedPosition] = bar[barPosition];
            mergedPosition++;
            barPosition++;
        }

        return mergedArray;
    }

    public static void main(String[] args) {
        int[] foo = { 3, 7 };
        int[] bar = { 4, 8, 11 };
        Arrays.stream(mergeSortedArrays(foo, bar)).forEach(System.out::println);
    }
}
