public class StartingWithVocalsWordCounter extends WordCounter{


    public StartingWithVocalsWordCounter(String text) {
        super(text);
    }

    @Override
    public Integer count(){
        Integer result = 0;
        for (String word: getWords()) {
            if(isValid(word)){
                result++;
            }
        }
        return result;
    }

    protected Boolean isValid(String word) {
        String lowerCaseWord= word.toLowerCase();
        return "aeiou".indexOf(lowerCaseWord.charAt(0)) >= 0;
    }


}
