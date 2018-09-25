package cacdoituong;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.InputMismatchException;

public class management {
    public static Scanner sc = new Scanner(System.in);

    public static void inputCar() {
        System.out.println("Nhap so luong o to: ");
        int n = sc.nextInt();
        List<Oto> dsCar = new ArrayList<>();
        String mau, loai;
        for (int i = 0; i < n; i++) {
            System.out.println("Nhap loai xe, mau sac, gia ban: ");
            loai = sc.next();
            mau = sc.next();
            int gia = sc.nextInt();
            sc.nextLine();
            Oto car = new Oto(mau, loai, gia);
            dsCar.add(car);
        }
        for (int i = 0; i < dsCar.size(); i++) {
            dsCar.get(i).printVipcar();
        }
    }

    public static void inputCat() {
        Conmeo meo = new Conmeo("Đen", "mèo mướp", "vàng");
        System.out.println(meo.getInfo());
        meo.catSound();
    }

    public static void inputTeacher() {
        Giaovien teach = new Giaovien("toan", "nu", 22);
        System.out.println(teach.getInfo());
        System.out.println("La giao vien toan: " + teach.giaoVienToan());
        System.out.println("Da nghi huu: " + teach.nghiHuu());
    }

    public static void inputDev() {
        Laptrinhvien ltv1 = new Laptrinhvien("java", "nam", "senior");
        Laptrinhvien ltv2 = new Laptrinhvien("c++", "nu", "junior");
        System.out.println(ltv1.getInfo());
        System.out.println(ltv2.getInfo());
        System.out.println("Cung ngon ngu lap trinh: " + ltv1.sameLanguage(ltv2));
    }

    public static void inputPresident() {
        Tongthong pre1 = new Tongthong("vietnam", "nam", "45", "chau a");
        Tongthong pre2 = new Tongthong("laos", "nam", "63", "chau a");
        pre1.getInfo();
        pre2.getInfo();
        System.out.println("Cung chau luc: " + pre1.sameContinent(pre2));
    }

    public static void inputComputer() {
        Computer mt = new Computer("dell", "4gb", "HDD");
        mt.getInfo();
        mt.diskSSD();
    }

    public static void inputFilm() {
        Film phim = new Film("co tich", "Thanh giong", 1);
        phim.getInfo();
    }

    public static void inputMotorbike() {
        Motorbike xe = new Motorbike("honda", "xanh", true);
        xe.getInfo();
    }

    public static void inputPhone() {
        Phone dt = new Phone("nokia", "android", 3000);
        dt.getInfo();
        System.out.println("La he dieu hanh IOS: " + dt.isIOS());
    }

    public static void inputQuannhan() {
        Quannhan qn = new Quannhan("Khong quan", "Dai uy", "ha noi");
        qn.getInfo();
        qn.kvHanoi();
    }

    public static void main(String[] args) {
        System.out.println("Cac doi tuong lua chon: ");
        System.out.print("1. Con meo \n" +
                "2. O to \n" +
                "3. Lap trinh vien \n" +
                "4. Giao vien \n" +
                "5. Tong thong \n" +
                "6. Computer \n" +
                "7. Phim \n" +
                "8. Xe may \n" +
                "9. Dien thoai \n" +
                "10. Quan nhan \n" +
                "0. Exit \n");
        System.out.println("Nhap lua chon: ");
        int choose = sc.nextInt();
        switch (choose) {
            case 1:
                inputCat();
                break;
            case 2:
                inputCar();
                break;
            case 3:
                inputDev();
                break;
            case 4:
                inputTeacher();
                break;
            case 5:
                inputPresident();
                break;
            case 6:
                inputComputer();
                break;
            case 7:
                inputFilm();
                break;
            case 8:
                inputMotorbike();
                break;
            case 9:
                inputPhone();
                break;
            case 10:
                inputQuannhan();
                break;
            case 0:
                break;
        }
    }
}