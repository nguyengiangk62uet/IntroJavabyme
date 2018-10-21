package cacdoituong;

/*
Lop doi tuong xe may
Cac thuoc tinh: loai xe, mau, tay con
 */
public class Motorbike {
    private String type, color;
    private Boolean taycon;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Boolean getTaycon() {
        return taycon;
    }

    public void setTaycon(Boolean taycon) {
        this.taycon = taycon;
    }

    public Motorbike(String type, String color, Boolean taycon) {
        this.type = type;
        this.color = color;
        this.taycon = taycon;
    }

    //In thong tin
    public void getInfo() {
        System.out.println("Thong so xe may: " + type + " " + color);
        if (this.taycon == true)
            System.out.println("Xe tay con.");
        else System.out.println("Khong phai xe tay con.");
    }
}
