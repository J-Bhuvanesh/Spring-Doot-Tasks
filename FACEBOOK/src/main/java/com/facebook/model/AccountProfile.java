package com.facebook.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Index;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.AccessLevel;
import lombok.experimental.FieldDefaults;
@Entity
@Table(name="account_profiles",
indexes=@Index(name=("idx_account_profiles_profile_id"),
columnList="profile_id"))
@FieldDefaults(level=AccessLevel.PRIVATE)
public class AccountProfile extends BaseEntity{
	
	
	@Id
	@GeneratedValue
	@Column(name="profile_id")
	int profileId;
	@Column(name="profile_name")
	@NotNull
	@Size(min=5,max=15,message="profile name must be have minim 5 letters")
	String profileName;
	
	@OneToMany(targetEntity=Photo.class,cascade=CascadeType.ALL)
	@JoinColumn(name="profile_id_fk",referencedColumnName="profile_id")
	
	List<Photo> photo;

	public int getProfileId() {
		return profileId;
	}

	public void setProfileId(int profileId) {
		this.profileId = profileId;
	}

	public String getProfileName() {
		return profileName;
	}

	public void setProfileName(String profileName) {
		this.profileName = profileName;
	}

	public List<Photo> getPhoto() {
		return photo;
	}

	public void setPhoto(List<Photo> photo) {
		this.photo = photo;
	}
	
	

}
