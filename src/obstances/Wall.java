package obstances;
import options.*;

public class Wall implements Let {
    private float height;

    public Wall(float height) {
        this.height = height;
    }
    @Override
    public boolean doIt(characters squad1) {
        if (squad1 instanceof Jumpable)
            return ((Jumpable) squad1).jump(height);
        else
            return false;
    }
    public float getHeight(){
        return height;
    }
}