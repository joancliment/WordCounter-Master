import java.util.ArrayList;
import java.util.List;

public class MultipleFiltersWordCounter extends WordCounter{

    public MultipleFiltersWordCounter(String text, List<WordCounter> filters) {
        super(text);
        this.filters = filters;
    }

    List<WordCounter> filters = new ArrayList<WordCounter>();

    public void add(WordCounter wordCounter){
        filters.add(wordCounter);
    }

    @Override
    public Integer count(){
        Integer result = 0;
        for (String word : getWords()) {
            if (isValid(word)){
                result++;
            }
        }
        return result;
    }

    protected Boolean isValid(String word) {
        for (WordCounter counter:
             this.filters) {
           if (!counter.isValid(word)){
               return  false;
           }
        }
        return true;
    }
}
