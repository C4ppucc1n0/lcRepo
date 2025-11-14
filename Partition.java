import java.util.*;

/* 给你一个字符串 s，请你将 s 分割成一些 子串，
使每个子串都是 回文串 。返回 s 所有可能的分割方案。 
输入：s = "aab"
输出：[["a","a","b"],["aa","b"]]
*/
public class Partition {
    static List<List<String>> partition(String s){
        List<List<String>> ans = new ArrayList<>();
        List<String> path = new ArrayList<>();
        return ans;
    }

    static void dfs(List<List<String>> ans,List<String> path,char[] s,){

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
