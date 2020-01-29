public class MoreThanOneCharWordCounter extends WordCounter {


    public MoreThanOneCharWordCounter(String text) {
        super(text);
    }

    @Override
    public Integer count() {

        Integer result = 0;
        for (String word : getWords()) {
            if(isValid(word)){
                result++;
            }
        }
        return result;
    }

    protected Boolean isValid(String word) {
        return word.trim().length()>2;
    }
}