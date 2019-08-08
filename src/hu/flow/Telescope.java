package hu.flow;

public abstract class Telescope {

    private float diameter;
    private int fLength;

    public Telescope() {
        this.fLength = fLength;
        this.diameter = diameter;
    }

    public int getfLength() {
        return fLength;
    }

    public void setfLength(int fLength) {
        if (fLength < 0) {
            System.out.println("A szám nem lehet negatív.");; }
        else {
        this.fLength = fLength;
    }
    }

    public float getDiameter() {
        return diameter;
    }

    public void setDiameter(float diameter) {
        this.diameter = diameter;
    }

    @Override
    public String toString() {
        return "Telescope is" +
                "fLength=" + fLength +
                '}';
    }

    public abstract boolean hasColorError();
    }
}
