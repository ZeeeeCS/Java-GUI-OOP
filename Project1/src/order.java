import javax.swing.*;

public class order {
        private int customerId;
        private int orderId;
        private Product[] products;
        private float totalPrice;
public order(){}
        public order(int customerId, int orderId, Product[] products) {
            this.customerId = Math.abs(customerId);
            this.orderId = Math.abs(orderId);
            this.products = products;
            for (int i = 0; i < products.length; i++) {
                this.totalPrice += Math.abs(this.products[i].getPrice());
            }
        }

        public void setProducts(Product[] products) {
            this.products = products;
            totalPrice = 0;
            for (int i = 0; i < products.length; i++) {
                totalPrice += Math.abs(this.products[i].getPrice());
            }

        }

        public void printOrderInfo() {

            JOptionPane.showMessageDialog( null,"Here's Your Order's Summary\n"+"\nOrder ID: " + orderId+"\nCustomer ID: " + customerId+"\nProducts:","E_Commerce", JOptionPane.PLAIN_MESSAGE);

            for (int i = 0; i < products.length; i++) {
                JOptionPane.showMessageDialog(null,products[i].getName() + " - $" + products[i].getPrice(),"E_Commerce", JOptionPane.PLAIN_MESSAGE);
            }
            JOptionPane.showMessageDialog(null,"Total Price: $" + totalPrice,"E_Commerce", JOptionPane.PLAIN_MESSAGE);
        }

    }



