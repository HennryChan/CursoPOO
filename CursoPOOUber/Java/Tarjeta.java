package Java;

public class Tarjeta extends Payment {
    Integer id;
    String numTarjeta;
    Integer cvv;
    float monto;
    String fecha;
    String email;
    
    public Tarjeta(String numTarjeta, Integer cvv,  float monto, String fecha, String email){
        super(monto, fecha, email);
        this.numTarjeta = numTarjeta;
        this.cvv = cvv;
        this.monto = monto;
        this.fecha = fecha;
        this.email = email;
    }
}
