package userinfo.dao;

import userinfo.UserInfo;

public interface IUserInfoDao {
	
	public void insertUserInfo(UserInfo userInfo);
	
	public void deleteUserInfo(UserInfo userInfo);
	
	public void updateUserInfo(UserInfo userInfo);
}
