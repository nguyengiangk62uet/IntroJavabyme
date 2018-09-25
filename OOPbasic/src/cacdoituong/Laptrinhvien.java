package cacdoituong;

/*
Lop doi tuong Lap trinh vien
Thuoc tinh: Ngon ngu LT, gioi tinh, cap bac
 */
public class Laptrinhvien {
    private String ngonngu, gioitinh, capbac;

    public String getNgonngu() {
        return ngonngu;
    }

    public void setNgonngu(String ngonngu) {
        this.ngonngu = ngonngu;
    }

    public String getGioitinh() {
        return gioitinh;
    }

    public void setGioitinh(String gioitinh) {
        this.gioitinh = gioitinh;
    }

    public String getCapbac() {
        return capbac;
    }

    public void setCapbac(String capbac) {
        this.capbac = capbac;
    }

    public Laptrinhvien(String ngonngu, String gioitinh, String capbac) {
        this.ngonngu = ngonngu;
        this.gioitinh = gioitinh;
        this.capbac = capbac;
    }

    //In thong tin
    public String getInfo() {
        return "Thong tin DEV: " + ngonngu + " " + gioitinh + " " + capbac;
    }

    //Cung ngon ngu lt
    public boolean sameLanguage(Laptrinhvien dev1) {
        if (this.ngonngu == dev1.ngonngu)
            return true;
        return false;
    }

}
