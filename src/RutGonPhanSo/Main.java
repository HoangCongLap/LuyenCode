package RutGonPhanSo;

/**
 *
 * @author LapHoang
 */
class PhanSo {

    private int tu, mau;

    public PhanSo(int tu, int mau) {
        super();
        this.tu = tu;
        this.mau = mau;
    }

    public int getTu() {
        return tu;
    }

    public void setTu(int tu) {
        this.tu = tu;
    }

    public int getMau() {
        return mau;
    }

    public void setMau(int mau) {
        this.mau = mau;
    }

    public int timUSCLN(int a, int b) {
        while (a != b) {
            if (a > b) {
                a -= b;
            } else {
                b -= a;
            }
        }
        return a;
    }

    public void toiGianPhanSo() {
        int i = timUSCLN(this.getTu(), this.getMau());
        this.setTu(this.getTu() / i);
        this.setMau(this.getMau() / i);
        System.out.println(this.tu+" "+this.mau);
    }
}

public class Main {

    public static void main(String[] args) {
        PhanSo phanSo1 = new PhanSo(18, 3);
       phanSo1.toiGianPhanSo();
    }
}
