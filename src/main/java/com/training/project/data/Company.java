package com.training.project.data;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Transient;

import org.hibernate.envers.Audited;
/**
 * Primary key companyId
 * @author jsutaria
 *
 */
@Entity
@Audited
public class Company extends Base{
	
	String companyLocation;
	
	String singlePointOfContactEmail;
	
	String singlePointOfContactPhone;
	
	String logoBigUrl;
	
	String logoSmallUrl;
	
	@Enumerated(EnumType.STRING)
	CompanyType companyType = CompanyType.SMALL_SCALE;
	
	@Transient
	String cType;
	
	Boolean active;

	public String getCompanyLocation() {
		return companyLocation;
	}

	public void setCompanyLocation(String companyLocation) {
		this.companyLocation = companyLocation;
	}

	public String getSinglePointOfContactEmail() {
		return singlePointOfContactEmail;
	}

	public void setSinglePointOfContactEmail(String singlePointOfContactEmail) {
		this.singlePointOfContactEmail = singlePointOfContactEmail;
	}

	public String getSinglePointOfContactPhone() {
		return singlePointOfContactPhone;
	}

	public void setSinglePointOfContactPhone(String singlePointOfContactPhone) {
		this.singlePointOfContactPhone = singlePointOfContactPhone;
	}

	public String getLogoBigUrl() {
		return logoBigUrl;
	}

	public void setLogoBigUrl(String logoBigUrl) {
		this.logoBigUrl = logoBigUrl;
	}

	public String getLogoSmallUrl() {
		return logoSmallUrl;
	}

	public void setLogoSmallUrl(String logoSmallUrl) {
		this.logoSmallUrl = logoSmallUrl;
	}

	public CompanyType getCompanyType() {
		return companyType;
	}

	public void setCompanyType(CompanyType companyType) {
		this.companyType = companyType;
	}

	public String getcType() {
		if(getCompanyType() != null){
			String name = getCompanyType().name();
			return name;
		}
		return cType;
	}

	public void setcType(String cType) {
		if(cType != null){
			setCompanyType(CompanyType.valueOf(cType));
		}
		this.cType = cType;
	}

	public Boolean getActive() {
		return active;
	}

	public void setActive(Boolean active) {
		this.active = active;
	}
	
	

}
