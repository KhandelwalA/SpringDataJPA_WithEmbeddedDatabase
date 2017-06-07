package com.khandelwal.domainmodel.asset;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Table;

@SuppressWarnings(value = "serial")
@Embeddable
@Table(name = "ASSET_CONTACT_INFORMATION")
public class AssetContactInformation implements Serializable {

	@Column(name = "CONTACT_NUMBER_1")
	private String contactNumber1;

	@Column(name = "CONTACT_NUMBER_2")
	private String contactNumber2;

	@Column(name = "CONTACT_NUMBER_3")
	private String contactNumber3;

	public AssetContactInformation() {

	}

	public AssetContactInformation(String contactNumber1,
			String contactNumber2, String contactNumber3) {
		super();
		this.contactNumber1 = contactNumber1;
		this.contactNumber2 = contactNumber2;
		this.contactNumber3 = contactNumber3;
	}

	public String getContactNumber1() {
		return contactNumber1;
	}

	public void setContactNumber1(String contactNumber1) {
		this.contactNumber1 = contactNumber1;
	}

	public String getContactNumber2() {
		return contactNumber2;
	}

	public void setContactNumber2(String contactNumber2) {
		this.contactNumber2 = contactNumber2;
	}

	public String getContactNumber3() {
		return contactNumber3;
	}

	public void setContactNumber3(String contactNumber3) {
		this.contactNumber3 = contactNumber3;
	}

}
