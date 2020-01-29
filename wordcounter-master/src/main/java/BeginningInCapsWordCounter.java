public class BeginningInCapsWordCounter extends WordCounter {

    public BeginningInCapsWordCounter(String text) {
        super(text);
    }

    @Override
    public Integer count(){
        Integer result = 0;
        for (String word : getWords()) {
            if (isValid(word)) {
                result++;
            }
        }
        return result;
    }

    protected Boolean isValid(String word) {
        return Character.isUpperCase(word.charAt(0));
    }


}


