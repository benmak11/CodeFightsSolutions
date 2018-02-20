package interviewpractice.trees;

/**
 * @author benmakusha
 */

public class FindProfession {

    public String findProfession(int level, int pos) {
        int sum = (int)Math.pow(2, level);
        int[] parents = new int[level];
        pos -= 1;
        parents[level - 1] = pos;
        for (int index = level - 2; index >= 0; --index){
            pos /= 2;
            parents[index] = pos;
        }

        String position = "E";
        for (int index = 1; index < level; ++index) {
            if (position.equals("E")) {
                if (parents[index] == parents[index - 1] * 2)
                    position = "E";
                else
                    position = "D";
            } else if (position.equals("D")) {
                if (parents[index] == parents[index - 1] * 2)
                    position = "D";
                else
                    position = "E";
            }
        }
        return position;
    }

}
