package interviewpractice.arrays;

import java.util.*;

/**
 * @author benmakusha
 */
public class amazon {

    public List<String> reorderLines(int logFileSize, List<String> logfile) {
        List<String> result = new ArrayList<>();
        List<String> secondPlaced = new ArrayList<>();
        List<List<String>> conversion = new ArrayList<>();

        for (String word: logfile){
            conversion.add(Arrays.asList(word.split(" ")));
        }

        int index = 0;
        while (index < logFileSize) {
            for (int i = 0; i < conversion.size(); i++) {
                secondPlaced.add(conversion.get(index).get(1));
                index++;
            }
        }

        Collections.sort(secondPlaced, new Comparator<String>() {

            private boolean isThereAnyNumber(String a, String b) {
                return isNumber(a) || isNumber(b);
            }

            private boolean isNumber(String s) {
                return s.matches("[-+]?\\d*\\.?\\d+");
            }
            @Override
            public int compare(String o1, String o2) {
                return isThereAnyNumber(o1, o2) ? isNumber(o1) ? 1 : -1 : o1.compareTo(o2);
            }
        });
        int i = 0;
        while(result.size() != logFileSize) {
            for (String word: logfile) {
                if (word.contains(secondPlaced.get(i))){
                    result.add(word);
                }
            }
            //logfile.remove(i);
            i++;
        }


        return result;
    }
}
