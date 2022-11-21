package com.neotech.lesson26;

public class Doctor {

	private long licenseID;
	private long phoneNumber;
	private String email;
	
	
	//setter for LicenseId
	//setter returns nothing
	
	public void setLicenseID(long licenseID)
	{
		this.licenseID = licenseID;
	}
	 
	
	//getter for licenseID 
	public long getLicenseID()
	{
		return licenseID;
	}
	
	//Setter for phonenumber
	public void setPhoneNumber(long phoneNumber)
	{
		this.phoneNumber = phoneNumber;
	}
	
	//getter for phone number
	public long getPhoneNumber()
	{
		return phoneNumber;
	}
	
	//getter for email
	public String getEmail()
	{
		return email;
	}
	
	//setter for email
	public void setEmail(String email)
	{
		//email should not be empty
		//email must contain @gmail
		
		if(!email.isEmpty())
		{
			if(email.contains("gmail"))
			{
				this.email = email;
			}
			else
			{
				System.out.println("You have to use gmail!!");
			}
		}
		else
		{
			System.out.println("Email cannot be empty");
		}
	}
	
	
}
