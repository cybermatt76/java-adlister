package dao;

import java.util.List;
import models.Author;

public interface Authors {
    List<Author> all();
    void insert(Author author);
}