package SOLID.Zulin.io;

/**
 * @author Leonid Zulin
 * @date 19.09.2022 20:08
 */
import SOLID.Zulin.Products.IProduct;

import java.util.TreeMap;

// Интерфейс печати
public interface IPrinter {

    void print();

    void print(String text);

    void print(TreeMap<Integer, IProduct> product);

    void print(TreeMap<Integer, IProduct> productCustomer, int count, int currentPrice, int totalPrice);

}

