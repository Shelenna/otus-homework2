package Homework15;

public class Product {

    private int productPrice;
    private static int productAmount;
    private static int productTotalPrice;

    Product(int productAmount, int productTotalPrice) {
        this.productAmount = productAmount;
        this.productTotalPrice = productTotalPrice;
        try {
            this.productPrice = productTotalPrice / productAmount;
        } catch (NullPointerException e) {
            System.out.println("NullPointerException");
        }
        catch (IllegalArgumentException e) {
            System.out.println("IllegalArgument");
        }
        catch (Exception e) {
            System.out.println("Непонятная ошибка Exception. Как отловить конкретный тип?");
        }
    }
    private Product(int productPrice, int productAmount, int productTotalPrice) {
        this.productAmount = productAmount;
        this.productPrice = productPrice;
        this.productTotalPrice = productTotalPrice;
    }
}