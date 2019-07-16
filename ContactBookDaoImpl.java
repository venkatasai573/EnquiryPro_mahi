package com.capgemini.contactbook.dao;

import java.util.HashMap;
import com.capgemini.contactbook.bean.EnquiryBean;

public class ContactBookDaoImpl implements ContactbookDao {
	HashMap<Long,EnquiryBean> hx=new HashMap<Long,EnquiryBean>();
	EnquiryBean bean;
	public void addEnquiry(EnquiryBean bean) {
		this.bean=bean;
		hx.put(bean.getEnqryId(),bean);
		
		System.out.println(hx);
		
	}
	public HashMap<Long,EnquiryBean>hx()
	{
		return hx;
	}
	public long showEnquiryDetails(long enqryId) {
		bean=hx.get(enqryId);
		if(bean==null)
		{
			throw new ContactBookException("Invalid enquiry ");
		}
		else
		{
			System.out.println("id:"+bean.getEnqryId());
			System.out.println("fname: "+bean.getfName());
			System.out.println("lname: "+bean.getlName());
			System.out.println("contact: "+bean.getContactNo());
			System.out.println("pre loc: "+bean.getpLocation());
			System.out.println("pre dom: "+bean.getpDomain());
		}
		return enqryId;	
	}
	public void getEnquiryDetails(EnquiryBean bean) {
		
		hx.put(bean.getEnqryId(),bean);
		bean=hx.get(bean.getEnqryId());
	}
	
}
	

	
	