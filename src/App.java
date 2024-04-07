import java.util.Arrays;

public class App {
    public static void main(String[] args) throws Exception {
        int[] nums = {1,3,2,1};
        Solution sn = new Solution();
        int[] ans = sn.getConcatenation(nums);
        System.out.println(Arrays.toString(ans));
    }
}
