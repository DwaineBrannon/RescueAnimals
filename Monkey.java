public class Monkey extends RescueAnimal{

    //Instance Variables
    private String species;
    private String tailLength;
    private String height;
    private String bodyLength;

    //Constructor
    public Monkey(String name, String species, String gender, String age, String weight, String acquisitionDate, String acquisitionCountry,
                  String trainingStatus, boolean reserved, String inServiceCountry, String tailLength, String height, String bodyLength) {
        setName(name);
        setSpecies(species);
        setGender(gender);
        setAge(age);
        setWeight(weight);
        setAcquisitionDate(acquisitionDate);
        setAcquisitionLocation(acquisitionCountry);
        setTrainingStatus(trainingStatus);
        setReserved(reserved);
        setInServiceCountry(inServiceCountry);
        setTailLength(tailLength);
        setHeight(height);
        setBodyLength(bodyLength);


    }

    //Accessor Methods

    public String getSpecies() {
        return species;
    }

    public String getTailLength() {
        return tailLength;
    }

    public String getHeight() {
        return height;
    }

    public String getBodyLength() {
        return bodyLength;
    }

    //Mutator Methods
    private void setHeight(String monkeyHeight) {
        height = monkeyHeight;
    }

    private void setTailLength(String monkeyTailLength) {
        tailLength = monkeyTailLength;
    }

    private void setBodyLength(String monkeyBodyLength) {
        bodyLength = monkeyBodyLength;
    }

    private void setSpecies(String monkeySpecies) {
        species = monkeySpecies;
    }
    @Override
    public String toString() {
        return getName();
    }
}
