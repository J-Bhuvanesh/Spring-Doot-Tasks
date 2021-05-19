package com.facebook.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Index;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.AccessLevel;
import lombok.experimental.FieldDefaults;

@Entity
@Table(name="photos",
indexes=@Index(name=("idx_photos_photo_id"),
columnList="photo_id"))
@FieldDefaults(level=AccessLevel.PRIVATE)
public class Photo extends BaseEntity{
	
	@Id
	@GeneratedValue
	@Column(name="photo_id")
	int photoId;
	@NotNull
	@Size(min=5,max=10,message="the photo name must have 5 to 10 letters")
	String photoName;

	public int getPhotoId() {
		return photoId;
	}

	public void setPhotoId(int photoId) {
		this.photoId = photoId;
	}

	public String getPhotoName() {
		return photoName;
	}

	public void setPhotoName(String photoName) {
		this.photoName = photoName;
	}
	
	
	

}
