package model;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

import elements.Elements;
import elements.Sprite;

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

	@Override
	public boolean create(Elements entity) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean delete(Elements entity) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean update(Elements entity) {
		// TODO Auto-generated method stub
		return false;
	}
	/*
	/*
	 * (non-Javadoc)
	 *
	 * @see model.DAOEntity#find(int)
	 */
	@Override
	public Elements find(final int idElement) {
		return null;

		/*Elements elements = new Elements();

			try {
				final String sql = "{call SpriteLinkByIdElements(?)}";
				final CallableStatement call = this.getConnection().prepareCall(sql);
				call.setInt(1, idElement);
				call.execute();
				final ResultSet resultSet = call.getResultSet();
				if (resultSet.first()) {
					elements = new Elements(idElement,resultSet.getString("NameSprite"), resultSet.getString("SpriteLink"));
				}
				return elements;
			} catch (final SQLException e) {
				e.printStackTrace();
			}
			return null;*/
		}

}
