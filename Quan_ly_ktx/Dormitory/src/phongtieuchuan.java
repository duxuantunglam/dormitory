public class phongtieuchuan extends phong{
    public phongtieuchuan(int a, double b, int c, boolean d, int e){

        sophong=a;
        dientich=b;
        tang=c;
        kieuphong=d;
        songuoi=e;
    }

    public boolean themnguoi(){
        if (songuoi<6) {
            songuoi=songuoi+1;
            return true;
        }
        else return false;
    }

    @Override
    public double giathue(){

        return dientich*50000;

    }

    @Override
    public void inTT(){

        System.out.println("*********Thong tin phong**********");
        System.out.println(" -Phong so: " + sophong);
        System.out.println(" -So nguoi hien tai: " + songuoi);
        System.out.println(" -Kieu phong: phong tieu chuan");
        System.out.println(" -Dien tich: " + dientich + " m2");
        System.out.println(" -Tang thu " + tang);
        System.out.println(" -Gia thue 1 thang: " + giathue());

    }
}
