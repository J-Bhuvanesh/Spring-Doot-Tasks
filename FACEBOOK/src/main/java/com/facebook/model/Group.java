package com.facebook.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Index;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;



import lombok.AccessLevel;
import lombok.experimental.FieldDefaults;
@Entity
@Table(name="fb_groups",
indexes=@Index(name=("idx_fb_groups_group_id"),
columnList="group_id"))
@FieldDefaults(level=AccessLevel.PRIVATE)
public class Group extends BaseEntity{
	
	
	@Id
	@GeneratedValue
	@Column(name="group_id")
	Long groupId;
	
	@Column(name="group_name")
	@NotNull
	@Size(min=5,max=50,message="the group name must have 5 to 25 letters")
	
	String groupName;
	
	@Column(name="discription")
	@NotNull
	@Size(min=5,max=100,message="the group description must have minimum 5 letters")
	String discription;
	@ManyToMany(fetch = FetchType.LAZY, cascade=CascadeType.ALL)
	@JoinTable(name="fb_groups_fb_group_members",
				joinColumns= {@JoinColumn(name="fb_groups_id")},
				inverseJoinColumns= {@JoinColumn(name="fb_group_members_id")}
			)
	List<Member> member;

	public Long getGroupId() {
		return groupId;
	}



	public void setGroupId(Long groupId) {
		this.groupId = groupId;
	}



	public String getGroupName() {
		return groupName;
	}



	public void setGroupName(String groupName) {
		this.groupName = groupName;
	}



	public String getDiscription() {
		return discription;
	}



	public void setDiscription(String discription) {
		this.discription = discription;
	}



	public List<Member> getMember() {
		return member;
	}



	public void setMember(List<Member> member) {
		this.member = member;
	}
    
	

}
