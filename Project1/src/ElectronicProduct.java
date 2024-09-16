public class ElectronicProduct extends Product{
    protected String brand;
    protected int warrantyperiod;
    public ElectronicProduct(){}
    public ElectronicProduct(String name,int productid,float price,int warrantyperiod,String brand){
        super(productid, price, name);
        this.brand=brand;

        warrantyperiod=Math.abs(warrantyperiod);

        this.warrantyperiod=warrantyperiod;

    }

    @Override
    public void setProductid(int productid) {
        super.setProductid(productid);
    }

    @Override
    public void setPrice(float price) {
        super.setPrice(price);
    }

    @Override
    public void setName(String name) {
        super.setName(name);
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    @Override
    public float getPrice() {
        return super.getPrice();
    }

    @Override
    public String getName() {
        return super.getName();
    }

    public String getBrand() {
        return brand;
    }

    public int getWarrantyperiod() {
        return warrantyperiod;
    }

    public void setWarrantyperiod(int warrantyperiod) {
        this.warrantyperiod = warrantyperiod;
    }

    @Override
    public int getProductid() {
        return super.getProductid();
    }



}
