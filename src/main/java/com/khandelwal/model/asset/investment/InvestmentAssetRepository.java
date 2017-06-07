package com.khandelwal.model.asset.investment;

import java.util.Collection;

import org.springframework.data.repository.CrudRepository;

import com.khandelwal.domainmodel.asset.investment.InvestmentAsset;

/**
 * This interface extends CrudRepository of Springframework, implementation of
 * which is provided by Spring with basic CRUD operations and developer neither
 * need to make connection with db nor to write basic CRUD operations
 * 
 * @author Abhishek Khandelwal
 *
 */
public interface InvestmentAssetRepository extends
		CrudRepository<InvestmentAsset, String> {

	public Collection<InvestmentAsset> findByAssetName(String assetName);

	public Collection<InvestmentAsset> findByAssetType(String assetType);
}