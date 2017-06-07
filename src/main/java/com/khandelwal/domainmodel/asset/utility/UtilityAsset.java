package com.khandelwal.domainmodel.asset.utility;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

import com.khandelwal.domainmodel.asset.Asset;
import com.khandelwal.domainmodel.category.Category;

@SuppressWarnings(value = "serial")
@Entity
@Table(name = "UTILITY_ASSET")
@PrimaryKeyJoinColumn(name = "ASSET_NUMBER", referencedColumnName = "ASSET_NUMBER")
public class UtilityAsset extends Asset {

	/* This creates a foreign key relationship */
	@ManyToOne
	private Category category;

	@Column(name = "AREA_REFERENCE")
	private String areaReference;

	@Column(name = "ZONE_CODE")
	private String zoneCode;

	@Column(name = "MR_NUMBER")
	private String mrNumber;

	@Column(name = "METER_NUMBER")
	private String meterNumber;

	@Column(name = "WC_NUMBER")
	private String wcNumber;

	@Column(name = "LICENSE_NUMBER")
	private String licenseNumber;

	public UtilityAsset() {

	}

	public UtilityAsset(Category category, String areaReference,
			String zoneCode, String mrNumber, String meterNumber,
			String wcNumber, String licenseNumber) {
		super();
		this.category = category;
		this.areaReference = areaReference;
		this.zoneCode = zoneCode;
		this.mrNumber = mrNumber;
		this.meterNumber = meterNumber;
		this.wcNumber = wcNumber;
		this.licenseNumber = licenseNumber;
	}

	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

	public String getAreaReference() {
		return areaReference;
	}

	public void setAreaReference(String areaReference) {
		this.areaReference = areaReference;
	}

	public String getZoneCode() {
		return zoneCode;
	}

	public void setZoneCode(String zoneCode) {
		this.zoneCode = zoneCode;
	}

	public String getMrNumber() {
		return mrNumber;
	}

	public void setMrNumber(String mrNumber) {
		this.mrNumber = mrNumber;
	}

	public String getMeterNumber() {
		return meterNumber;
	}

	public void setMeterNumber(String meterNumber) {
		this.meterNumber = meterNumber;
	}

	public String getWcNumber() {
		return wcNumber;
	}

	public void setWcNumber(String wcNumber) {
		this.wcNumber = wcNumber;
	}

	public String getLicenseNumber() {
		return licenseNumber;
	}

	public void setLicenseNumber(String licenseNumber) {
		this.licenseNumber = licenseNumber;
	}

}
