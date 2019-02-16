package arcadeUniverse.intro;

/**
 * @author benmakusha
 */
public class _12SortByHeight {

    public int[] sortByHeight(int[] a) {
        int temp = 0;

        for(int i = 0; i < a.length; i++) {
            if (a[i] == -1)
                continue;
            for (int j = 0; j < a.length; j++) {
                if (a[i] < a[j]) {
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        return a;
    }
}
