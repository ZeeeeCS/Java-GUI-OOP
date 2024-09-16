public class BookProduct extends Product{
    public String author;
    public String publisher;
    public BookProduct(){}
    public BookProduct(String name,int productid,float price,String author,String publisher){
        super(productid, price, name);
        this.author=author;
        this.publisher=publisher;
    }

    @Override
    public void setProductid(int productid) {
        super.setProductid(productid);
    }

    @Override
    public void setName(String name) {
        super.setName(name);
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public void setPrice(float price) {
        this.price=price;
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
        return price;
    }

    public String getAuthor() {
        return author;
    }

    public String getPublisher() {
        return publisher;
    }
}
