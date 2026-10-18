public class menu {
    private String nama;
    private int harga;
    private String kategori;
    public menu (String nama,int harga,String kategori){
        this.nama = nama;
        this.harga = harga;
        this.kategori = kategori;

    }
    public String getnama(){
        return nama;
    }
    public int getharga(){
        return harga;
    }
    public String getkategori(){
        return kategori;
    }

}
