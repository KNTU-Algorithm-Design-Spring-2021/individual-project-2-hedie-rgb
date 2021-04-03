import java.util.Map;

public class SearchForMeaning {
    final static Map<String, Integer> mapFromFile = ReadTextFileToHashMap.getHashMapFromTextFile();
    public static boolean isValid(String word) {
        try {
            int z = mapFromFile.get(word);
            z++;
            return true;
        } catch (NullPointerException exception) {
            return false;
        }
    }
}
