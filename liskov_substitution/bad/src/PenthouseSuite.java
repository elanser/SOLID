/**
 * Created by mrk on 4/8/14.
 */
public class PenthouseSuite extends UnitBedroom {
    public PenthouseSuite() {
        this.numberOfBedrooms = 4;
    }

    public void setSquareFootage(int sqft) {
        this.squareFootage = sqft;
    }

    @Override
    void setNumberOfBedrooms(int nb) {
        this.numberOfBedrooms = nb;
    }
}
