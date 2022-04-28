class Efectivo extends Payment{

    constructor(cambio, monto, fecha, email){
        super(monto, fecha, email);
        this.id;
        this.cambio = cambio;
        this.monto = monto;
        this.fecha = fecha;
        this.email = email;
    }
}