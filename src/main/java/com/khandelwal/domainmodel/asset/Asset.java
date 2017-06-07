package com.khandelwal.domainmodel.asset;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

@Entity
@SuppressWarnings("serial")
@Table(name = "ASSET")
@Inheritance(strategy = InheritanceType.JOINED)
public class Asset implements Serializable {

	@Id
	@Column(name = "ASSET_NUMBER")
	private String assetNumber;

	@Column(name = "ASSET_NAME", nullable = false)
	private String assetName;

	@Column(name = "ASSET_TYPE", nullable = false)
	private String assetType;

	@Embedded
	private AssetAddress assetAddress;

	@Embedded
	private AssetCredentials assetCredentials;

	@Embedded
	private AssetContactInformation assetContactInformation;

	@Embedded
	private AssetSecurityInformation assetSecurityInformation;

	public Asset() {

	}

	public Asset(String assetNumber, String assetName, String assetType,
			AssetAddress assetAddress, AssetCredentials assetCredentials,
			AssetContactInformation assetContactInformation,
			AssetSecurityInformation assetSecurityInformation) {
		super();
		this.assetNumber = assetNumber;
		this.assetName = assetName;
		this.assetType = assetType;
		this.assetAddress = assetAddress;
		this.assetCredentials = assetCredentials;
		this.assetContactInformation = assetContactInformation;
		this.assetSecurityInformation = assetSecurityInformation;
	}

	public String getAssetNumber() {
		return assetNumber;
	}

	public void setAssetNumber(String assetNumber) {
		this.assetNumber = assetNumber;
	}

	public String getAssetName() {
		return assetName;
	}

	public void setAssetName(String assetName) {
		this.assetName = assetName;
	}

	public String getAssetType() {
		return assetType;
	}

	public void setAssetType(String assetType) {
		this.assetType = assetType;
	}

	public AssetAddress getAssetAddress() {
		return assetAddress;
	}

	public void setAssetAddress(AssetAddress assetAddress) {
		this.assetAddress = assetAddress;
	}

	public AssetCredentials getAssetCredentials() {
		return assetCredentials;
	}

	public void setAssetCredentials(AssetCredentials assetCredentials) {
		this.assetCredentials = assetCredentials;
	}

	public AssetContactInformation getAssetContactInformation() {
		return assetContactInformation;
	}

	public void setAssetContactInformation(
			AssetContactInformation assetContactInformation) {
		this.assetContactInformation = assetContactInformation;
	}

	public AssetSecurityInformation getAssetSecurityInformation() {
		return assetSecurityInformation;
	}

	public void setAssetSecurityInformation(
			AssetSecurityInformation assetSecurityInformation) {
		this.assetSecurityInformation = assetSecurityInformation;
	}

}
