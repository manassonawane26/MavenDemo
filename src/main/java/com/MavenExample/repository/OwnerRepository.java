package com.MavenExample.repository;

import java.util.List;

import com.MavenExample.dto.OwnerDTO;

/**
 * @author abhishekvermaa10
 *
 */
public interface OwnerRepository {
	List<OwnerDTO> findAllOwners();
}
