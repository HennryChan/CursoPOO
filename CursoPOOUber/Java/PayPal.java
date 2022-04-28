package Java;

public class PayPal extends Payment{
    Integer id;
    float monto;
    String fecha;
    String email;
    
    public PayPal( float monto, String fecha, String email){
        super(monto, fecha, email);

        this.monto = monto;
        this.fecha = fecha;
        this.email = email;
    }
}
