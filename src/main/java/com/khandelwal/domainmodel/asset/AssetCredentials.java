package com.khandelwal.domainmodel.asset;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Table;

@SuppressWarnings(value = { "serial" })
@Embeddable
@Table(name = "ASSET_CREDENTIAL")
public class AssetCredentials implements Serializable {

	@Column(name = "LOGIN_ID")
	private String loginId;

	@Column(name = "PASSWORD")
	private String password;

	@Column(name = "PHONE_PASSWORD")
	private String phonePassword;

	public AssetCredentials() {

	}

	public AssetCredentials(String loginId, String password,
			String phonePassword) {
		super();
		this.loginId = loginId;
		this.password = password;
		this.phonePassword = phonePassword;
	}

	public String getLoginId() {
		return loginId;
	}

	public void setLoginId(String loginId) {
		this.loginId = loginId;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getPhonePassword() {
		return phonePassword;
	}

	public void setPhonePassword(String phonePassword) {
		this.phonePassword = phonePassword;
	}

}
