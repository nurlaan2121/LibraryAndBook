import java.util.Map;

public class BookImpl implements Interfacebok {
    private Map<String, Book> map;

    public BookImpl(Map<String, Book> map) {
        this.map = map;
    }

    @Override
    public void addbook(Book book) {
        map.put(book.getIsbn(), book);
        System.out.println("Success added!");
    }

    @Override
    public String remove(String isbn) {
        if (map.containsKey(isbn)) {
            map.remove(isbn);
            return "Success";
        } else try {
            throw new NOTFOUNDEXCEPTION("Not found");
        }catch (NOTFOUNDEXCEPTION notfoundexception){
            return notfoundexception.getMessage();
        }
    }

    @Override
    public Book search(String kewWord) {
        if (map.containsKey(kewWord)) {
            return map.get(kewWord);
        } else try {
            throw new NOTFOUNDEXCEPTION("Not found");
        }catch (NOTFOUNDEXCEPTION notfoundexception){
            System.out.println(notfoundexception.getMessage());
        }
        return null;
    }

    @Override
    public void DisplayBooks() {
        System.out.println(map);
    }
}
