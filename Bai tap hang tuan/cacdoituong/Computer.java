package cacdoituong;

/*
    Lop computer
    Cac thuoc tinh: Loai may, dung luong ram, loai o cung
 */
public class Computer {
    private String type, ram, disk;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getRam() {
        return ram;
    }

    public void setRam(String ram) {
        this.ram = ram;
    }

    public String getDisk() {
        return disk;
    }

    public void setDisk(String disk) {
        this.disk = disk;
    }

    public Computer(String type, String ram, String disk) {
        this.type = type;
        this.ram = ram;
        this.disk = disk;
    }

    //In thong tin
    public void getInfo() {
        System.out.println("Thong so may tinh: " + " " + type + " " + ram + " " + disk);
    }

    //Kiem tra co o cung SSD
    public void diskSSD() {
        if (this.disk.equals("ssd"))
            System.out.println("Co o cung SSD");
        else System.out.println("Khong co o cung SSD");
    }
}
