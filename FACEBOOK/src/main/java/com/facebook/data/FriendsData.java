package com.facebook.data;

import java.util.List;

import com.facebook.common.PaginationMeta;
import com.facebook.model.User;

public class FriendsData {
		private List<User> user;
	    private PaginationMeta pagination;
		public List<User> getUser() {
			return user;
		}
		public void setUser(List<User> user) {
			this.user = user;
		}
		public PaginationMeta getPagination() {
			return pagination;
		}
		public void setPagination(PaginationMeta pagination) {
			this.pagination = pagination;
		}
	    
}
