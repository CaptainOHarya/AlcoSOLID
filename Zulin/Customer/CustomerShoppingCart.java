package SOLID.Zulin.Customer;

/**
 * @author Leonid Zulin
 * @date 19.09.2022 20:06
 */
import SOLID.Zulin.Products.IProduct;
import SOLID.Zulin.Products.ProductCustomer;
import SOLID.Zulin.io.IPrinter;
import SOLID.Zulin.io.PrinterProduct;

import java.util.TreeMap;

// Класс нашей потребительской корзины
public class CustomerShoppingCart {
    private TreeMap<Integer, IProduct> shoppingCart = new TreeMap<>();
    // Общая сумма товаров
    private int totalPrice;

    // Добавляем продукт и количество для вычисления
    public TreeMap<Integer, IProduct> addProductToCart(Integer cod, IProduct product, int count) {

        IPrinter printer = new PrinterProduct();
        IProduct productCustomer = new ProductCustomer(product.getName(), product.getPrice(), count);
        productCustomer.setName(product.getName());

        productCustomer.setPrice(product.getPrice());
        // Положим продукт в нашу Мапу
        shoppingCart.put(cod, productCustomer);

        // и расчитаем общую сумму
        totalPrice = calculateTotalPrice(totalPrice, productCustomer.getPrice() * count);

        printer.print(shoppingCart, count, productCustomer.getPrice(), totalPrice);

        return shoppingCart;
    }

    // Метод расчёта общей суммы товаров
    public int calculateTotalPrice(int totalPrice, int currentPrice) {
        return totalPrice + currentPrice;
    }


}


