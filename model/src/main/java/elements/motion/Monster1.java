package elements.motion;

import java.awt.Point;

import elements.Position;
import elements.Sprite;

public class Monster1 extends Monster {

	public Monster1(Point pos) {
		super(new Position(getPosition().getX(), getPosition().getY()), new Sprite(20));
	}

	public Direction getDirection(Point heroPos) {
		final Point pos = getPos().getLocation();

		Direction direction = getDirection(heroPos);

		if (pos.x == heroPos.x) {
			if (pos.y > heroPos.y) {
				direction = Direction.LEFT;
			} else if (pos.y < heroPos.y) {
				direction = Direction.RIGHT;
			}
		} else if (pos.y == heroPos.y) {
			if (pos.x > heroPos.x) {
				direction = Direction.UP;
			} else if (pos.x < heroPos.x) {
				direction = Direction.DOWN;
			}
		} else if (pos.x < heroPos.x) {
			if (pos.y > heroPos.y) {
				direction = Direction.DOWN;
			} else if (pos.y < heroPos.y) {
				direction = Direction.LEFT;
			}
		}
		return direction;
	}
}
