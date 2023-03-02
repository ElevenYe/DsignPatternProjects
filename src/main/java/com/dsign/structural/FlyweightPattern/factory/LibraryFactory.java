package com.dsign.structural.FlyweightPattern.factory;

import com.dsign.structural.FlyweightPattern.interfaces.Book;
import com.dsign.structural.FlyweightPattern.impl.BookService;

import java.util.HashMap;
import java.util.Map;

/**
 * 享元工厂 - 图书馆
 * 你可以在图书馆中借阅所有的书籍，如果书籍不存在，图书馆将自动购置书籍后放入书架以供借阅（自动创建类后缓存起来）
 */
public class LibraryFactory {

    /**
     * 书架Map，存储书籍（实体类集合）
     */
    Map<String, Book> bookshelfMap = new HashMap<String, Book>();

    String[] bookNames = new String[]{"《Harry Potter》", "《The Little Prince》"};

    /**
     * 书架（bookshelfMap）中存在此书籍将直接从书架中取书，书架中不存在则购置（实例化）书籍后放入书架，再从书架上取书
     */
    public Book checkInOrGetBook(String bookName) {
        if (!bookshelfMap.containsKey(bookName)) {
            for (String name : bookNames) {
                if (name.equals(bookName)) {
                    bookshelfMap.put(bookName, new BookService(bookName));
                }
            }
        }
        return bookshelfMap.get(bookName);
    }
}
