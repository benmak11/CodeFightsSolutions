package interviewpractice.hashTables;

import java.util.HashMap;
import java.util.Map;

/**
 * @author benmakusha
 */

public class AreFollowingPatterns {

    public boolean areFollowingPatterns(String[] strings, String[] patterns) {
        if (patterns.length != strings.length) return false;

        Map<String, String> firstPattern = new HashMap<>();
        Map<String, String> secPattern = new HashMap<>();

        for (int index = 0; index < strings.length; ++index) {
            String str = strings[index];
            String pat = patterns[index];
            if (firstPattern.containsKey(str) && !firstPattern.get(str).equals(pat))
                return false;
            if (secPattern.containsKey(pat) && !secPattern.get(pat).equals(str))
                return false;

            firstPattern.put(str, pat);
            secPattern.put(pat, str);
        }
        return true;
    }

    // Better implementation
//    boolean areFollowingPatterns(String[] strings, String[] patterns) {
//        Map<String, String> m = new HashMap<>();
//        Map<String, String> n = new HashMap<>();
//        for (int i = 0; i < strings.length; ++i) {
//            String s = m.get(patterns[i]);
//            if (s == null) {
//                m.put(patterns[i], strings[i]);
//            } else if (!s.equals(strings[i])) return false;
//            String t = n.get(strings[i]);
//            if (t == null) {
//                n.put(strings[i], patterns[i]);
//            } else if (!t.equals(patterns[i])) return false;
//        }
//        return true;
//    }
}
