package interviewpractice.sorting;

/**
 * @author benmakusha
 */
public class HigherVersion2 {

    int higherVersion2(String ver1, String ver2) {
        String[] part1 = ver1.split("\\.");
        String[] part2 = ver2.split("\\.");
        int comp = 0;
        for(int index = 0; index < part1.length; index++){
            comp = Integer.parseInt(part1[index]) - Integer.parseInt(part2[index]);
            if(comp < 0)
                return -1;
            if(comp > 0)
                return 1;
        }
        return 0;
    }
}
