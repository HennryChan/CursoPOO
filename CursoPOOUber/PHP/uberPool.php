<?php
require_once('car.php');
class UberPool extends Car {
    public $brand;
    public $model;

    public function __construct($license, $drive, $brand, $model){
        parent::__construct($license, $drive);
        $this->brand = $brand;
        $this->model = $model;
    }
}
?>