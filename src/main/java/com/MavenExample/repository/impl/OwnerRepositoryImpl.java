package com.MavenExample.repository.impl;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.MavenExample.config.DatabaseConfig;
import com.MavenExample.dto.OwnerDTO;
import com.MavenExample.exception.InternalServiceException;
import com.MavenExample.repository.OwnerRepository;
import com.MavenExample.util.MapperUtil;

/**
 * @author abhishekvermaa10
 *
 */
public class OwnerRepositoryImpl implements OwnerRepository {
	@Override
	public List<OwnerDTO> findAllOwners() {
		String sql = "SELECT * FROM owner_table";
		List<OwnerDTO> ownerList = new ArrayList<>();
		try (Connection connection = DatabaseConfig.getConnection();
				Statement statement = connection.createStatement();) {
			ResultSet resultSet = statement.executeQuery(sql);
			while (resultSet.next()) {
				OwnerDTO owner = MapperUtil.convertOwnerResultSetToDto(resultSet);
				ownerList.add(owner);
			}
		} catch (ClassNotFoundException | SQLException exception) {
			throw new InternalServiceException(exception.getMessage());
		}
		return ownerList;
	}
}
