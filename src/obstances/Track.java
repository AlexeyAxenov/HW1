package obstances;
import options.*;

public class Track implements Let {
    private int length;

    public Track(int length) {
        this.length = length;
    }
    @Override
    public boolean doIt(characters squad1) {
        return squad1.run(length);
    }
    public int getLength(){
         return length; }

}