package model;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import elements.FactoryElements;
import java.sql.CallableStatement;

// TODO: Auto-generated Javadoc
/**
 * The Class DAOLorannWorld.
 */
public class DAOLorannWorld extends DAOEntity<LorannWorld>{

	/**
	 * Instantiates a new DAO lorann world.
	 *
	 * @param connection the connection
	 * @throws SQLException the SQL exception
	 */
	public DAOLorannWorld(Connection connection) throws SQLException {
		super(connection);
		// TODO Auto-generated constructor stub
	}

	/* (non-Javadoc)
	 * @see model.DAOEntity#create(java.util.Observable)
	 */
	@Override
	public boolean create(LorannWorld entity) {
		// TODO Auto-generated method stub
		return true;
	}

	/* (non-Javadoc)
	 * @see model.DAOEntity#delete(java.util.Observable)
	 */
	@Override
	public boolean delete(LorannWorld entity) {
		// TODO Auto-generated method stub
		return true;
	}

	/* (non-Javadoc)
	 * @see model.DAOEntity#update(java.util.Observable)
	 */
	@Override
	public boolean update(LorannWorld entity) {
		// TODO Auto-generated method stub
		return true;
	}
	
	/**
	 * Find level.
	 *
	 * @param id the id
	 * @return the result set
	 * @throws SQLException the SQL exception
	 */
	public ResultSet findLevel(int id) throws SQLException {
		final String sql = "{call LevelByIDMap}";
		final CallableStatement call = this.getConnection().prepareCall(sql);
		call.setInt(1, id);
		call.execute();
		return call.getResultSet();
	}
	
	/* (non-Javadoc)
	 * @see model.DAOEntity#find(int)
	 */
	@Override
	public LorannWorld find(int level){
		
		final LorannWorld lorannWorld = new LorannWorld(level);
		
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
