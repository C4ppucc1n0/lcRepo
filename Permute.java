import java.util.*;

public class Permute {
    /*  给定一个不含重复数字的数组 nums ，返回其所有可能的全排列。
        输入：nums = [1,2,3]
        输出：[[1,2,3],[1,3,2],[2,1,3],[2,3,1],[3,1,2],[3,2,1]] 
    */
    static List<List<Integer>> permute(int[] nums){
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> path = new ArrayList<>();
        boolean[] onPath = new boolean[nums.length];
        dfs(ans, path, onPath, nums, 0);
        return ans;
    }

    static void dfs(List<List<Integer>> ans ,List<Integer> path, boolean[] onPath , int[] nums,int i ){
        if(i == nums.length){
            ans.add(new ArrayList<>(path));
            return;
        }
        // 枚举选哪个
        for(int j = 0 ; j < nums.length;j++){
            if(onPath[j]  == false){
                onPath[j] = true;
                path.add(nums[j]);
                dfs(ans, path, onPath, nums, i+ 1);
                onPath[j] = false;
                path.remove(path.size() - 1);
            }
        }
    }

    public static void main(String[] args) {
        int[] nums = new int[]{1,2,3};
        List<List<Integer>> ans = permute(nums);
        System.out.println(ans);
    }
}
