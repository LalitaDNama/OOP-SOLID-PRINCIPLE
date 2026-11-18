package Association.Unidirectional;

public class Book extends Author{
    private String title;
    public Book(String name,String title) {
        super(name);
        this.title=title;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
