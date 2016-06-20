package contract;

public interface IOtherElements extends IElement{
    ILocation getLocation();
    void getLocation(ILocation direction);
    void moveTo(int x, int y);
}
