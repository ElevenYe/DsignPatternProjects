package com.dsign.FlyweightPattern;

import com.dsign.FlyweightPattern.factory.LibraryFactory;
import com.dsign.FlyweightPattern.impl.BookService;

/**
 * 享元模式
 * 对象缓存，避免大量相似对象（属性不同的同一类对象）创建出来占用内存空间
 * 类似单例模式，与单例模式的区别在于单例模式是创建一个对象，享元模式是创建多个对象的集合
 *
 * 成员：
 * 享元工厂：用于创建具体享元类，维护相同的享元对象。当请求对象已经存在时，直接返回对象，不存在时，在创建对象。
 * 抽象享元：定义需要共享的对象业务接口。
 * 具体享元类：实现抽象享元类的接口，完成某一具体逻辑。
 */
public class MainAction {

    public static void main(String[] args) {
        LibraryFactory factory = new LibraryFactory();
        BookService book1 = (BookService) factory.checkInOrGetBook("《Harry Potter》");
        book1.borrow();

        BookService book2 = (BookService) factory.checkInOrGetBook("《The Little Prince》");
        book2.borrow();

        BookService book3 = (BookService) factory.checkInOrGetBook("《Harry Potter》");
        book3.borrow();

        BookService book4 = (BookService) factory.checkInOrGetBook("《The Little Prince》");
        book4.borrow();

        BookService book5 = (BookService) factory.checkInOrGetBook("《Harry Potter》");
        book5.borrow();
    }
}
