import java.util.*;

public class Subsets {
    /*  给你一个整数数组 nums ，数组中的元素 互不相同 。返回该数组所有可能的子集（幂集）。
        解集 不能 包含重复的子集。你可以按 任意顺序 返回解集。
        输入：nums = [1,2,3]
        输出：[[],[1],[2],[1,2],[3],[1,3],[2,3],[1,2,3]]
    */
    static List<List<Integer>> subsets(int[] nums){
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> path = new ArrayList<>();
        dfs(ans, path, nums, 0);
        return ans;
    }

    static void dfs(List<List<Integer>> ans,List<Integer> path,int[] nums,int i){
        ans.add(new ArrayList<>(path));
        if(i == nums.length){
            return;
        }
        for(int j = i ; j< nums.length;j++){
            path.add(nums[j]);
            dfs(ans, path, nums, j+1);
            path.remove(path.size() - 1);
        }
    }
    public static void main(String[] args) {
        int[] nums = new int[]{1,2,3};
        List<List<Integer>> ans = subsets(nums);
        System.out.println(ans);
    }
}
