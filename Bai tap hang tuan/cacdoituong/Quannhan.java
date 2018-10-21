package cacdoituong;

/*
Lop doi tuong quan nhan
Thuoc tinh: Binh chung, cap bac, khu vuc
 */
public class Quannhan {
    private String binhchung, capbac, khuvuc;

    public String getBinhchung() {
        return binhchung;
    }

    public void setBinhchung(String binhchung) {
        this.binhchung = binhchung;
    }

    public String getCapbac() {
        return capbac;
    }

    public void setCapbac(String capbac) {
        this.capbac = capbac;
    }

    public String getKhuvuc() {
        return khuvuc;
    }

    public void setKhuvuc(String khuvuc) {
        this.khuvuc = khuvuc;
    }

    public Quannhan(String binhchung, String capbac, String khuvuc) {
        this.binhchung = binhchung;
        this.capbac = capbac;
        this.khuvuc = khuvuc;
    }

    //In thong tin
    public void getInfo() {
        System.out.println("'Thong tin quan nhan: " + binhchung + " " + capbac + " " + khuvuc);
    }

    //Kiem tra khu vuc
    public void kvHanoi() {
        if (this.khuvuc == "Ha Noi" || this.khuvuc == "ha noi")
            System.out.println("Thuoc khu vuc Ha Noi.");
        else
            System.out.println("Khong thuoc khu vuc Ha noi.");
    }
}
