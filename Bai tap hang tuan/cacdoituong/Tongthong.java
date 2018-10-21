package cacdoituong;

/* Lop doi tuong tong thong
   Cac thuoc tinh: Dat nuoc, gioi tinh, tuoi, chau luc
 */
public class Tongthong {
    private String datnuoc, gioitinh, tuoi, chauluc;

    public String getDatnuoc() {
        return datnuoc;
    }

    public void setDatnuoc(String datnuoc) {
        this.datnuoc = datnuoc;
    }

    public String getGioitinh() {
        return gioitinh;
    }

    public void setGioitinh(String gioitinh) {
        this.gioitinh = gioitinh;
    }

    public String getTuoi() {
        return tuoi;
    }

    public void setTuoi(String tuoi) {
        this.tuoi = tuoi;
    }

    public String getChauluc() {
        return chauluc;
    }

    public void setChauluc(String chauluc) {
        this.chauluc = chauluc;
    }

    public Tongthong(String datnuoc, String gioitinh, String tuoi, String chauluc) {
        this.datnuoc = datnuoc;
        this.gioitinh = gioitinh;
        this.tuoi = tuoi;
        this.chauluc = chauluc;
    }

    //In thong tin
    public void getInfo() {
        System.out.println("Thong tin tong thong: " + datnuoc + " " + chauluc + " " + gioitinh + "  " + tuoi);
    }

    //Kiem tra cung chau luc
    public boolean sameContinent(Tongthong pre) {
        if (this.chauluc == pre.chauluc)
            return true;
        return false;
    }
}
