package model;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.Observable;


// TODO: Auto-generated Javadoc
/**
 * The Class DAOEntity.
 *
 * @author Jean-Aymeric Diet
 *
 * @param <E>
 *          the element type
 */
abstract class DAOEntity<E extends Observable> {

	/** The connection. */
	private final Connection connection;

	/**
	 * Instantiates a new DAO entity.
	 *
	 * @param connection
	 *          the connection
	 * @throws SQLException
	 *           the SQL exception
	 */
	public DAOEntity(final Connection connection) throws SQLException {
		this.connection = connection;
	}

	/**
	 * Gets the connection.
	 *
	 * @return the connection
	 */
	protected Connection getConnection() {
		return this.connection;
	}

	/**
	 * Creates the.
	 *
	 * @param entity
	 *          the entity
	 * @return true, if successful
	 */
	public abstract boolean create(E entity);

	/**
	 * Delete.
	 *
	 * @param entity
	 *          the entity
	 * @return true, if successful
	 */
	public abstract boolean delete(E entity);

	/**
	 * Update.
	 *
	 * @param entity
	 *          the entity
	 * @return true, if successful
	 */
	public abstract boolean update(E entity);

	/**
	 * Find.
	 *
	 * @param idElement the id element
	 * @return the e
	 * @throws Exception the exception
	 */
	public abstract E find(int idElement) throws Exception;
	
}
