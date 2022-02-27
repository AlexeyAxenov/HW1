package obstances;
import options.*;

public class Water implements Let {
    private int length;

    public Water(int length) {
        this.length = length;
    }
    @Override
    public boolean doIt(characters squad1) {
        if (squad1 instanceof Swimable)
            return ((Swimable) squad1).swim(length);
        else
            return false;
    }
    public int getLength(){
        return length;
    }
}