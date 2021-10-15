package carhere;

class requestRental {
    //required parameters
    private String pickUpTime;
    private String dropOffTime;
    private String classOfVehicle;
    private String placeToGo;
    
    //optional parameters
    private int passengerCount;
    
    public String getPickUpTime() {
        return this.pickUpTime;
    }
    
    public String getDropOffTime() {
        return this.dropOffTime;
    }
    
    public String getClassOfVehicle() {
        return this.classOfVehicle;
    }
    
    public String getPlaceToGo() {
        return this.placeToGo;
    }
    
    public int getPassengerCount() {
        return this.passengerCount;
    }
    
    private requestRental(requestRentalBuilder builder) {
        this.pickUpTime = builder.pickUpTime;
        this.dropOffTime = builder.dropOffTime;
        this.placeToGo = builder.placeToGo;
        this.classOfVehicle = builder.classOfVehicle;
        this.passengerCount = builder.passengerCount;
    }
    
    public static class requestRentalBuilder {
    
    private String pickUpTime;
    private String dropOffTime;
    private String classOfVehicle;
    private String placeToGo;
    
    private int passengerCount;
    
    public requestRentalBuilder(String pickUpTime, String dropOffTime, String classOfVehicle, String placeToGo){
        this.pickUpTime = pickUpTime;
        this.dropOffTime = dropOffTime;
        this.placeToGo = placeToGo;
        this.classOfVehicle = classOfVehicle;
    } 
    
    public requestRentalBuilder setPassengerCount(int passengerCount) {
        this.passengerCount = passengerCount;
        return this;
    }
    
    public requestRental build() {
        return new requestRental(this);
    }
  }
}

public class CarHere {

    public static void main(String[] args) {
        
        requestRental sampleReqOne = new requestRental.requestRentalBuilder("08:30 AM", "09:30 PM","Zip", "Colombo").setPassengerCount(3).build();
        
        System.out.println("Sample Rental Request One: ");
        System.out.println("Pickup Time: " + sampleReqOne.getPickUpTime());
        System.out.println("Drop Off Time: " + sampleReqOne.getDropOffTime());
        System.out.println("Class Of Vehicle: " + sampleReqOne.getClassOfVehicle());
        System.out.println("Place To Go: " + sampleReqOne.getPlaceToGo());
        System.out.println("Passenger Count: " + sampleReqOne.getPassengerCount());
        
        System.out.println("");
        System.out.println("**************************");
        
        requestRental sampleReqTwo = new requestRental.requestRentalBuilder("08:30 AM", "09:30 PM","Zip", "Colombo").build();
        
        System.out.println("Sample Rental Request Two: ");
        System.out.println("Pickup Time: " + sampleReqTwo.getPickUpTime());
        System.out.println("Drop Off Time: " + sampleReqTwo.getDropOffTime());
        System.out.println("Class Of Vehicle: " + sampleReqTwo.getClassOfVehicle());
        System.out.println("Place To Go: " + sampleReqTwo.getPlaceToGo());
        System.out.println("Passenger Count: " + sampleReqTwo.getPassengerCount());
    }
}
