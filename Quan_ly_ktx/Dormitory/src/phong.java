public abstract class phong {
    protected int sophong;
    protected double dientich;
    protected int tang;
    protected boolean kieuphong; // =true neu la phong cao cap; =false neu la phong tieu chuan
    protected int songuoi; // so nguoi hien tai da thue phong nay

    public abstract double giathue();
    public abstract void inTT();

    public int getsophong(){
        return sophong;
    }

    public void setsophong(int a) {
        sophong = a;
    }

    public double getdientich(){
        return dientich;
    }
    public void setdientich(double a) {
        dientich = a;
    }
    public int gettang(){
        return tang;
    }

    public void settang(int a){
        tang = a;
    }

    public boolean getkieuphong(){
        return kieuphong;
    }

    public void setkieuphong(boolean a){
        kieuphong = a;
    }

    public int getsonguoi(){
        return songuoi;
    }

    public void setsonguoi(int a) {
        songuoi = a;
    }
}
