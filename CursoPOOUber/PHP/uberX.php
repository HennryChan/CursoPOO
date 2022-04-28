<?php
require_once('car.php');
class UberX extends Car {
    public $brand;
    public $model;
   

    public function __construct($license, $drive, $brand, $model){
        parent::__construct($license, $drive);
        $this->license = $license;
        $this->drive = $drive;
        $this->model = $model;
        $this->brand = $brand;
    }

    public function printDataCar()
    {
        parent ::printDataCar();
        echo "
        Modelo: $this->model
        Marca: $this->brand
        "; 
    }
}
?>