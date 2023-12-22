package tsi.ensg.jee.tp2.exo2;

public class Book {

    private String title;
    private long ref;

    public Book(String title, long ref) {
        this.title = title;
        this.ref = ref;
    }

    public String getTitle() {
        return this.title;
    }

    public long getRef() {
        return this.ref;
    }

}
