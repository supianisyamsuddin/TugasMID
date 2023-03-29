/*	Nama   		: Supiani Syamsuddin
	NIM   		: 13020210085 */

public class Test0085 {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        // (a)
        Balok balok1 = new Balok();

        // (b)
        Balok balok2 = new Balok(20, 35, 15);

        // (c)
        balok1.setL(5);

        // (d)
        balok1.setP(25);

        // (e)
        balok2.setT(10);

        // (f)
        balok1.info();

        // (g)
        balok2.info();
    }
}

// class Balok
class Balok extends PersegiPanjang {
    private int t;

    public Balok() {
        // (h)
        super();
        this.t = 15;
    }

    public Balok(int p, int l, int t) {
        // (i)
        super(p, l);
        this.t = t;
    }

    // (j) getter setter class balok
    public int getT() {
        return t;
    }

    public void setT(int t) {
        this.t = t;
    }
      
    public int volume() {
        //fungsi untuk menghitung volume balok : p x l x t
        return getP() * getL() * t;
    }

    public void info() {
        //fungsi untuk tampil nilai panjang, lebar, tinggi,Luas, dan volume balok
        System.out.println("Panjang: " + getP());
        System.out.println("Lebar: " + getL());
        System.out.println("Tinggi: " + t);
        System.out.println("Luas: " + luas());
        System.out.println("Volume: " + volume());
    }
}

// class Persegi Panjang
class PersegiPanjang {
    private int p, l;

    public PersegiPanjang() {
        //berisi nilai panjang=30 & lebar=20
        p = 30;
        l = 20;
    }

    public PersegiPanjang(int p, int l) {
        //berisi nilai pada saat runtime p p, l=l
        this.p = p;
        this.l = l;
    }

    //buat getter setter class Persegi Panjang
    public int getP() {
        return p;
    }

    public void setP(int p) {
        this.p = p;
    }

    public int getL() {
        return l;
    }

    public void setL(int l) {
        this.l = l;
    }

    public int luas() {
        //fungsi untuk menghitung luas persegi panjang : p x l
        return p * l;
    }
}