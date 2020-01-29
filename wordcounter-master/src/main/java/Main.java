import java.util.ArrayList;
import java.util.List;

public class Main{

    public static void main(String[] args){
        String text = "Lorem Ipsum es simplemente el texto de relleno de las imprentas y archivos de texto. Lorem Ipsum ha sido el texto de relleno estándar de las industrias desde el año 1500";

        WordCounter uniqueWordCounter = new UniqueWordCounter(text);
        WordCounter beginningInCapsWordCounter = new BeginningInCapsWordCounter(text);
        WordCounter startingWithVocalsWordCounter = new StartingWithVocalsWordCounter(text);
        WordCounter moreThanOneCharWordCounter = new MoreThanOneCharWordCounter(text);

        List<WordCounter> moreThanOneCharWithVocalFilters = new ArrayList<WordCounter>(2);
        moreThanOneCharWithVocalFilters.add(moreThanOneCharWordCounter);
        moreThanOneCharWithVocalFilters.add(startingWithVocalsWordCounter);

        WordCounter moreThanOneCharWithVocalsCounter = new MultipleFiltersWordCounter(text, moreThanOneCharWithVocalFilters);


        List<WordCounter> moreThanOneCharInCapsFilters = new ArrayList<WordCounter>(2);
        moreThanOneCharInCapsFilters.add(moreThanOneCharWordCounter);
        moreThanOneCharInCapsFilters.add(beginningInCapsWordCounter);

        WordCounter moreThanOneCharInCapsWordCounter = new MultipleFiltersWordCounter(text, moreThanOneCharInCapsFilters);


        List<WordCounter> beginningInCapsWithVocalsFilters = new ArrayList<WordCounter>(2);
        beginningInCapsWithVocalsFilters.add(startingWithVocalsWordCounter);
        beginningInCapsWithVocalsFilters.add(beginningInCapsWordCounter);

        WordCounter beginningInCapsWithVocalsWordCounter = new MultipleFiltersWordCounter(text, beginningInCapsWithVocalsFilters);

        System.out.println("The number of unique words is: "+ uniqueWordCounter.count());
        System.out.println("The number of words beginning with caps is: " + beginningInCapsWordCounter.count());
        System.out.println("The number of words beginning with vowels is: " + startingWithVocalsWordCounter.count());
        System.out.println("The number of words with more than one characters is: " + moreThanOneCharWordCounter.count());

        System.out.println("The number of words with more than one characters and beginning with vowels is: " + moreThanOneCharWithVocalsCounter.count());
        System.out.println("The number of words beginning with vowels and beginning with caps is: " + beginningInCapsWithVocalsWordCounter.count());
        System.out.println("The number of words with more than one characters and beginning with caps is: " + moreThanOneCharInCapsWordCounter.count());
    }
}
