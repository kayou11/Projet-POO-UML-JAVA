package model;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

import elements.Elements;
import elements.Sprite;

// TODO: Auto-generated Javadoc
/**
 * The Class DAOHelloWorld.
 *
 * @author Pierre Kerebel Omer
 */
public class DAOElements extends DAOEntity<Elements> {

	/**
	 * Instantiates a new DAO Elements.
	 *
	 * @param connection
	 *          the connection
	 * @throws SQLException
	 *           the SQL exception
	 */
	public DAOElements(final Connection connection) throws SQLException {
		super(connection);
	}

	/* (non-Javadoc)
	 * @see model.DAOEntity#create(java.util.Observable)
	 */
	@Override
	public boolean create(Elements entity) {
		// TODO Auto-generated method stub
		return false;
	}

	/* (non-Javadoc)
	 * @see model.DAOEntity#delete(java.util.Observable)
	 */
	@Override
	public boolean delete(Elements entity) {
		// TODO Auto-generated method stub
		return false;
	}

	/* (non-Javadoc)
	 * @see model.DAOEntity#update(java.util.Observable)
	 */
	@Override
	public boolean update(Elements entity) {
		// TODO Auto-generated method stub
		return false;
	}
	
	public Elements find(int idElement) {
		return null;
	}
}
