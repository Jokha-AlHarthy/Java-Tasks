import java.util.TreeSet;

public class CityDirectorySet {
    //Create the main method inside the class
    public static void main(String[] args){

        //Create a TreeSet<String> to store city names
        TreeSet<String> cityNames = new TreeSet<>();

        //Asking user to enter number of the cities
        IO.println("Enter number of cities: ");
        int NumOfCities = Integer.parseInt(IO.readln());

        //checking if the number is less than or equal to 0
        int totalEntered = 0;
        if(NumOfCities<=0){
            IO.println("Invalid number of cities");
        }else {
            //Use a for loop to read each city name from the user
            for(int i=0; i<NumOfCities; i++){
                //Add each city name to the TreeSet
                IO.println("Enter the name of the city");
                String cityName = IO.readln();
                totalEntered++;

                //If a duplicate city name is entered
                if(!cityNames.add(cityName)){
                    IO.println("City already exists. Duplicate entries are not allowed");
                }

                //checking if the city name exist or not
                String searchResult;
                if(cityNames.contains(cityName)){
                    searchResult = "City found in the directory";
                }else{
                    searchResult = "City not found in the directory";
                }

                //Use an if-else statement to classify the directory
                String classification;
                if(cityNames.size()<5){
                    classification = "Small Directory";
                } else if (cityNames.size()>= 5 && cityNames.size()<=10) {
                    classification = "Medium Directory";
                }else {
                    classification = " Large Directory";
                }

                //Display the following using System.out.println()
                System.out.println("Total cities entered: "+totalEntered);
                System.out.println("Total unique cities: "+cityNames.size());
                System.out.println("All cities in alphabetical order: "+cityNames);
                System.out.println("City name "+cityName+"Search result"+searchResult);
                System.out.println("Directory classification: "+classification);


            }
        }

    }
}
