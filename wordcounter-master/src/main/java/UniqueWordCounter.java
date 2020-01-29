import java.util.ArrayList;
import java.util.List;

public class UniqueWordCounter extends WordCounter{
    private ArrayList<String> differentWords;

    public UniqueWordCounter(String text) {
        super(text);
    }

    @Override
    public Integer count(){
        differentWords = new ArrayList<String>();
        int result=0;
        for (String word: getWords()) {
            String lowerCaseWord= word.toLowerCase();
            if (isValid(lowerCaseWord)){
                result++;
            }
        }
        return result;
    }

    protected Boolean isValid(String word) {
        if (!differentWords.contains(word)){
            differentWords.add(word);
            return true;
        }else
            return false;
    }
}

