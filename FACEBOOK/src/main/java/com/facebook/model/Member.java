package com.facebook.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Index;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AccessLevel;
import lombok.experimental.FieldDefaults;

@Entity
@Table(name="fb_group_members",
uniqueConstraints=@UniqueConstraint(name="uk_fb_group_members_member_email",
columnNames = { "member_email" }),
indexes=@Index(name=("idx_fb_group_members_member_id"),
columnList="member_id"))
@FieldDefaults(level=AccessLevel.PRIVATE)
public class Member extends BaseEntity{
	
	
	@Id
	@GeneratedValue
	@Column(name="member_id")
	long memberId;
	@Column(name="member_name")
	@NotNull
	@Size(min=5,max=15,message="the member name must have 5 to 15 letters")
	String memberName;
	@Column(name="member_email")
	@Email
	@NotNull
	String memberEmail;
	@ManyToMany(mappedBy="member")
	@JsonIgnore
	List<Group> group;
	public List<Group> getGroup() {
		return group;
	}

	public void setGroup(List<Group> group) {
		this.group = group;
	}

	public long getMemberId() {
		return memberId;
	}

	public void setMemberId(long memberId) {
		this.memberId = memberId;
	}

	public String getMemberName() {
		return memberName;
	}

	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}

	public String getMemberEmail() {
		return memberEmail;
	}

	public void setMemberEmail(String memberEmail) {
		this.memberEmail = memberEmail;
	}
	
	
	
	
	
	
	
	

}
