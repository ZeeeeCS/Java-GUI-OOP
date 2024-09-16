public class customer {
    public String name;
    public String address;
    public int customerid;
    public customer(){}
    public customer(String name,String address,int customerid){
        this.address=address;
        this.name=name;
        if(customerid<0){
            customerid=Math.abs(customerid);
        }
        this.customerid=customerid;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setCustomerid(int customerid) {
        this.customerid = customerid;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getCustomerid() {
        return customerid;
    }

    public String getAddress() {
        return address;
    }
}



