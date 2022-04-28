class Tarjeta extends Payment{

    constructor (numTarjeta, cvv, monto, fecha, email){
        super(monto, fecha, email);
        this.id;
        this.numTarjeta = numTarjeta;
        this.cvv = cvv;
        this.monto = monto;
        this.fecha = fecha;
        this.email = email; 
    }
}