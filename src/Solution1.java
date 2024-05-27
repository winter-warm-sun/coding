import java.util.*;

public class Solution1 {

}

class AnagramGrouping {
    public List<List<String>> groupAnagrams(String[] strs) {
        // 创建一个哈希表,用于存储字母异位词分组
        Map<String,List<String>> map=new HashMap<>();

        // 遍历输入的字符串数组
        for(String str:strs) {
            // 将字符串转换为字符数组并排序
            char[] charArray=str.toCharArray();
            Arrays.sort(charArray);
            // 将排序后的字符数组转换为字符串作为哈希表的键
            String sortedStr=new String(charArray);

            // 如果哈希表不存在这个键，则新建一个列表并将当前字符串加入其中
            // 如果存在，则将当前字符串加入对应的列表中
            List<String> anagrams=map.getOrDefault(sortedStr,new ArrayList<>());
            anagrams.add(str);
            map.put(sortedStr,anagrams);
        }

        // 返回哈希表中的值，即为字母异位词分组后的结果
        return new ArrayList<>(map.values());
    }

    public static void main(String[] args) {
        AnagramGrouping solution=new AnagramGrouping();
        // 测试用例
        String[] strs={"eat","tea","tan","ate","nat","bat"};
        List<List<String>> result=solution.groupAnagrams(strs);
        System.out.println(result);
    }
}
