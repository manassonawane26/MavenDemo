package com.MavenExample.service;

import java.util.List;

import com.MavenExample.dto.OwnerDTO;

/**
 * @author abhishekvermaa10
 *
 */
public interface OwnerService {
	List<OwnerDTO> findAllOwners();
}