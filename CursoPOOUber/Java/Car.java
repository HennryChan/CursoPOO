package Java;

public class Car {
    private Integer id;
    private String license;
    private Account drive;
    private Integer passenger;

    public Car(String license, Account drive){
        this.license = license;
        this.drive = drive;
    }

    void printDaTaCar(){
        if(passenger != null ){
            System.out.println("License: " + license + " Name Drive: " + drive.name + " Passengers: " + passenger);
        }
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLicense() {
        return license;
    }

    public void setLicense(String license) {
        this.license = license;
    }

    public Account getDrive() {
        return drive;
    }

    public void setDrive(Account drive) {
        this.drive = drive;
    }

    public Integer getPassenger() {
        return passenger;
    }

    public void setPassenger(Integer passenger) {
        this.passenger = passenger;
    }
    
}
