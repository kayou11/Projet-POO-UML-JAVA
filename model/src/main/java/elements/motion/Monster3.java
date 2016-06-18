package elements.motion;


import contract.ILorannWorld;
import elements.Position;
import elements.Sprite;

public class Monster3 extends Monster{

	public Monster3(ILorannWorld lorannWorld) {
		super("Monster3",new Sprite("monster_3.png"));
		setLorannWorld(lorannWorld);
	}

	

}
