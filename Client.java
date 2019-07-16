package com.capgemini.contactbook.ui;

import java.util.Random;
import java.util.Scanner;

import com.capgemini.contactbook.bean.EnquiryBean;
import com.capgemini.contactbook.service.ContackBookServiceImpl;


public class Client {
	
	public static void main(String[] args) {
		 ContackBookServiceImpl el=new ContackBookServiceImpl();
		long enqryId=0;
		 String fName;
		  String lName;
		  long contactNo;
		  String pLocation;
		 String pDomain;
		 
		while(true)
		{
			System.out.println("1.Enter Enquiry Details");
			System.out.println("2.View Enquiry Details on Id");
			System.out.println("3.Exit");
			
			System.out.println("Enter the choice");
			@SuppressWarnings("resource")
			Scanner sc=new Scanner(System.in);
			int d=sc.nextInt();
			switch(d)
			{
			case 1:
				
					System.out.println("Enter first name ");
					fName=el.fNamecheck(sc.next());
					/*fName=el.fNamecheck(sc.next());*/
					System.out.println("Enter last name");
					lName=el.lNamecheck(sc.next());
					System.out.println("Enter contact number");
					contactNo=el.numbercheck(sc.nextLong());
					System.out.println("Enter Preferred Location");
					pLocation=el.Locationcheck(sc.next());
					System.out.println("Enter Preferred Domain");
					pDomain=el.Domaincheck(sc.next());
					Random r=new Random();
					enqryId=r.nextInt(300000);
					System.out.println(enqryId);
					EnquiryBean eb=new EnquiryBean(enqryId,fName,lName,contactNo,pLocation,pDomain);
					System.out.println("id is:" +enqryId);
					el.getEnquiryDetails(eb);
					break;
			case 2:
				System.out.println("Enter enquiry num:");
				enqryId=sc.nextLong();
				el.showEnquiryDetails(enqryId);
				
				break;
			case 3:
				System.out.println("thank you selecting us");
				System.exit(0);
				
					
				}
			}
		}
	}


