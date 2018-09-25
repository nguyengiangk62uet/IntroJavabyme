package cacdoituong;

/*
Lop doi tuong phim
Thuoc tinh: The loai, ten, so tap
 */
public class Film {
    private String type, name;
    private int sotap;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getSotap() {
        return sotap;
    }

    public void setSotap(int sotap) {
        this.sotap = sotap;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Film(String type, String name, int sotap) {
        this.type = type;
        this.name = name;
        this.sotap = sotap;
    }

    //In thong tin
    public void getInfo() {
        System.out.println("Thong tin phim: " + name + " " + type + " " + sotap);
    }
}
