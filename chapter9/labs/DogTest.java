// ****************************************************************
// DogTest.java
//
// A simple test class that creates a Dog and makes it speak.
//
// ****************************************************************
public class DogTest
{
    public static void main(String[] args)
    {
        Yorkshire york = new Yorkshire("Ma Boi");
        Labrador labby = new Labrador("Pinky", "Green");
        System.out.println(york.avgBreedWeight() +"\n" + labby.avgBreedWeight());
    }
}