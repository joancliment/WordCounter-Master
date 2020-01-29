import com.sun.org.apache.xpath.internal.operations.Bool;

public abstract class WordCounter {

    private String[] words;
    public WordCounter(String text){
        words = this.prepareInputForWordCounting(text);
    }

    public abstract Integer count();

    protected abstract Boolean isValid(String word);

    protected String[] getWords(){
       return words;
    }

    public String[] prepareInputForWordCounting(String text){
        return this.splitTextIntoWords(this.removeSymbolsFromText(text));
    }

    private String[] splitTextIntoWords(String text){
        return text.split(" ");
    }

    private String removeSymbolsFromText(String input){
        String regexToSearch = "/[-!$%^&*()_+|~=`{}\\[\\]:\";'<>?,.\\/]/";
        return input.replace(regexToSearch , " ");
    }
}
