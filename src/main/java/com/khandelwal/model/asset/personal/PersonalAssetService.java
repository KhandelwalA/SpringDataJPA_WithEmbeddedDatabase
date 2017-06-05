package com.khandelwal.model.asset.personal;

import java.util.ArrayList;
import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.khandelwal.domainmodel.asset.personal.PersonalAsset;

@Service
public class PersonalAssetService {

	private PersonalAssetRepository personalAssetRepository;

	@Autowired
	public PersonalAssetService(PersonalAssetRepository personalAssetRepository) {
		super();
		this.personalAssetRepository = personalAssetRepository;
	}

	/**
	 * This method adds Personal Asset in db
	 * 
	 * @param personalAsset
	 */
	public void addPersonalAsset(PersonalAsset personalAsset) {

		personalAssetRepository.save(personalAsset);
	}

	/**
	 * This method returns all the PersonalAsset records
	 * 
	 * @return
	 */
	public Collection<PersonalAsset> getAllPersonalAsset() {

		Collection<PersonalAsset> personalAssetCollection = new ArrayList<PersonalAsset>();

		for (PersonalAsset personalAsset : personalAssetRepository.findAll()) {
			personalAssetCollection.add(personalAsset);
		}

		return personalAssetCollection;
	}

	/**
	 * This method returns the PersonalAsset record matched by Id
	 * 
	 * @return
	 */
	public PersonalAsset getPersonalAssetById(Integer assetId) {

		return personalAssetRepository.findOne(assetId);

	}

	/**
	 * This method returns the PersonalAsset record matched by AssetName
	 * 
	 * @return
	 */
	/*public PersonalAsset getPersonalAssetByName(String assetName) {

		return personalAssetRepository.findAssetName(assetName);

	}*/

	/**
	 * This method delete the PersonalAsset record matched by Id
	 * 
	 * @return
	 */
	public void deletePersonalAsset(Integer assetId) {

		personalAssetRepository.delete(assetId);

	}
}