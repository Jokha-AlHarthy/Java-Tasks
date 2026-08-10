package VehicleRentalDesk;

public class Car implements Rentable {
    private String plateNumber;
    private Integer dailyRate = 0;
    private Integer NumberOfRentalDays = 0;
    private Integer NumberOfSeats = 0;

    public String getPlateNumber() {
        return plateNumber;
    }

    @Override
    public String numberPlate() {
        return plateNumber;
    }

    public void setPlateNumber(String plateNumber) {
        if(plateNumber != null && !plateNumber.trim().isEmpty()){
            this.plateNumber = plateNumber;
        }else{
            IO.println("Plate number is required");
        }
    }

    public Integer getDailyRate() {
        return dailyRate;
    }

    public void setDailyRate(Integer dailyRate) {
        if(dailyRate>= 0 && dailyRate <= 200){
            this.dailyRate = dailyRate;
        }else{
            IO.println("Invalid daily rate!");
        }
    }

    public int getNumberOfRentalDays() {
        if(NumberOfRentalDays != null){
            return NumberOfRentalDays;
        }else{
            return 0;
        }
    }

    public void setNumberOfRentalDays(Integer numberOfRentalDays) {
        if(numberOfRentalDays >= 1 && numberOfRentalDays <= 30){
            this.NumberOfRentalDays = numberOfRentalDays;
        }else{
            IO.println("The number of rental days is not valid");
        }
    }

    public Integer getNumberOfSeats() {
        return NumberOfSeats;
    }

    public void setNumberOfSeats(Integer numberOfSeats) {
        if(numberOfSeats>= 2 && numberOfSeats <= 7){
            this.NumberOfSeats = numberOfSeats;
        }else{
            IO.println("The number of seat is invalid");
        }
    }


    @Override
    public void printAllInfo() {
        IO.println("Car{" +
                "plateNumber='" + plateNumber + '\'' +
                ", dailyRate=" + dailyRate +
                ", NumberOfRentalDays=" + NumberOfRentalDays +
                ", NumberOfSeats=" + NumberOfSeats +
                '}');
    }

    @Override
    public double costForDays(int days) {
        return (dailyRate * days)+5.00;
    }

    @Override
    public String VehicleBrand() {
        return "Car";
    }
}
