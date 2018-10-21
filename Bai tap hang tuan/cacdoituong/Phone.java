package cacdoituong;

/*
Lop doi tuong dien thoai
Thuoc tinh: Loai, he dieu hanh, gia ban
 */
public class Phone {
    private String type, hdh;
    private int price;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getHdh() {
        return hdh;
    }

    public void setHdh(String hdh) {
        this.hdh = hdh;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public Phone(String type, String hdh, int price) {
        this.type = type;
        this.hdh = hdh;
        this.price = price;
    }

    //In thong tin
    public void getInfo() {
        System.out.println("Thong so dien thoai: " + type + " " + hdh + " " + price);
    }

    //Kiem tra hdh IOS
    public boolean isIOS() {
        if (this.hdh.equals("IOS"))
            return true;
        else return false;
    }
}
