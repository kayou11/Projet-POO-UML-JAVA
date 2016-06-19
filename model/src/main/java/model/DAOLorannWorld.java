package model;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

import contract.ILorann;
import contract.IMotionlessElement;
import elements.Elements;
import elements.FactoryElements;
import elements.motion.Lorann;

import java.sql.CallableStatement;

public class DAOLorannWorld extends DAOEntity<LorannWorld>{

	public DAOLorannWorld(Connection connection) throws SQLException {
		super(connection);
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean create(LorannWorld entity) {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean delete(LorannWorld entity) {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean update(LorannWorld entity) {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public LorannWorld find(int level){
		
		final LorannWorld lorannWorld = new LorannWorld();
		
		try {
			final String sql = "{call findPositionElement(?)}";
			final CallableStatement call = this.getConnection().prepareCall(sql);
			call.setInt(1, level);
			call.execute();
			final ResultSet resultSet = call.getResultSet();

			while (resultSet.next()) {
				final int x = resultSet.getInt("PositionX");
				final int y = resultSet.getInt("PositionY");
				if(FactoryElements.getFromName(resultSet.getString("NameSprite")) != null) {

					lorannWorld.addElements(FactoryElements.getFromName(resultSet.getString("NameSprite")), x,y);
				}
				else if(FactoryElements.getfromNameLorann(resultSet.getString("NameSprite"),lorannWorld) != null) {
					
					lorannWorld.addLorann(FactoryElements.getfromNameLorann(resultSet.getString("NameSprite"),lorannWorld), x, y);
				}
			
				else if(FactoryElements.getFromNameMotion(resultSet.getString("NameSprite")) != null) {
					lorannWorld.addElements(FactoryElements.getFromNameMotion(resultSet.getString("NameSprite")), x, y);
				}
			}
			return lorannWorld;
		} catch (final SQLException e) {
			e.printStackTrace();
		}
		return null;
	}
}
