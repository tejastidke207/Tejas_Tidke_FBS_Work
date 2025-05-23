package com.Nextgen.Backend;

public class Authenticate 
{
	Connectivity connector = new DatabaseConnectivity();
	
	public boolean checkLogin(String username, String password) 
	{
        return connector.isValid(username, password);
    }
}
