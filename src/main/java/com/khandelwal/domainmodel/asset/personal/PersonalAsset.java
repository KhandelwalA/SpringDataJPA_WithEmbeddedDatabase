package com.khandelwal.domainmodel.asset.personal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

import com.khandelwal.domainmodel.asset.Asset;
import com.khandelwal.domainmodel.category.Category;

/**
 * This class is annotated as entity class to represent object in java and table
 * row in database
 * 
 * @author Abhishek Khandelwal
 *
 */
@SuppressWarnings("serial")
@Entity
@PrimaryKeyJoinColumn(name = "ASSET_NUMBER", referencedColumnName = "ASSET_NUMBER")
@Table(name = "PERSONAL_ASSET")
public class PersonalAsset extends Asset {

	/* This creates a foreign key relationship */
	@ManyToOne
	private Category category;

	@Column(name = "MISCELLANEOUS_INFO")
	private String miscellaneousInfo;

	public PersonalAsset() {

	}

	public PersonalAsset(String miscellaneousInfo) {
		super();

		this.miscellaneousInfo = miscellaneousInfo;

	}

	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

	public String getMiscellaneousInfo() {
		return miscellaneousInfo;
	}

	public void setMiscellaneousInfo(String miscellaneousInfo) {
		this.miscellaneousInfo = miscellaneousInfo;
	}

}
