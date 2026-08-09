package ClinicWaitingList;

public interface ATTENDABLE {
    void printAllInfo();
    String getPriority();
    int getWaitMinutes();
    String getName();
}
