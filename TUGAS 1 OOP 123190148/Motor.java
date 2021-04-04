public class Motor {
    private String merek;
    private String jenis;
    private String warna;

    public String getMerek() {
        return merek;
    }

    public void setMerek(String merek) {
        this.merek=merek;
    }
    public String getJenis() {
        return jenis; 
    }
    public void setJenis(String jenis) {
        this.jenis=jenis;
    }
    public String getWarna() {
        return warna;
    }
    public void setWarna(String warna) {
        this.warna=warna;
    }
    public String getHarga() {
        return harga;
    }
    public void setHarga(String harga) {
        this.harga=harga;
    }
    public void tampilkandata() {
        System.out.println("Merek Motor : "+getMerek());
        System.out.println("Jenis Motor : "+getJenis());
        System.out.println("Warna Motor : "+getWarna());
        System.out.println("Harga Motor : "+getHarga());
    }
    public void inputData(String m, String j, String w, String h) {
        setMerek(m);
        setJenis(j);
        setWarna(w);
        setHarga(h);
    }

}
