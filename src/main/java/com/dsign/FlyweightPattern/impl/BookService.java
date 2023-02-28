package com.dsign.FlyweightPattern.impl;


import com.dsign.FlyweightPattern.interfaces.Book;

/**
 * 具体享元类
 */
public class BookService implements Book {

    private String bookName; // 书籍名称
    private int borrowCount = 0; // 借阅次数

    public BookService(String bookName) {
        this.bookName = bookName;
    }

    @Override
    public void borrow() {
        borrowCount++;
        System.out.println("您借阅的书籍是：" + bookName + "，本书累积已被借阅" + borrowCount + "次。");
    }
}
