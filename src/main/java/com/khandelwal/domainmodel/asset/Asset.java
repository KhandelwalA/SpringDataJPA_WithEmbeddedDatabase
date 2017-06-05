package com.khandelwal.domainmodel.asset;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Table;

@SuppressWarnings("serial")
@Embeddable
@Table(name = "ASSET")
public class Asset implements Serializable {

	@Column(name = "ASSET_NAME", nullable = false)
	private String assetName;

	@Column(name = "ASSET_TYPE", nullable = false)
	private String assetType;

	public Asset() {

	}

	public Asset(int assetId, String assetName, String assetType) {
		super();

		this.assetName = assetName;
		this.assetType = assetType;
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
}
