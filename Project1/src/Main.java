import com.sun.source.tree.YieldTree;

import javax.swing.*;
import java.util.InputMismatchException;
import java.util.Scanner;


class Ecommercesystem{
    public static void main(String[] args) {

        ElectronicProduct electronicProduct = new ElectronicProduct("smartphone",1 , 599.9F,1,"samsung");
        ClothingProduct clothingProduct = new ClothingProduct("T-shirt", 2,"Medium", "Cotton",19.99F );
        BookProduct BookProduct= new BookProduct("OOP",3, 39.99F, "O'Reilly", "X Publications");

        Scanner scanner=new Scanner(System.in);
        int customerId = 0;

        while (true) {
            try {
                customerId = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter your customer ID:", "E_Commerce", JOptionPane.PLAIN_MESSAGE));

                // Do something with the customer ID, like validate it or store it
                break; // Exit the loop if parsing was successful
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Invalid input! ", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }


        String name ;
        while (true) {
            try {
                name =JOptionPane.showInputDialog(null,"Enter your name:","E_Commerce", JOptionPane.PLAIN_MESSAGE);
                // Do something with the customer ID, like validate it or store it
                break; // Exit the loop if parsing was successful
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Invalid input! ", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
        String address;
        while (true) {
            try {
                address = JOptionPane.showInputDialog(null,"Enter your address:","E_Commerce", JOptionPane.PLAIN_MESSAGE);

                // Do something with the customer ID, like validate it or store it
                break; // Exit the loop if parsing was successful
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Invalid input!.", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }

        customer customer = new customer(name,address,customerId);



        int nProducts = Integer.parseInt(JOptionPane.showInputDialog(null,"How many products do you want to order?","E_Commerce", JOptionPane.PLAIN_MESSAGE));


        Product[] Mainproduct= new Product[nProducts];
        cart Cart=new cart(customerId,nProducts);
        int number = 0;
        int i = 0;
        for (; i < nProducts; i++) {

            number= Integer.parseInt(JOptionPane.showInputDialog(null,"which is product you need? 1- smartphone 2- T-shirt 3- OOP","E_Commerce", JOptionPane.PLAIN_MESSAGE));

            while(!(number>=1&&number<=3)) {
                System.out.println("it's invaild try again");
                number = Integer.parseInt(JOptionPane.showInputDialog(null,"which is product you need? 1- smartphone 2- T-shirt 3- OOP","E_Commerce", JOptionPane.PLAIN_MESSAGE));
            }
            switch (number){

                case 1:
                   Mainproduct[i]= electronicProduct;
                Cart.addProduct(electronicProduct);
                break;
                case 2:
                    Mainproduct[i]=clothingProduct;
                    Cart.addProduct(clothingProduct);
                    break;
                case 3:
                    Mainproduct[i]=BookProduct;
                    Cart.addProduct(BookProduct);
                    break;

            }
        }

        order info=new order(customerId,1,Mainproduct);
        int ans= Integer.parseInt(JOptionPane.showInputDialog(null,"total price is  $"+Cart.calculatePrice()+"  Do you want to place an order for the products in the cart? (1-yes/2-no)","E_Commerce", JOptionPane.PLAIN_MESSAGE));
        int choose=1 ;
if(ans==1)
        Cart.placeOrder();

else if(ans==2){
         choose= Integer.parseInt(JOptionPane.showInputDialog(null,"would you like remove something? 1- smartphone 2- T-shirt 3- OOP,\nWould you like add?4-add,\n0-cancel","E_Commerce", JOptionPane.PLAIN_MESSAGE));
    if(choose==0){
        JOptionPane.showMessageDialog(null,"your order has canceled","Cart",JOptionPane.PLAIN_MESSAGE);
        return;
    }
Product claim;
while (true){
                switch (choose){
                    case 1:
                        claim=electronicProduct;
                        Cart.removeProduct(claim);
                        info.setProducts(Cart.getProducts());
                        break;
                    case 2:
                        claim=clothingProduct;
                        Cart.removeProduct(claim);
                        info.setProducts(Cart.getProducts());
                        break;
                    case 3:
                        claim=BookProduct;
                        Cart.removeProduct(claim);
                        info.setProducts(Cart.getProducts());
                        break;
                    case 4:
                        int sumProduct = Integer.parseInt(JOptionPane.showInputDialog(null,"How many products do you want to order?"));
                        Cart.setnProducts(nProducts+sumProduct);
                        Mainproduct= new Product[nProducts+sumProduct];
                        while(i<(nProducts+sumProduct)){
                            number= Integer.parseInt(JOptionPane.showInputDialog(null,"which is product you need? 1- smartphone 2- T-shirt 3- OOP","E_Commerce", JOptionPane.PLAIN_MESSAGE));
                            while(!(number>=1&&number<=3)) {
                                JOptionPane.showMessageDialog(null,"it's invaild try again","E_Commerce", JOptionPane.PLAIN_MESSAGE);
                                number = Integer.parseInt(JOptionPane.showInputDialog(null,"which is product you need? 1- smartphone 2- T-shirt 3- OOP","E_Commerce", JOptionPane.PLAIN_MESSAGE));
                            }
                            switch (number){
                                case 1:
                                    Mainproduct[i]= electronicProduct;
                                    Cart.addProduct(electronicProduct);
                                    break;
                                case 2:
                                    Mainproduct[i]=clothingProduct;
                                    Cart.addProduct(clothingProduct);
                                    break;
                                case 3:
                                    Mainproduct[i]=BookProduct;
                                    Cart.addProduct(BookProduct);
                                    break;
                            }
                            ++i;
                        }

                        info.setProducts(Cart.getProducts());
                        break;
                    case 0:
                        info.printOrderInfo();
                        return;
                }
            info.printOrderInfo();
    choose= Integer.parseInt(JOptionPane.showInputDialog(null,"would you like remove more? 1- smartphone 2- T-shirt 3- OOP,0-no","E_Commerce", JOptionPane.PLAIN_MESSAGE));
}
}


}
    }


