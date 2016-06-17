package model;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

import contract.IMotionElement;

import java.sql.CallableStatement;

import elements.motionless.MotionlessElements;

public class DAOLorannWorld extends DAOEntity<LorannWorld>{

	public DAOLorannWorld(Connection connection) throws SQLException {
		super(connection);
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean create(LorannWorld entity) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean delete(LorannWorld entity) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean update(LorannWorld entity) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public LorannWorld find(int level) {
		final LorannWorld lorannWorld = new LorannWorld();

		try {
			final String sql = "{call findPositionElement(?)}";
			final CallableStatement call = this.getConnection().prepareCall(sql);
			call.setInt(1, level);
			call.execute();
			final ResultSet resultSet = call.getResultSet();
			while (resultSet.next()) {
				
				lorannWorld.addElements((IMotionElement) MotionlessElements.getFromName(resultSet.getString("NameSprite")), resultSet.getInt("PositionX"), resultSet.getInt("PositionY"));
			}
			return lorannWorld;
		} catch (final SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

}
