package net.afriskito.demo.libraryws;

import com.google.auto.value.AutoValue;

@AutoValue
public abstract class Book {
    public abstract String getTitle();
    public abstract String getAuthor();
    public abstract Integer getYear();
    
    static Book create(
            String title,
            String author,
            Integer year)
    {
        return new AutoValue_Book(title, author, year);
    }
}
