package Java;

 class Efectivo extends Payment {
     Integer id;
     float cambio;
     float monto;
     String fecha;
     String email;

     public Efectivo(float monto, String fecha, String email ,float cambio){
         super(monto, fecha, email);
         this.cambio = cambio;
         this.monto = monto;
         this.fecha = fecha;
         this.email = email;
     }

}
