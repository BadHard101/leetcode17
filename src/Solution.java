import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Solution {
    public List<String> letterCombinations(String digits) {
        if (digits == null || digits.isEmpty()) {
            return new ArrayList<String>();
        }

        Map<Character, String> phoneMap = Map.of(
            '2', "abc",
            '3', "def",
            '4', "ghi",
            '5', "jkl",
            '6', "mno",
            '7', "pqrs",
            '8', "tuv",
            '9', "wxyz"
        );
        
        ArrayList<String> combinations = new ArrayList<>();
        combinations.add("");

        for (char digit : digits.toCharArray()) {
            ArrayList<String> newCombinations = new ArrayList<>();
            for (String combination : combinations) {
                for (char letter : phoneMap.get(digit).toCharArray()) {
                    newCombinations.add(combination + letter);
                }
            }
            combinations = newCombinations;
        }

        return combinations;
    }
}
