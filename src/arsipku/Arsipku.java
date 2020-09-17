package arsipku;
public class Arsipku implements Biodata, Nilai{
  public static void main(String[] args) {
      Arsipku ps = new Arsipku ();
      ps.tampilNama();
      ps.tampilTempatLahir();
      ps.tampilHobi();
      ps.tampilAgama();
      ps.tampilBahasaIndonesia();
      ps.tampilMatematika();         
    }
    public void tampilNama() {
         System.out.println("Biodata");
         System.out.println("Namaku : Nuril fatichatul jannah");
    }
    public void tampilTempatLahir() {
        System.out.println("TempatLahir : Jember");
    }
    public void tampilHobi() {
       System.out.println("Hobi : Olahraga");
    }
    public void tampilAgama() {
         System.out.println("Nilai");
       System.out.println("Agama = 95");
    }
     public void tampilBahasaIndonesia() {
       System.out.println("BahasaIndonesia = 90");
    }
      public void tampilMatematika() {
       System.out.println("Matematika = 83");
    }
    
}
