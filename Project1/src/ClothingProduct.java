public class ClothingProduct extends Product{ public String size;
    public String fabric;
    public ClothingProduct(){}
    public ClothingProduct(String name,int productid,String size,String fabric,float price){
        super(productid, price, name);
        this.size=size;
        this.fabric=fabric;
    }

    @Override
    public void setProductid(int productid) {
        super.setProductid(productid);
    }

    @Override
    public void setName(String name) {
        super.setName(name);
    }

    @Override
    public void setPrice(float price) {
        super.setPrice(price);
    }

    public void setFabric(String fabric) {
        this.fabric = fabric;
    }

    public void setSize(String size) {
        this.size = size;
    }

    @Override
    public int getProductid() {
        return super.getProductid();
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public float getPrice() {
        return super.getPrice();
    }

    public String getFabric() {
        return fabric;
    }

    public String getSize() {
        return size;
    }


}
