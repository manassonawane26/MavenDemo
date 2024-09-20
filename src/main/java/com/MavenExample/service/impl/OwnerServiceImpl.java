package com.MavenExample.service.impl;

import java.util.List;

import com.MavenExample.dto.OwnerDTO;
import com.MavenExample.repository.OwnerRepository;
import com.MavenExample.repository.impl.OwnerRepositoryImpl;
import com.MavenExample.service.OwnerService;

/**
 * @author abhishekvermaa10
 *
 */
public class OwnerServiceImpl implements OwnerService {
	private OwnerRepository ownerRepository;
	
	public OwnerServiceImpl() {
		this.ownerRepository = new OwnerRepositoryImpl();
	}

	@Override
	public List<OwnerDTO> findAllOwners() {
		return ownerRepository.findAllOwners();
	}
}
