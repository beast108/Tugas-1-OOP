public class Yamaha extends Motor {
    public void tampilkan() {
        String bahanbakar="Premium";
        Motor m = new Motor();
        m.inputData("Jupiter MX","Bebek","Kuning");
        m.tampilkandata();

        System.out.println("Jenis bahan bakar : "+bahanbakar);
    }
}