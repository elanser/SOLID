/**
 * Created by mrk on 4/8/14.
 */
abstract class Unit {
    int squareFootage;
    abstract void setSquareFootage(int sqft);
}

abstract class UnitBedroom extends Unit {
    int numberOfBedrooms;
    abstract void setNumberOfBedrooms(int nb);
}
