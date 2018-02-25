package interviewpractice.commonTechniquesBasic;

/**
 * @author benmakusha
 */
public class ProductExceptSelf {

    int productExceptSelf(int[] nums, int m) {

        int result = 0;
        int productSoFar = 1;
        for (int i = 0; i < nums.length; i++) {
            result = nums[i] * result + productSoFar;
            result %= m;
            productSoFar *= nums[i];
            productSoFar %= m;
        }

        return result;
    }


    //Uneffective solution on larger inputs
//    int productExceptSelf(int[] nums, int m) {
//
//        int[] result = new int[nums.length];
//        int productsSoFar = 1;
//        for (int i = 0; i < nums.length; i++) {
//            result[i] = productsSoFar;
//            productsSoFar *= nums[i];
//        }
//
//        productsSoFar = 1;
//        for (int i = nums.length - 1; i >= 0; i--) {
//            result[i] *= productsSoFar;
//            productsSoFar *= nums[i];
//        }
//
//        int actualResult = 0;
//        for (int i = 0; i < result.length; i++) {
//            actualResult = actualResult + (result[i] % m);
//        }
//
//        return actualResult % m;
//    }
}
