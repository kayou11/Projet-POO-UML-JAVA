package contract;

public interface IDoor extends IElement {
    boolean isUnlocked();

    void setUnlocked(boolean unlocked);
}