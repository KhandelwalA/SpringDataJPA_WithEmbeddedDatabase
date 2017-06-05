package com.khandelwal.model.asset.personal;

import org.springframework.data.repository.CrudRepository;

import com.khandelwal.domainmodel.asset.personal.PersonalAsset;

/**
 * This interface extends CrudRepository of Springframework, implementation of
 * which is provided by Spring with basic CRUD operations and developer neither
 * need to make connection with db nor to write basic CRUD operations
 * 
 * @author Abhishek Khandelwal
 *
 */
public interface PersonalAssetRepository extends CrudRepository<PersonalAsset, Integer> {

	//public PersonalAsset findAssetName(String assetName);
}
