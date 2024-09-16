public class Product {
    protected int productid;
    protected String name;
    protected float price;
    public Product(){}
    public Product(int productid,float price,String name){
        this.name=name;

        price= Math.abs(price);
        productid= Math.abs(productid);

        this.price=price;
        this.productid=productid;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public void setProductid(int productid) {
        this.productid = productid;
    }

    public String getName() {
        return name;
    }

    public float getPrice() {
        return price;
    }

    public int getProductid() {
        return productid;
    }

}
