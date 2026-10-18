import java.util.Scanner;
import java.text.NumberFormat;
import java.util.Locale;
import java.util.Arrays;

public class main{
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);

        //number format rupiah
        NumberFormat rupiah = NumberFormat.getInstance(new Locale("id","ID"));

        //membuat data menu

        menu[]daftarMenu = new menu[8];

        daftarMenu[0]=new menu("Nasi Goreng",15000,"Makanan");
        daftarMenu[1]=new menu("Fuyunghai",20000,"Makanan");
        daftarMenu[2]=new menu("Dimsum",18000,"Makanan");
        daftarMenu[3]=new menu("Udang bakar",30000,"Makanan");
        daftarMenu[4]=new menu("Es Teler",10000,"Minuman");
        daftarMenu[5]=new menu("Lemon Tea",12000,"Minuman");
        daftarMenu[6]=new menu("Es Doger",15000,"Minuman");
        daftarMenu[7]=new menu("Air putih",2000,"Minuman");
        


        //menampilkan data menu

        System.out.println("======= Daftar Menu Makanan =======");
        System.out.println("1. " + daftarMenu[0].getnama() + "Rp. " + rupiah.format(daftarMenu[0].getharga()));
        System.out.println("2. " + daftarMenu[1].getnama() + "Rp. " + rupiah.format(daftarMenu[1].getharga()));
        System.out.println("3. " + daftarMenu[2].getnama() + "Rp. " + rupiah.format(daftarMenu[2].getharga()));
        System.out.println("4. " + daftarMenu[3].getnama() + "Rp. " + rupiah.format(daftarMenu[3].getharga()));

        System.out.println("===== \n Daftar Menu Minumanan =====");
        System.out.println("5. " + daftarMenu[4].getnama() + "Rp. " + rupiah.format(daftarMenu[4].getharga()));
        System.out.println("6. " + daftarMenu[5].getnama() + "Rp. " + rupiah.format(daftarMenu[5].getharga()));
        System.out.println("7. " + daftarMenu[6].getnama() + "Rp. " + rupiah.format(daftarMenu[6].getharga()));
        System.out.println("8. " + daftarMenu[7].getnama() + "Rp. " + rupiah.format(daftarMenu[7].getharga()));

        //input pesanan
        System.out.println("\nMasukkan nomor menu dan jumlah pesanan");
        System.out.println("Masukkan 0 jika tdak memilih menu");

        System.out.print("\nPilih nomor menu 1 : ");
        int pilihan1 = input.nextInt();
        int jumlah1 = 0;

        if (pilihan1 !=0){
            System.out.print("jumlah : ");
            jumlah1 = input.nextInt();

        }

        int pilihan2 = 0;
        int jumlah2 = 0;
        if (pilihan1 !=0){
            System.out.print("\nPilih nomor menu 2 : ");
            pilihan2 = input.nextInt();

            if(pilihan2 !=0){
                System.out.print("jumlah : ");
                jumlah2 = input.nextInt();

            }
        }

        int pilihan3 =0;
        int jumlah3 = 0;
        if(pilihan2 !=0){
            System.out.print("\nPilih nomor menu 3 : ");
            pilihan3 = input.nextInt();

            if(pilihan3 != 0){
                System.out.print("jumlah : ");
                jumlah3 = input.nextInt();

            }
        }

        int pilihan4 = 0;
        int jumlah4 = 0;
        if(pilihan1 != 0 && pilihan2 != 0 && pilihan3 != 0){
            System.out.print("\nPilih nomor menu 4 : ");
            pilihan4 = input.nextInt();

            if(pilihan4 != 0){
                System.out.print("jumlah : ");
                jumlah4 = input.nextInt();

            }
        }

        //menghitung total harga
        int subtotal = 0;
        int totalPeritem1 = 0;
        int totalPeritem2 = 0;
        int totalPeritem3 = 0;
        int totalPeritem4 = 0;

        if(pilihan1 >= 1 && pilihan1 <= 8 && jumlah1 >0){
            totalPeritem1 = daftarMenu[pilihan1 -1].getharga()*jumlah1;

            subtotal += totalPeritem1;

        }
        if(pilihan2 >= 1 && pilihan2 <= 8 && jumlah2 >0){
            totalPeritem2 = 
            daftarMenu[pilihan2 -1].getharga()*jumlah2;

            subtotal += totalPeritem2;
        }
        if(pilihan3 >= 1 && pilihan3 <= 8 && jumlah3 >0){
            totalPeritem3 = 
            daftarMenu[pilihan3 -1].getharga()*jumlah3;

            subtotal += totalPeritem3;
        }
         if(pilihan4 >= 1 && pilihan4 <= 8 && jumlah4 >0){
            totalPeritem4 = 
            daftarMenu[pilihan4 -1].getharga()*jumlah4;

            subtotal += totalPeritem4;
        }

        //menjumlahkan minuman buy one get one (BOGO)

        int jumlahMinuman = 0;

        int[]hargaMinuman = new int[100];
        int posisiMinuman = 0;

        if (pilihan1 >=5 && pilihan1 <= 8 && jumlah1 >0){

            for(int i =0; i<jumlah1;i++){
                hargaMinuman[posisiMinuman] = 
                daftarMenu[pilihan1 -1].getharga();
                posisiMinuman++;
                jumlahMinuman++;

            }

        }
          if (pilihan2 >=5 && pilihan2 <= 8 && jumlah2 >0){

            for(int i =0; i<jumlah2;i++){
                hargaMinuman[posisiMinuman] = 
                daftarMenu[pilihan2 -1].getharga();
                posisiMinuman++;
                jumlahMinuman++;

            }

        }
         if (pilihan3 >=5 && pilihan3 <= 8 && jumlah3 >0){

            for(int i =0; i<jumlah3;i++){
                hargaMinuman[posisiMinuman] = 
                daftarMenu[pilihan3 -1].getharga();
                posisiMinuman++;
                jumlahMinuman++;

            }

        }
         if (pilihan4 >=5 && pilihan4 <= 8 && jumlah4 >0){

            for(int i =0; i<jumlah4;i++){
                hargaMinuman[posisiMinuman] = 
                daftarMenu[pilihan4 -1].getharga();
                posisiMinuman++;
                jumlahMinuman++;

            }

        }

        //Promo BOGO
        double bogoDiskon = 0;

        //uturan harga minuman dari yang termurah
        Arrays.sort(hargaMinuman,0,jumlahMinuman);

        //setiap 2 minuman mendapat 1 gratis 
        int jumlahGratis = jumlahMinuman /2;

        //hanya akhit jika pemblian lebih dari 50.000
        if(subtotal > 50000 && jumlahMinuman >= 2){
            for (int i = 0; i<jumlahGratis;i++){
                bogoDiskon += hargaMinuman[i];

            }

        }

        //Diskon 10%

        double diskon = 0;
        if(subtotal >100000){
            diskon = subtotal *0.10;

        }

        // total stelah promo / diskon

        double totalSetelahPromo = subtotal - diskon - bogoDiskon;

        //pajak 10%
        double pajak = totalSetelahPromo * 0.10;

        //biaya pelayanan 
        int biayaPelayanan = 2000;

        //total akhir
        double totalAkhir = totalSetelahPromo + pajak + biayaPelayanan;

        //mencetak struk pembayaran 
        System.out.println("\n ====== Struk Pembayaran ======");
        if(totalPeritem1 >0){
            System.out.println(daftarMenu[pilihan1 -1].getnama()+ "x" + jumlah1 + " + Rp." + rupiah.format(totalPeritem1));

        }
        if(totalPeritem2 >0){
            System.out.println(daftarMenu[pilihan2 -1].getnama()+ "x" + jumlah2 + " + Rp." + rupiah.format(totalPeritem2));
            
        }
         if(totalPeritem3 >0){
            System.out.println(daftarMenu[pilihan3 -1].getnama()+ "x" + jumlah3 + " + Rp." + rupiah.format(totalPeritem3));
            
        }
         if(totalPeritem4 >0){
            System.out.println(daftarMenu[pilihan4 -1].getnama()+ "x" + jumlah4 + " + Rp." + rupiah.format(totalPeritem4));
            
        }

        System.out.println("---------------------------------");
        System.out.println("Subtotal : Rp. " + rupiah.format(subtotal));
        if(diskon>0){
            System.out.println("Diskon 10% : Rp. " + rupiah.format((int)diskon));

        }
        if(bogoDiskon >0){
            System.out.println("Promo Buy One Get One : Rp. " + rupiah.format((int)bogoDiskon));

        }
        System.out.println("Subtotal setelah promo : Rp. " + rupiah.format((int)totalSetelahPromo));
        System.out.println("Pajak 10% : Rp. " + rupiah.format((int)pajak));
        System.out.println("Biaya Pelayanan : Rp. " + rupiah.format(biayaPelayanan));
        System.out.println("Total Pembayaran : Rp. " + rupiah.format((int)totalAkhir));
        System.out.println(" Terima Kasih telah berbelanja di Restoran kami, Silakan datang kembali");
        input.close();
    }

}
