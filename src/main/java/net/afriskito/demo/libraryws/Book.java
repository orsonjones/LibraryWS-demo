package net.afriskito.demo.libraryws;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.auto.value.AutoValue;

@AutoValue
public abstract class Book {
    public abstract String getTitle();
    public abstract String getAuthor();
    public abstract Integer getYear();
    
    @JsonCreator
    static Book create(
            @JsonProperty("title") String title,
            @JsonProperty("author") String author,
            @JsonProperty("year") Integer year)
    {
        return new AutoValue_Book(title, author, year);
    }
}
