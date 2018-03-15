package interviewpractice.dynamicprogrammingbasic;

/**
 * @author benmakusha
 */
public class MapDecoding {

    int mapDecoding(String message) {
        if (message == null) return 0;
        if (message.length() == 0) return 1;
        int len = message.length();
        int[] dp = new int[len + 1];
        dp[0] = 1;
        dp[1] = message.charAt(0) == '0' ? 0 : 1;
        int mod = 1000000007;
        for (int i = 2; i <= len; i++) {
            int substitute1 = Integer.parseInt(message.substring(i-1, i));
            int substitute2 = Integer.parseInt(message.substring(i-2, i));
            if (substitute1 != 0)
                dp[i] += dp[i - 1] % mod;
            if (substitute2 > 9 && substitute2 < 27)
                dp[i] += dp[i - 2] % mod;
        }
        return dp[len];
    }
}
