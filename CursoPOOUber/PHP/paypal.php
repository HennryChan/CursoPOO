<?php 

class Paypal extends Car{
    public $id;
    public $monto;
    public $fecha;
    public $email;

    public function __construct($monto, $fecha, $email)
    {
        $this->monto = $monto;
        $this->fecha = $fecha;
        $this->email = $email;
    }
}

?>