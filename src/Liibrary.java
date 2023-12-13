import com.sun.source.tree.LambdaExpressionTree;

import java.util.Map;

public class Liibrary {
    private Map<String,Book> bookMap;

    public Liibrary(Map<String, Book> bookMap) {
        this.bookMap = bookMap;
    }

    public Map<String, Book> getBookMap() {
        return bookMap;
    }

    public void setBookMap(Map<String, Book> bookMap) {
        this.bookMap = bookMap;
    }

    @Override
    public String toString() {
        return "Liibrary{" +
                "bookMap=" + bookMap +
                '}';
    }
}
