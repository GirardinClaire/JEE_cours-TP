package tsi.ensg.jee.tp2.exo2;

import java.util.Set;

public class Library {

    private Set<Book> books;

    public Library(Set<Book> books) {
        this.books = books;
    }

    @Override
    public String toString() {
        StringBuilder description = new StringBuilder();
        int k = 1;
        for (Book book : books) {
            description.append("Book ").append(k).append(" : ")
                    .append(book.getTitle()).append(" de ref ")
                    .append(book.getRef()).append("\n");
            k++;
        }
        return description.toString();
    }
}
