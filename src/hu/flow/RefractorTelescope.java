package hu.flow;

public class RefractorTelescope extends Telescope {

    private int numberOfLenses;

    public RefractorTelescope() {
        super(int fLength);
        this.numberOfLenses = numberOfLenses;

    }


    public int getNumberOfLenses() {
        return numberOfLenses;
    }

    public void setNumberOfLenses(int numberOfLenses) {
        if (numberOfLenses > 0)
        this.numberOfLenses = numberOfLenses;
    }

    @Override
    public boolean hasColorError() {
        return false;
    }
}
