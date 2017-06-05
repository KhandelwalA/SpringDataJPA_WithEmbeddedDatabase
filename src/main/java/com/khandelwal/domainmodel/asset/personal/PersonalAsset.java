package com.khandelwal.domainmodel.asset.personal;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.khandelwal.domainmodel.asset.Asset;
import com.khandelwal.domainmodel.category.Category;

/**
 * This class is annotated as entity class to represent object in java and table
 * row in database
 * 
 * @author khabh
 *
 */
@SuppressWarnings("serial")
@Entity
@Table(name = "PERSONAL_ASSET")
public class PersonalAsset implements Serializable {

	/* This creates a foreign key relationship */
	@ManyToOne
	private Category category;

	@Id
	@Column(name = "ASSET_ID", nullable = false)
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer assetId;

	@Column(name = "UNIQUE_NUMBER", nullable = false)
	private String uniqueNumber;

	@Column(name = "MISCELLANEOUS_INFO")
	private String miscellaneousInfo;

	@Embedded
	private Asset asset;

	public PersonalAsset() {

	}

	public PersonalAsset(Integer assetId, String uniqueNumber, String miscellaneousInfo, Asset asset) {
		super();
		this.assetId = assetId;
		this.uniqueNumber = uniqueNumber;
		this.miscellaneousInfo = miscellaneousInfo;
		this.asset = asset;
	}

	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

	public Integer getAssetId() {
		return assetId;
	}

	public void setAssetId(Integer assetId) {
		this.assetId = assetId;
	}

	public String getUniqueNumber() {
		return uniqueNumber;
	}

	public void setUniqueNumber(String uniqueNumber) {
		this.uniqueNumber = uniqueNumber;
	}

	public String getMiscellaneousInfo() {
		return miscellaneousInfo;
	}

	public void setMiscellaneousInfo(String miscellaneousInfo) {
		this.miscellaneousInfo = miscellaneousInfo;
	}

	public Asset getAsset() {
		return asset;
	}

	public void setAsset(Asset asset) {
		this.asset = asset;
	}

}
