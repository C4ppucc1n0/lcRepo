import java.util.*;

public class GenerateParenthesis {

    /**
     * @param n
     * @return
     */
    static List<String> generateParenthesis(int n){
        List<String> ans = new ArrayList<>();
        char[] path = new char[2 * n];
        dfs(ans,path,n,0,0);
        return ans;
    }

    static void dfs(List<String> ans,char[] path,int n,int left,int right){
        if(left + right == 2 * n){
            ans.add(new String(path));
            return;
        }
        // 可以加左括号
        if(left < n){
            path[left + right] = '(';
            dfs(ans, path, n, left + 1, right);
        }
        if(left > right){
            path[left + right] = ')';
            dfs(ans, path, n, left, right+ 1);
        }
    }

    public static void main(String[] args) {
        List<String> ans = generateParenthesis(1);
        System.out.println(ans);
    }
    
}