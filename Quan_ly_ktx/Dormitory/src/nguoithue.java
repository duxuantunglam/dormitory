public class nguoithue {
    private String ten;
    private boolean loaiphongthue; // =true neu thue phong cao cap;  =false neu thue phong tieu chuan
    private int sophongthue;
    private int thoigianthue;

    public nguoithue(String a, boolean b, int c, int d){

        ten=a;
        loaiphongthue=b;
        sophongthue=c;
        thoigianthue=d;

    }

    public String getten(){
        return ten;
    }

    public void setten(String a){
        ten=a;
    }

    public boolean getloaiphongthue(){
        return loaiphongthue;
    }

    public void setloaiphongthue(boolean a){
        loaiphongthue=a;
    }

    public int getsophongthue(){
        return sophongthue;
    }

    public void setsophongthue(int a){
        sophongthue=a;
    }

    public int getthoigianthue(){
        return thoigianthue;
    }

    public void setthoigianthue(int a){
        thoigianthue=a;
    }

    public void inTTnt(){

        System.out.println("*********Thong tin nguoi thue**********");
        System.out.println(" -Ten nguoi thue: " + ten);
        if (loaiphongthue==true) System.out.println(" -Loai phong thue: phong cao cap");
        else System.out.println(" -Loai phong thue: phong tieu chuan");
        System.out.println(" -Thue phong so: " + sophongthue);
        System.out.println(" -Thoi gian thue: " + thoigianthue + " thang");

    }
}
