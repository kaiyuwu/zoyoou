package com.zoyoou.dao;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import com.zoyoou.common.entity.ActiveStatus;

public class ActiveStatusDao extends AbstractDataAccess<ActiveStatus> {

	public ActiveStatusDao(Connection connection) throws SQLException {
		super(connection);
	}

	@Override
	public List<ActiveStatus> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<ActiveStatus> findAllBy(String queryCondition) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ActiveStatus findById(long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ActiveStatus create(ActiveStatus entity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ActiveStatus update(ActiveStatus entity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ActiveStatus remove(long id) {
		// TODO Auto-generated method stub
		return null;
	}


}
