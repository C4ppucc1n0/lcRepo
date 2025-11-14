import java.util.*;


public class CombinationSum {

    static List<List<Integer>> findAns(int[] nums,int target){
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> path = new ArrayList<>();
        dfs(ans,path,nums,target,0);
        return ans;
    }
    
    
    // static void dfs(List<List<Integer>> ans,List<Integer> path,int[] nums,int left ,int i){
    //     // 之前是否已经凑齐了
    //     if(left == 0){
    //         ans.add(new ArrayList<>(path));
    //         return;
    //     }
        
    //     if(i == nums.length || left < nums[i]){
    //         return;
    //     }
    //     // 选或不选
    //     // 选i
    //     path.add(nums[i]);
    //     dfs(ans, path, nums, left - nums[i], i);
    //     path.remove(path.size() - 1);
    //     // 不选i
    //     dfs(ans, path, nums, left, i+1);
    // }


    static void dfs(List<List<Integer>> ans,List<Integer> path,int[] nums,int left ,int i){
        // 之前是否已经凑齐了
        if(left == 0){
            ans.add(new ArrayList<>(path));
            return;
        }
        
        // 枚举选哪个
        for(int j = i ; j<nums.length;j++){
            if(left < nums[j]){
                break;
            }
            path.add(nums[j]);
            dfs(ans,path,nums,left - nums[j],j);
            path.remove(path.size() - 1);
        }
    }
    public static void main(String[] args) {
        int[] nums = new int[]{2,3,6,7};
        int target = 7;
        List<List<Integer>> ans = findAns(nums,target);
        System.out.println(ans);
    }
}