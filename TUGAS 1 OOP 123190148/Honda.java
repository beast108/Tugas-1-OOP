public class Honda extends Motor {
    public void tampilkan() {
        String bahanbakar="Premium";
        Motor m = new Motor();
        m.inputData("CBR150","Sport","Merah");
        m.tampilkandata();

        System.out.println("Jenis bahan bakar : "+bahanbakar);
    }


}
