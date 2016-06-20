package elements.motion;


import contract.ILorannWorld;
import elements.Sprite;

public class Monster4 extends Monster{

	public Monster4(ILorannWorld lorannWorld) {
		super("Monster4",new Sprite("monster_4.png"),lorannWorld,new Stupid());
	}
	

}
