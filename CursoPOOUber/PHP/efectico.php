<?php 
class Efectivo extends Car{
    public id;
    public cambio;
    public monto;
    public fecha;
    public email;

    public function __construct($cambio, $monto, $fecha, $email){
        $this->cambio = $cambio;
        $this->monto = $monto;
        $this->fecha = $fecha;
        $this->email = $email;
    }

}

?>