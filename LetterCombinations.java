import java.util.*;


public class LetterCombinations {

    static Map<Character, String> phoneMap = new HashMap<Character, String>() {
        {
            put('2', "abc");
            put('3', "def");
            put('4', "ghi");
            put('5', "jkl");
            put('6', "mno");
            put('7', "pqrs");
            put('8', "tuv");
            put('9', "wxyz");
        }
    };
        

    static List<String> letterCombinations(String digits){
        List<String> ans = new ArrayList<>();
        char[] path = new char[digits.length()];
        dfs(ans, path, digits, 0);
        return ans;
    }

    static void dfs(List<String> ans,char[] path,String digits,int i){
        // 收集答案
        if(i == digits.length()){
            ans.add(new String(path));
            return;
        }
        // 枚举选哪个
        String tmp = phoneMap.get(digits.charAt(i));
        for(int j = 0 ;j<tmp.length();j++){
            path[i] = tmp.charAt(j);
            dfs(ans, path, digits, i+1);
        }
    }

    public static void main(String[] args) {
        List<String> ans = letterCombinations("2");
        System.out.println(ans);
    }
}
