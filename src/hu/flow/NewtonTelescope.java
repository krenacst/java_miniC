package hu.flow;

public class NewtonTelescope extends Telescope {


    public float secondMirrorSize;

    public NewtonTelescope() {
        this.fLength = getfLength();
        this.secondMirrorSize = secondMirrorSize;

        public NewtonTelescope(float fLength, float secondMirrorSize) {
            this.fLength = getfLength();

        }
    }









    @Override
    public boolean hasColorError() {
        return false;
    }
}
