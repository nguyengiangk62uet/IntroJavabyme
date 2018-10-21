package phansotuan3;

import java.util.Scanner;
import java.lang.Math;

class PS {
    private int ts, ms;

    public PS(int a, int b) {
        super();
        this.ts = a;
        this.ms = b;
    }

    public int getTs() {
        return ts;
    }

    public void setTs(int ts) {
        this.ts = ts;
    }

    public int getMs() {
        return ms;
    }

    public void setMs(int ms) {
        this.ms = ms;
    }

    //Tim UCLN cua tu va mau
    public int UCLN(int a, int b) {
        return (b == 0) ? a : UCLN(b, a % b);
    }

    //Toi gian phan so
    public void toigianphanso() {
        int uc = UCLN(this.getTs(), this.getMs());
        this.setTs(this.ts / uc);
        this.setMs(this.ms / uc);
        if (this.getTs() < 0 || this.getMs() < 0) {
            this.ts = -Math.abs(this.ts);
            this.ms = Math.abs(this.ms);
        } else if (this.getTs() < 0 && this.getMs() < 0) {
            this.ts = Math.abs(this.ts);
            this.ms = Math.abs(this.ms);
        } else if (this.getTs() == 0) {
            this.ts = 0;
            this.ms = 0;
        }
    }

    //Cong 2 phan so
    public void congphanso(PS ps) {
        int tu = this.getTs() * ps.getMs() + this.getMs() * ps.getTs();
        int mau = this.getMs() * ps.getMs();
        PS pstong = new PS(tu, mau);
        pstong.toigianphanso();
        System.out.println("Tổng 2 phân số là: " + pstong.ts + "/" + pstong.ms);
    }

    //Tru 2 phan so
    public void truphanso(PS ps) {
        int tu = this.getTs() * ps.getMs() - this.getMs() * ps.getTs();
        int mau = this.getMs() * ps.getMs();
        PS pshieu = new PS(tu, mau);
        pshieu.toigianphanso();
        System.out.println("Hiệu 2 phân số là: " + pshieu.ts + "/" + pshieu.ms);
    }

    //Nhan 2 phan so
    public void nhanphanso(PS ps) {
        int tu = this.getTs() * ps.getTs();
        int mau = this.getMs() * ps.getMs();
        PS pstich = new PS(tu, mau);
        pstich.toigianphanso();
        System.out.println("Tích 2 phân số là: " + pstich.ts + "/" + pstich.ms);
    }

    //Chia 2 phan so
    public void chiaphanso(PS ps) {
        int tu = this.getTs() * ps.getMs();
        int mau = this.getMs() * ps.getTs();
        PS psthuong = new PS(tu, mau);
        psthuong.toigianphanso();
        System.out.println("Thương 2 phân số là: " + psthuong.ts + "/" + psthuong.ms);
    }

    //So sanh 2 phan so
    public boolean equals(PS ps) {
        return ((this.ts * ps.ms - this.ms * ps.ts) == 0);
    }
}

public class phanso {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] tu = new int[2];
        int[] mau = new int[2];
        for (int i = 0; i < 2; i++) {
            System.out.println("Nhập tử số và mẫu số phân số " + (i + 1) + ": ");
            tu[i] = scan.nextInt();
            mau[i] = scan.nextInt();
        }
        PS pso1 = new PS(tu[0], mau[0]);
        PS pso2 = new PS(tu[1], mau[1]);
        pso1.congphanso(pso2);
        pso1.truphanso(pso2);
        pso1.nhanphanso(pso2);
        pso1.chiaphanso(pso2);
        if (pso1.equals(pso2) == true)
            System.out.println("Phân số 1 bằng phân số 2");
        else System.out.println("Phân số 1 khác phân số 2");
    }
}
