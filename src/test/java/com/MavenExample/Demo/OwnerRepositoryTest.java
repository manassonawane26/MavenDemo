package com.MavenExample.Demo;

import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import com.MavenExample.dto.OwnerDTO;
import com.MavenExample.repository.OwnerRepository;
import com.MavenExample.repository.impl.OwnerRepositoryImpl;

/**
 * @author abhishekvermaa10
 *
 */
public class OwnerRepositoryTest {

	@Test
	public void testFindAllOwners() { 
		OwnerRepository ownerRepository = new OwnerRepositoryImpl();
		List<OwnerDTO> ownerDTOList = ownerRepository.findAllOwners();
		Assertions.assertFalse(ownerDTOList.isEmpty());
	}
}
