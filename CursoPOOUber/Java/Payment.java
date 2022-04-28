package Java;

public class Payment {
    Integer id;
    float monto;
    String fecha;
    String email;

    public Payment(Float monto, String fecha, String email){
        this.monto = monto;
        this.fecha = fecha;
        this.email = email;
    }
}
