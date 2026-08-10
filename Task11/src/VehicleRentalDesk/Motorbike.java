package VehicleRentalDesk;

public class Motorbike implements Rentable{
    private final String plateNumber;
    private Integer dailyRate = 0;
    private Integer NumOfrentalDays = 0;
    private Integer engineSize=0;

    public Motorbike(String plateNumber){
        this.plateNumber = plateNumber;
    }

    public String getPlateNumber() {
        return plateNumber;
    }

    public Integer getDailyRate() {
        return dailyRate;
    }

    public void setDailyRate(Integer dailyRate) {
        if(dailyRate> 0 && dailyRate<=200){
            this.dailyRate = dailyRate;
        }else{
            IO.println("Daily rate has invalid number");
        }
    }

    @Override
    public int getNumberOfRentalDays() {
        if(NumOfrentalDays!=null){
            return NumOfrentalDays;
        }else{
            return 0;
        }
    }

    public void setNumOfrentalDays(Integer numOfrentalDays) {
        if(numOfrentalDays>= 1 && numOfrentalDays<= 30){
            NumOfrentalDays = numOfrentalDays;
        }else{
            IO.println("Number of rental days are invalid");
        }
    }

    public Integer getEngineSize() {
        return engineSize;
    }

    public void setEngineSize(Integer engineSize) {
        if(engineSize>=50 && engineSize<=1500){
            this.engineSize = engineSize;
        }else{
            IO.println("Invalid number of engine");
        }
    }

    @Override
    public void printAllInfo() {
        IO.println("Motorbike{" +
                "plateNumber='" + plateNumber + '\'' +
                ", dailyRate=" + dailyRate +
                ", NumOfrentalDays=" + NumOfrentalDays +
                ", engineSize=" + engineSize +
                '}');
    }

    @Override
    public double costForDays(int days) {
        return dailyRate * days;
    }

    @Override
    public String VehicleBrand() {
        return "Motorbike";
    }

    @Override
    public String numberPlate() {
        return "";
    }


}
