package Java;

import java.util.ArrayList;
import java.util.Map;

public class UberVan  extends Car {
    Map<String, Map<String, Integer>> typeCarAccepted;
    ArrayList<String> seatsMaterial;
    private Integer passenger;

    public UberVan(String license, Account drive){
        super(license, drive);
    }
    
    public UberVan (String license, Account drive,
        Map<String, Map<String, Integer>> typeCarAccepted,
        ArrayList<String> seatsMaterial){
            super(license, drive);
            this.typeCarAccepted = typeCarAccepted;
            this.seatsMaterial = seatsMaterial;
        }

    @Override    
    public void setPassenger(Integer passenger){
        if(passenger == 6){
            this.passenger = passenger;
        }else{
            System.out.println("Necesita signar 4 pasajeros");
        }
    }
}
