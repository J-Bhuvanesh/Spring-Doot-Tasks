package com.facebook.model;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Index;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.AccessLevel;
import lombok.experimental.FieldDefaults;

@Entity
@Table(name="accounts",
indexes=@Index(name=("idx_accounts_account_id_account_name"),
columnList="account_id,account_name"))
@FieldDefaults(level=AccessLevel.PRIVATE)

public class Account extends BaseEntity{
	
	@Id
	@GeneratedValue
	@Column(name="account_id")
	int accountId;
	@Column(name="account_name")
	@NotNull
	@Size(min=3,max=15,message="enter valid name for account")
	String accountName;
	@Column(name="information")
	@NotNull
	@Size(min=10,message="the information must have ten words")
	String information;
	
    @OneToOne(targetEntity=User.class,cascade=CascadeType.ALL)
    @JoinColumn(name="user_id",referencedColumnName="id")
    User user;
    
	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public int getAccountId() {
		return accountId;
	}

	public void setAccountId(int accountId) {
		this.accountId = accountId;
	}

	public String getAccountName() {
		return accountName;
	}

	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}

	public String getInformation() {
		return information;
	}

	public void setInformation(String information) {
		this.information = information;
	}


	public Account() {}
	public Account(String accountName, String information) {
		super();
		this.accountName = accountName;
		this.information = information;
	}
	
	
	
	
	

}
