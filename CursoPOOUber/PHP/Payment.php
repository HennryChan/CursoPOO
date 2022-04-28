<?php
class Payment{

    public $id;
    public $monto;
    public $fecha;
    public $email;

    public function __construct($monto, $fecha, $email)
    { 
        $this->monto = $monto;
        $this->facha = $fecha;
        $this->email = $email;
    }
}


?>