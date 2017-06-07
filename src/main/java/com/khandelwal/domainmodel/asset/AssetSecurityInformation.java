package com.khandelwal.domainmodel.asset;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Table;

@SuppressWarnings(value = "serial")
@Embeddable
@Table(name = "ASSET_SECURITY_INFO")
public class AssetSecurityInformation implements Serializable {

	@Column(name = "SECURITY_QUESTION_1")
	private String securityQuestion1;

	@Column(name = "SECURITY_QUESTION_2")
	private String securityQuestion2;

	@Column(name = "SECURITY_QUESTION_3")
	private String securityQuestion3;

	@Column(name = "SECURITY_QUESTION_4")
	private String securityQuestion4;

	@Column(name = "SECURITY_QUESTION_5")
	private String securityQuestion5;

	@Column(name = "SECURITY_QUESTION_6")
	private String securityQuestion6;

	@Column(name = "SECURITY_ANSWER_1")
	private String securityAnswer1;

	@Column(name = "SECURITY_ANSWER_2")
	private String securityAnswer2;

	@Column(name = "SECURITY_ANSWER_3")
	private String securityAnswer3;

	@Column(name = "SECURITY_ANSWER_4")
	private String securityAnswer4;

	@Column(name = "SECURITY_ANSWER_5")
	private String securityAnswer5;

	@Column(name = "SECURITY_ANSWER_6")
	private String securityAnswer6;

	public AssetSecurityInformation() {

	}

	public AssetSecurityInformation(String securityQuestion1,
			String securityQuestion2, String securityQuestion3,
			String securityQuestion4, String securityQuestion5,
			String securityQuestion6, String securityAnswer1,
			String securityAnswer2, String securityAnswer3,
			String securityAnswer4, String securityAnswer5,
			String securityAnswer6) {
		super();
		this.securityQuestion1 = securityQuestion1;
		this.securityQuestion2 = securityQuestion2;
		this.securityQuestion3 = securityQuestion3;
		this.securityQuestion4 = securityQuestion4;
		this.securityQuestion5 = securityQuestion5;
		this.securityQuestion6 = securityQuestion6;
		this.securityAnswer1 = securityAnswer1;
		this.securityAnswer2 = securityAnswer2;
		this.securityAnswer3 = securityAnswer3;
		this.securityAnswer4 = securityAnswer4;
		this.securityAnswer5 = securityAnswer5;
		this.securityAnswer6 = securityAnswer6;
	}

	public String getSecurityQuestion1() {
		return securityQuestion1;
	}

	public void setSecurityQuestion1(String securityQuestion1) {
		this.securityQuestion1 = securityQuestion1;
	}

	public String getSecurityQuestion2() {
		return securityQuestion2;
	}

	public void setSecurityQuestion2(String securityQuestion2) {
		this.securityQuestion2 = securityQuestion2;
	}

	public String getSecurityQuestion3() {
		return securityQuestion3;
	}

	public void setSecurityQuestion3(String securityQuestion3) {
		this.securityQuestion3 = securityQuestion3;
	}

	public String getSecurityQuestion4() {
		return securityQuestion4;
	}

	public void setSecurityQuestion4(String securityQuestion4) {
		this.securityQuestion4 = securityQuestion4;
	}

	public String getSecurityQuestion5() {
		return securityQuestion5;
	}

	public void setSecurityQuestion5(String securityQuestion5) {
		this.securityQuestion5 = securityQuestion5;
	}

	public String getSecurityQuestion6() {
		return securityQuestion6;
	}

	public void setSecurityQuestion6(String securityQuestion6) {
		this.securityQuestion6 = securityQuestion6;
	}

	public String getSecurityAnswer1() {
		return securityAnswer1;
	}

	public void setSecurityAnswer1(String securityAnswer1) {
		this.securityAnswer1 = securityAnswer1;
	}

	public String getSecurityAnswer2() {
		return securityAnswer2;
	}

	public void setSecurityAnswer2(String securityAnswer2) {
		this.securityAnswer2 = securityAnswer2;
	}

	public String getSecurityAnswer3() {
		return securityAnswer3;
	}

	public void setSecurityAnswer3(String securityAnswer3) {
		this.securityAnswer3 = securityAnswer3;
	}

	public String getSecurityAnswer4() {
		return securityAnswer4;
	}

	public void setSecurityAnswer4(String securityAnswer4) {
		this.securityAnswer4 = securityAnswer4;
	}

	public String getSecurityAnswer5() {
		return securityAnswer5;
	}

	public void setSecurityAnswer5(String securityAnswer5) {
		this.securityAnswer5 = securityAnswer5;
	}

	public String getSecurityAnswer6() {
		return securityAnswer6;
	}

	public void setSecurityAnswer6(String securityAnswer6) {
		this.securityAnswer6 = securityAnswer6;
	}

}
