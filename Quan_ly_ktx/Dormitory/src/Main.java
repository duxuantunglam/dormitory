import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

            int xet=20,t,i,j;
            int a[]=new int[2001]; //mang xet xem phong da duoc tao chua

            Scanner sc = new Scanner (System.in);

            for (i=0;i<2000;i++) a[i]=0; //khoi tao tat ca cac phong deu chua duoc tao

            ArrayList<phong> mp=new ArrayList<>(); //tao 1 mang de chua cac phong

            ArrayList<nguoithue> nt=new ArrayList<>(); //tao 1 mang de chua nhung nguoi thue


            //Các chức năng của hệ thống
            System.out.println("*****Danh sach chuc nang cua he thong*****");
            System.out.println(" -1- Them phong");
            System.out.println(" -2- Sua phong");
            System.out.println(" -3- Xoa phong");
            System.out.println(" -4- Danh sach phong cao cap dang duoc thue");
            System.out.println(" -5- Danh sach phong tieu chuan dang duoc thue");
            System.out.println(" -6- Doanh thu trong 1 khoang thoi gian");
            System.out.println(" -7- Thong ke so luong nguoi thue theo hang phong");
            System.out.println(" -8- Thong ke so luong nguoi thue theo thoi gian");
            System.out.println(" -0- Thoat he thong");

            while (xet!=0)
            {
                System.out.print("***********CHON CHUC NANG: ");

                xet=sc.nextInt();

                if (xet==1)    ///Them phong
                {
                    t=20;
                    System.out.println(" --Bam 1 de chon phong cao cap");
                    System.out.println(" --Bam 2 de chon phong tieu chuan");
                    System.out.println(" --Bam 0 de ket thuc them phong");
                    sc.nextLine();
                    while (t!=0)  // them phong cho den khi khong them nua
                    {
                        System.out.print("***Chon loai phong: ");
                        t=sc.nextInt();

                        if (t==1)
                        {
                            System.out.println("***Nhap thong tin phong cao cap***");
                            System.out.print("-Nhap so phong: ");
                            int b1=sc.nextInt();

                            System.out.print("-Nhap dien tich phong: ");
                            double b2=sc.nextDouble();

                            System.out.print("-Nhap so tang: ");
                            int b3=sc.nextInt();

                            if (a[b1]==0)
                            {
                                mp.add(new phongcaocap(b1,b2,b3,true,0));
                                a[b1]=1;
                            }
                            else System.out.println("!!!Phong da ton tai");

                        }

                        else if (t==2)
                        {
                            System.out.println("***Nhap thong tin phong tieu chuan***");

                            System.out.print("-Nhap so phong: ");
                            int b1=sc.nextInt();

                            System.out.print("-Nhap dien tich phong: ");
                            double b2=sc.nextDouble();

                            System.out.print("-Nhap so tang: ");
                            int b3=sc.nextInt();


                            if (a[b1]==0)
                            {
                                mp.add(new phongtieuchuan(b1,b2,b3,false,0));
                                a[b1]=1;
                            }
                            else System.out.println("!!!Phong da ton tai");
                        }

                        else if (t!=0) System.out.println("!!!!Vui long nhap dung loai phong");

                    }



                }


                else if (xet==2)   ///Sua phong
                {
                    System.out.print("-----Nhap phong muon sua: "); //co 2 hoat dong chinh la them nguoi thue va xoa nguoi thue ra khoi phong

                    int k=sc.nextInt();

                    if (a[k]==0) System.out.println("!!!!!! Phong nay khong ton tai");
                    else
                    {
                        System.out.print("-Bam 1 de them nguoi;   -Bam 0 de xoa nguoi :   ");
                        int h=sc.nextInt();
                        if (h==1)  //them 1 nguoi vao phong
                        {
                            System.out.print("----Nhap ten nguoi thue: ");
                            sc.nextLine();
                            String c=sc.nextLine();

                            System.out.print("----Nhap thoi gian thue theo thang : ");
                            int c1=sc.nextInt();

                            for (i=0;i<mp.size();i++) //tim xem phong dang thao tac la phong cao cap hay tieu chuan
                                if(mp.get(i).getsophong()==k)
                                {

                                    if (mp.get(i).getkieuphong()==true)
                                    {
                                        if (mp.get(i).getsonguoi()<4)
                                        {
                                            int l=mp.get(i).getsonguoi()+1;
                                            mp.get(i).setsonguoi(l);
                                            nt.add(new nguoithue(c,true,k,c1));

                                        }

                                    }
                                    else
                                    if (mp.get(i).getkieuphong()==false)
                                    {
                                        if (mp.get(i).getsonguoi()<6)
                                        {
                                            int l=mp.get(i).getsonguoi()+1;
                                            mp.get(i).setsonguoi(l);
                                            nt.add(new nguoithue(c,false,k,c1));

                                        }

                                    }

                                }


                            //for (i=0;i<nt.size();i++) nt.get(i).inTTnt();
                        }

                        if (h==0){

                            for (i=0;i<mp.size();i++)
                                if(mp.get(i).getsophong()==k)                      //kiem tra phong co nguoi de xoa khong
                                    if (mp.get(i).getsonguoi()==0) System.out.println(" !!! Phong nay chua co nguoi thue");
                                    else
                                    {
                                        System.out.println("----Danh sach nguoi thue hien tai:"); //in ra danh sach nguoi thue phong nay hien tai
                                        for (j=0;j<nt.size();j++)
                                        {

                                            if (nt.get(j).getsophongthue()==k)
                                            {
                                                System.out.println(" -Ma xoa:" + j + " - " + nt.get(j).getten());
                                            }
                                        }
                                        System.out.print("Chon ma de xoa nguoi thue khoi phong: ");
                                        int m=sc.nextInt();
                                        //xoa 1 nguoi khoi phong
                                        nt.remove(m);
                                        System.out.println("*****Da xoa thanh cong***** ");
                                        //for (j=0;j<nt.size();j++) System.out.println(nt.get(j).getten());
                                    }



                        }
                    }
                }

                else if (xet==3)  //xoa phong
                {
                    System.out.print("-----Chon phong can xoa: ");
                    int m=sc.nextInt();
                    int d=0;
                    if (a[m]==0) System.out.println("!!!!Phong khong ton tai"); //kiem tra phong da duoc tao chua
                    else
                    {
                        for (i=0;i<mp.size();i++)
                        {
                            if (mp.get(i).getsophong()== m) d=i; //lay vi tri cua phong trong mang cac phong
                        }

                        for (i=0;i<nt.size();i++)
                        {
                            if (nt.get(i).getsophongthue()==m) {
                                nt.remove(i);
                                i=i-1;
                            }  // xoa cac nguoi thue phong do

                        }
                        mp.remove(d);

                        System.out.println("*****Da xoa phong thanh cong******");

                        //for (i=0;i<mp.size();i++) mp.get(i).inTT();
                        //for (i=0;i<nt.size();i++) nt.get(i).inTTnt();

                    }
                }

                else if (xet==4)    //danh sach phong cao cap
                {
                    System.out.println("----Danh sach phong cao cap dang duoc thue la: ");
                    for (i=0;i<mp.size();i++)
                        if (mp.get(i).getkieuphong()==true) System.out.println("  - " + mp.get(i).getsophong());

                    sc.nextLine();


                }

                else if (xet==5)    //danh sach phong tieu chuan
                {
                    System.out.println("----Danh sach phong tieu chuan dang duoc thue la: ");
                    for (i=0;i<mp.size();i++)
                        if (mp.get(i).getkieuphong()==false) System.out.println("  - " + mp.get(i).getsophong());
                }

                if (xet==6)
                {
                    double tong=0;

                    for (i=0;i<nt.size();i++)
                        for (j=0;j<mp.size();j++)
                            if (nt.get(i).getsophongthue()==mp.get(j).getsophong())
                                tong=tong+mp.get(j).giathue()*nt.get(i).getthoigianthue();

                    System.out.printf("-----Doanh thu:  %.0f VND \n", tong);
                }

                if (xet==7)  //thong ke theo hang phong
                {
                    System.out.println("------Thong ke so luong nguoi thue theo hang phong:");

                    int dem=0;
                    System.out.println("---Phong cao cap - Danh sach nguoi thue: ");
                    for (i=0;i<nt.size();i++) {
                        if (nt.get(i).getloaiphongthue()==true)
                        {
                            System.out.print("   |   "+nt.get(i).getten());
                            dem=dem+1;
                        }
                    }
                    System.out.println();
                    System.out.println("-----Tong " + dem + " nguoi-----");

                    int dem1=0;
                    System.out.println("---Phong tieu chuan - Danh sach nguoi thue: ");
                    for (i=0;i<nt.size();i++) {
                        if (nt.get(i).getloaiphongthue()==false)
                        {
                            System.out.print("   |   "+nt.get(i).getten());
                            dem1=dem1+1;
                        }
                    }
                    System.out.println();
                    System.out.println("-----Tong " + dem1 + " nguoi-----");


                }

                if (xet==8)  //thong ke theo thoi gian nhap vao
                {
                    System.out.println("-------Thong ke theo thoi gian thue phong: ");
                    int max=0,chay;
                    int ar[] = new int[51];
                    for (i=0;i<50;i++) ar[i]=0;
                    for (i=0;i<nt.size();i++)
                    {
                        chay=nt.get(i).getthoigianthue();
                        ar[chay]=ar[chay]+1;
                        if (max<chay) max=chay;
                    }

                    for (i=1;i<=max;i++) System.out.println("----So luong nguoi thue trong " + i + " thang la: " + ar[i] + " nguoi");

                }

                if (xet==0)
                {
                    System.out.println();
                    System.out.println("*****Ban da ket thuc cong viec!!*****");
                }

            }




        }
}