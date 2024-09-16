import java.util.Scanner;
import javax.swing.*;

public class cart {

    private int customerId;
    private int nProducts;
    private Product[] products;
    private int index;


    public cart(int customerId, int nProducts) {
        this.customerId = Math.abs(customerId);
        this.nProducts = Math.abs(nProducts);
        this.products = new Product[this.nProducts];
        index = 0;
    }

    public void addProduct(Product product) {
        boolean flag = true;
        for (int i = 0; i < products.length; i++) {
            if (products[i] == null) {
                flag = false;
                break;
            }
        }
        if (flag == false) {
            products[index++] = product;
        } else {
            Product[] newProducts = new Product[products.length + 1];
            for (int j = 0, k = 0; j < products.length + 1; j++) {
                if (k == products.length) {
                    newProducts[k] = product;
                    break;
                }
                newProducts[k] = products[j];
                k++;
            }
            products = newProducts;
        }
    }

    public void removeProduct(Product product) {
        int i;
        for (i = 0; i < products.length; i++) {
            if (products[i] == product) {
                break;
            }
        }
Product[] newProducts = new Product[products.length - 1];

        for (int j = 0, k = 0; j < products.length; j++) {
            if (j != i) {
                newProducts[k] = products[j];
                k++;
            }
        }
        products = newProducts;
    }

    public float calculatePrice() {
        float total = 0;
        for (int i = 0; i < products.length; i++) {
            total += products[i].getPrice();
        }
        return total;
    }

    public void placeOrder() {

        Scanner scanner = new Scanner(System.in);
        order info=new order(customerId,nProducts,products);

            JOptionPane.showMessageDialog(null,"Order confirmed","E_Commerce", JOptionPane.PLAIN_MESSAGE);
            info.printOrderInfo();
        }



    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = Math.abs(customerId);
    }



    public void setnProducts(int nProducts) {
        this.nProducts = Math.abs(nProducts);
    }
    public void setProducts(Product[] products) {
        this.products = products;
    }
    public Product[] getProducts() {
        return products;
    }

    public int getnProducts() {
        return nProducts;
    }
}
