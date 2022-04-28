<?php 

class Tarjeta extends Car{

    public $id;
    public $numTarjeta;
    public $cvv;
    public $monto;
    public $fecha;
    public $email;

    public function __construct($numTarjeta, $cvv, $monto, $fecha, $email)
    {
        $this->numTarjeta = $numTarjeta;
        $this->cvv = $cvv;
        $this->monto = $monto;
        $this->fecha = $fecha;
        $this->email = $email;
    }
}

?>