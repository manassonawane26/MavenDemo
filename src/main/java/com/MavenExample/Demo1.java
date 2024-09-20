package com.MavenExample;

import java.util.List;

import com.MavenExample.dto.OwnerDTO;
import com.MavenExample.service.OwnerService;
import com.MavenExample.service.impl.OwnerServiceImpl;

/**
 * @author abhishekvermaa10
 *
 */
public class Demo1 {
	private OwnerService ownerService;

	public static void main(String[] args) {
		Demo1 demo = new Demo1();
		demo.run(args);
	}

	public void run(String... args) {
		ownerService = new OwnerServiceImpl();
		try {
			System.out.println("Welcome to Pet Shop");
			List<OwnerDTO> ownerDTOList = ownerService.findAllOwners();
			System.out.println("There are " + ownerDTOList.size() + " owners.");
			ownerDTOList.forEach(System.out::println);
		} catch (Exception exception) {
			System.out.println(exception.getMessage());
		}
	}
}
