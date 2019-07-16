package com.capgemini.contactbook.service;

import java.util.Scanner;
import com.capgemini.contactbook.bean.EnquiryBean;
import com.capgemini.contactbook.dao.ContactBookDaoImpl;

public class ContackBookServiceImpl implements ContactBookService{
	ContactBookDaoImpl cd=new ContactBookDaoImpl();
	Scanner sc=new Scanner(System.in);
	
	
public void getEnquiryDetails(EnquiryBean bean)
	{
		cd.getEnquiryDetails(bean);
	}

	public long showEnquiryDetails(long enqryId) {
		return cd.showEnquiryDetails(enqryId);
		
		
	}
	public long numbercheck(long number)
	{
		while(true)
		{
			if(String.valueOf(number).length()>10|| String.valueOf(number).length()<10)
			{
				System.out.println("Enter valid mobile number");
				number=sc.nextLong();
			}
			else
			{
				return number;
			}
		}
	}
	public String fNamecheck(String fName)
	{
		while(true)
		{
			if(fName.matches("[A-Z][a-zA-Z]*"))
			{
				return fName;
			}
			else {
				System.out.println("Name should start with upper case Alphabet");
				System.out.println("Please Enter Again : ");
				return fName=sc.next();
			}
		}
	}
	public String lNamecheck(String lName)
	{
		while(true)
		{
			if(lName.matches("[A-Z][a-zA-Z]*"))
			{
				return lName;
			}
			else {
				System.out.println("Name should have only Alphabets");
				System.out.println("Please Enter Again");
				lName=sc.next();
			}
		}
	}
	public String Domaincheck(String pDomain)
	{
		while(true)
		{
			if(pDomain.matches("[A-Z][a-zA-Z]*"))
			{
				return pDomain;
			}
			else {
				System.out.println("Name should have only Alphabets");
				System.out.println("Please Enter Again");
				pDomain=sc.next();
			}
		}
	}
	public String Locationcheck(String pLocation)
	{
		while(true)
		{
			if(pLocation.matches("[A-Z][a-zA-Z]*"))
			{
				return pLocation;
			}
			else {
				System.out.println("Name should have only Alphabets");
				System.out.println("Please Enter Again");
				pLocation=sc.next();
			}
		}
	}
	
}



