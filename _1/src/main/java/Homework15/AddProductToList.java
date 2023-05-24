package Homework15;

public class AddProductToList {

    public static void addProductToList(int productAmount, int productTotalPrice) throws PersException {
        if (productAmount < 1000) {
            Exceptions.ProductList.add(new  Product(productAmount, productTotalPrice));
        } else { throw new PersException("Too many product!"); }
    }
}
