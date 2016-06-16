package elements;

import java.awt.Image;
import java.io.File;
import java.io.IOException;
import java.sql.SQLException;

import javax.imageio.ImageIO;

import model.DAOElements;
import model.DBConnection;

public class Sprite {
	private Image image;
	
	public Sprite(final int idElement) {
	
		try {
			this.image = (ImageIO.read((getClass().getResource(loadSprite(idElement)))));
			
		} catch (final IOException e) {
			e.printStackTrace();
		}
	}
	
	public Sprite() {
		this(0);
	}
	
	
	public String loadSprite(int idElement) {
		String sprite = "";
		try {
			final DAOElements daoElements = new DAOElements(DBConnection.getInstance().getConnection());
			sprite = daoElements.find(idElement).getPathElement();
		} catch (final SQLException e) {
			e.printStackTrace();
		}
		return sprite;
	}
	
	public Image getImage() {
		return image;
	}

	public void setImage(Image image) {
		this.image = image;
	}

}
