import java.util.*;

public class Partition {

    /*  给你一个字符串 s，请你将 s 分割成一些 子串，
        使每个子串都是 回文串 。返回 s 所有可能的分割方案。 
        输入：s = "aab"
        输出：[["a","a","b"],["aa","b"]]
    */
    static List<List<String>> partition(String s){
        List<List<String>> ans = new ArrayList<>();
        List<String> path = new ArrayList<>();
        dfs(ans, path, s, 0);
        return ans;
    }

    static void dfs(List<List<String>> ans,List<String> path,String s,int i ){
        if(i == s.length()){
            ans.add(new ArrayList<>(path));
            return;
        }
        for(int j = i ;j<s.length();j++){
            String seg = s.substring(i, j+1);
            if(isPalindrome(s, i, j)){
                path.add(seg);
                dfs(ans, path, s, j+1);
                path.remove(path.size() - 1);
            }
        }
    }

    static boolean isPalindrome(String s,int left,int right){
        while(left < right){
            if(s.charAt(right) != s.charAt(left)){
                return false;
            }else{
                left++;
                right--;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        List<List<String>> ans = partition("aab");
        System.out.println(ans);
    }
}
