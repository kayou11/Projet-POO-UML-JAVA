package contract;

public interface IElement {
	public ISprite getSprite();

	public Permeability getPermeability();
	public String getName();

	public BehaviorElements getBehaviorElements();

	public ILocation getLocation();

}
