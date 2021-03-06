package net.xerosoft.service;

import io.quarkus.panache.common.Page;
import net.xerosoft.common.Paginated;
import net.xerosoft.model.Quote;

import javax.enterprise.context.ApplicationScoped;
import java.util.List;

@ApplicationScoped
public class QuoteService {

    public Paginated<Quote> getAll(Page page) {
        return Quote.find(page);
    }

    public Paginated<Quote> findByAuthor(long id, Page page) {
        return Quote.findByAuthor(id, page);
    }

    public Paginated<Quote> findByAuthors(List<String> authors, Page page) {
        return Quote.findByAuthors(authors, page);
    }
}
