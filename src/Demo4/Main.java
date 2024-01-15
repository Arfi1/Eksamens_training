package Demo4;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        new Main().run();
    }

    private void run() {
        Keyword javaKeyword = new Keyword("Java", "A programming language");
        Keyword pythonKeyword = new Keyword("Python", "Another programming language");

        javaKeyword.setSeeAlso(List.of(pythonKeyword));

        String searchWord = "Java";
        if (javaKeyword.matches(searchWord)) {
            System.out.println("Match found for '" + searchWord + "': " + javaKeyword.getDefinition());
        } else {
            System.out.println("No match found for '" + searchWord);
        }

        List<Keyword> seeAlsoList = javaKeyword.getSeeAlso();
        if (seeAlsoList != null && !seeAlsoList.isEmpty()) {
            System.out.println("See also: " + seeAlsoList.get(0).getWord());
        }



    }
}
