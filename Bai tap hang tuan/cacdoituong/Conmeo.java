package cacdoituong;

/*
Lop doi tuong con meo
Thuoc tinh: Mau, loai, mau mat
 */
public class Conmeo {
    private String color, type, eye_color;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getEye_color() {
        return eye_color;
    }

    public void setEye_color(String eye_color) {
        this.eye_color = eye_color;
    }

    public Conmeo(String color, String type, String eye_color) {
        this.color = color;
        this.type = type;
        this.eye_color = eye_color;
    }

    //In thong tin
    public String getInfo() {
        return "Màu sắc, loại và màu mắt của mèo: " + color + " " + type + " " + eye_color;
    }

    //Tieng keu
    public void catSound() {
        System.out.println("Cat say meo meo.");
    }
}
