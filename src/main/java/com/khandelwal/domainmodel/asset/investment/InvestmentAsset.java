package com.khandelwal.domainmodel.asset.investment;

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
@Table(name = "INVESTMENT_ASSET")
@PrimaryKeyJoinColumn(name = "ASSET_NUMBER", referencedColumnName = "ASSET_NUMBER")
public class InvestmentAsset extends Asset {

	/* This creates a foreign key relationship */
	@ManyToOne
	private Category category;

	@Column(name = "IFSC_CODE")
	private String ifscCode;

	@Column(name = "SORT_CODE")
	private String sortCode;

	@Column(name = "UID_NUMBER")
	private String uidNumber;

	@Column(name = "DP_NUMBER")
	private String dpNumber;

	@Column(name = "REPOSITORY_ID")
	private String repositoryId;

	@Column(name = "CLIENT_ID")
	private String clientId;

	public InvestmentAsset() {

	}

	public InvestmentAsset(Category category, String ifscCode, String sortCode,
			String uidNumber, String dpNumber, String repositoryId,
			String clientId) {
		super();
		this.category = category;
		this.ifscCode = ifscCode;
		this.sortCode = sortCode;
		this.uidNumber = uidNumber;
		this.dpNumber = dpNumber;
		this.repositoryId = repositoryId;
		this.clientId = clientId;
	}

	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

	public String getIfscCode() {
		return ifscCode;
	}

	public void setIfscCode(String ifscCode) {
		this.ifscCode = ifscCode;
	}

	public String getSortCode() {
		return sortCode;
	}

	public void setSortCode(String sortCode) {
		this.sortCode = sortCode;
	}

	public String getUidNumber() {
		return uidNumber;
	}

	public void setUidNumber(String uidNumber) {
		this.uidNumber = uidNumber;
	}

	public String getDpNumber() {
		return dpNumber;
	}

	public void setDpNumber(String dpNumber) {
		this.dpNumber = dpNumber;
	}

	public String getRepositoryId() {
		return repositoryId;
	}

	public void setRepositoryId(String repositoryId) {
		this.repositoryId = repositoryId;
	}

	public String getClientId() {
		return clientId;
	}

	public void setClientId(String clientId) {
		this.clientId = clientId;
	}

}
