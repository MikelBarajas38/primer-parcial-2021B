package edu.uaslp.examen;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class BookCollectionManager {

    private List<BookCollection> collections;

    BookCollectionManager() {
        collections = new ArrayList<BookCollection>();
    }

    public BookCollection createCollection(String name) {
        BookCollection new_collection = new BookCollection(name);
        collections.add(new_collection);
        return new_collection;
    }

    public BookCollection getCollectionByName(String name) {

        ListIterator<BookCollection> iterator = collections.listIterator();

        while(iterator.hasNext()) {
            BookCollection data = iterator.next();
            if(data.getName() == name) {
                return data;
            }
        }

        return null;
    }

    public void deleteCollectionByName(String name) {
        BookCollection currentCollection = getCollectionByName(name);
        if(currentCollection != null){
            collections.remove(currentCollection);
        }
    }

    public void addBookToCollection(String CollectionName, Book book){
        BookCollection currentCollection = getCollectionByName(CollectionName);
        if(currentCollection != null){
            currentCollection.addBook(book);
        } else {
            BookCollection newCollection = createCollection(CollectionName);
            newCollection.addBook(book);
        }
    }

    public List<String> getCollectionNames() {

        List<String> names = new ArrayList<String>();

        ListIterator<BookCollection> iterator = collections.listIterator();

        while(iterator.hasNext()) {
            BookCollection data = iterator.next();
            names.add(data.getName());
        }

        return names;
    }

}
