import com.fasterxml.jackson.annotation.JsonIgnore;

public class Quote {
    private int id;
    private String content;
    @JsonIgnore
    private Author author;

    public Quote() {}

    public Quote(int id, String content, Author author) {
        this.id = id;
        this.content = content;
        this.author = author;
    }

    // getters and setters

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }
}
