package VehicleRentalDesk;

public interface Rentable {
    void printAllInfo();
    double costForDays(int days);
    String VehicleBrand();
    String numberPlate();
    int getNumberOfRentalDays();
}
