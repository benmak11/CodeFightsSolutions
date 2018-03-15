package interviewpractice.arrays;

/**
 * @author benmakusha
 */

public class FirstDuplicate {

    public int firstDuplicate(int[] a) {
        if (a.length <= 1){
            return -1;
        }
        for (int index = 0; index < a.length; index++){
            int position= Math.abs(a[index]) - 1;
            if (a[position]<0){
                return position + 1;
            } else {
                a[position] =- a[position];
            }
        }
        return -1;
    }

}
