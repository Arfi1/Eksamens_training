package Demo4;

import java.util.List;

public class Keyword {
    private String word;
    private String definition;
    private List<Keyword> seeAlso;

    public Keyword(String word, String definition) {
        this.word = word;
        this.definition = definition;
    }

    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }

    public String getDefinition() {
        return definition;
    }

    public void setDefinition(String definition) {
        this.definition = definition;
    }

    public List<Keyword> getSeeAlso() {
        return seeAlso;
    }

    public void setSeeAlso(List<Keyword> seeAlso) {
        this.seeAlso = seeAlso;
    }

    public boolean matches(String searchWord) {
        return this.word.equalsIgnoreCase(searchWord);
    }


}
