package com.phoenix.demos;

public class FileConnectivity implements Connectivity
{
	public boolean isUserValid(String user, String pass)
	{
		return true;
	}

	@Override
	public boolean isValid(String user, String pass) {
		// TODO Auto-generated method stub
		return isUserValid(user, pass);
	}
}
