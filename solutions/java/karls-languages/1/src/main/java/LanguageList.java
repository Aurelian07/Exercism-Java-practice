import java.util.ArrayList;
import java.util.List;

public class LanguageList {
    private final List<String> languages = new ArrayList<>();

    public boolean isEmpty() {
        int languagesSize = languages.size();
        if (languagesSize == 0){
            return true ;
        }
        return false ;
    }

    public void addLanguage(String language) {
        languages.add(language);
    }

    public void removeLanguage(String language) {
        languages.remove(language);
    }

    public String firstLanguage() {
       String firstLanguage =  languages.get(0);
        return firstLanguage ;
    }

    public int count() {
        int countLanguages = languages.size();
        return countLanguages;
    }

    public boolean containsLanguage(String language) {
       boolean haveLanguage = languages.contains(language);
        return haveLanguage ;
    }

    public boolean isExciting() {
        boolean isExciting = languages.contains("Java")||languages.contains("Kotlin");
        return isExciting;
    }
}
