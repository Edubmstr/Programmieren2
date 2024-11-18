package programmieren2.StudentUniversity;

public class Location {
    private String street;
    private int zipCode;
    private String city;
    private int houseNumber;

    public Location(String street, int zipCode, String city, int houseNumber){
        this.street = street;
        this.zipCode = zipCode;
        this.city = city;
        this.houseNumber = houseNumber;
    }

    public String toString(){
        return this.city;
    }

}
