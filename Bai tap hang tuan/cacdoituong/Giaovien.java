package cacdoituong;

/*
Lop doi tuong giao vien
Thuoc tinh: Mon, gioi tinh, tuoi
 */
public class Giaovien {
    private String mon, gioitinh;
    private int tuoi;

    public String getMon() {
        return mon;
    }

    public void setMon(String mon) {
        this.mon = mon;
    }

    public String getGioitinh() {
        return gioitinh;
    }

    public void setGioitinh(String gioitinh) {
        this.gioitinh = gioitinh;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    public Giaovien(String mon, String gioitinh, int tuoi) {
        this.mon = mon;
        this.gioitinh = gioitinh;
        this.tuoi = tuoi;
    }

    //In thong tin
    public String getInfo() {
        return "Thong tin giao vien: " + gioitinh + " " + tuoi + " " + mon;
    }

    //Kiem tra gv toan
    public boolean giaoVienToan() {
        if (this.getMon() == "toan" || this.getMon() == "Toan")
            return true;
        return false;
    }

    //Kiem tra nghi huu
    public boolean nghiHuu() {
        if (this.getTuoi() > 60) return true;
        return false;
    }
}
