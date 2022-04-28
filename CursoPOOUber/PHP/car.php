<?php
require_once('account.php');
class Car{
    public $id;
    public $license;
    public $drive;
    protected $passenger;

    public function __construct($license, $drive){
        $this->license = $license;
        $this->drive = $drive;
    }

    public function printDataCar() {
        echo "
        Licencia: $this->license 
        Drive: {$this->drive->name}
        Numero de pasajeros: $this->passenger
        "; 
    }

    public function getPassenger(){
        return $this->passenger;
    }

    public function setPassenger($passenger){
        if($passenger == 4){
            $this->passenger = $passenger;
        }else{
            echo "Necesitas asignar 4 pasajeros";
        }
    }
}

?>