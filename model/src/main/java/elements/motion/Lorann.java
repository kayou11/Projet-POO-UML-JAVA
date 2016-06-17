package elements.motion;

import java.awt.event.KeyEvent;

import elements.Position;
import elements.Sprite;

public class Lorann extends MotionElements {

	static Sprite lorannUp = new Sprite("lorann_u.png");
	static Sprite lorannDown = new Sprite("lorann_b.png");
	static Sprite lorannRight= new Sprite("lorann_r.png");
	static Sprite lorannLeft = new Sprite("lorann_l.png");
	static Sprite lorannUpRight = new Sprite("lorann_ur.png");
	static Sprite lorannUpLeft = new Sprite("lorann_ul.png");
	static Sprite lorannDownRight = new Sprite("lorann_br.png");
	static Sprite lorannDownLeft = new Sprite("lorann_bl.png");
	private static int key;
	public boolean win = false;

	static Sprite sprite[] = { lorannRight, lorannDownRight, lorannDown, lorannDownLeft, lorannLeft, lorannUpLeft,
			lorannUp, lorannUpRight };

	public Lorann() {
	super("LorannRight",changeLorann(sens,key));	}

	public void setWin(boolean win) {
		this.win = win;
	}

	public boolean getWin() {
		return this.win;
		
	}

	public static Sprite changeLorann(int sens, int keyCode) {

		if (key == KeyEvent.VK_UP || key == KeyEvent.VK_DOWN || key == KeyEvent.VK_RIGHT || key == KeyEvent.VK_LEFT) {
			switch (sens) {
			case 1:
				return sprite[1];

			case 2:
				return sprite[2];

			case 3:
				return sprite[3];

			case 4:
				return sprite[4];

			case 5:
				return sprite[5];

			case 6:
				return sprite[6];

			case 7:
				return sprite[7];

			case 8:
				return sprite[8];

			default:
				;
			}
		} else {
			for (int i = 0; i < sprite.length; i++) {
				return sprite[i];
			}
		}
		return null;
	}
}
