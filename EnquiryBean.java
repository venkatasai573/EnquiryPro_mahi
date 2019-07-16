
package com.capgemini.contactbook.bean;

public class EnquiryBean {
private long enqryId;
private String fName;
private String lName;
private long contactNo;
private String pLocation;
private String pDomain;
public EnquiryBean(long enqryId, String fName, String lName, long contactNo, String pLocation, String pDomain) {
	super();
	this.enqryId = enqryId;
	this.fName = fName;
	this.lName = lName;
	this.contactNo = contactNo;
	this.pLocation = pLocation;
	this.pDomain = pDomain;
}
public long getEnqryId() {
	return enqryId;
}
public void setEnqryId(long enqryId) {
	this.enqryId = enqryId;
}
public String getfName() {
	return fName;
}
public void setfName(String fName) {
	this.fName = fName;
}
public String getlName() {
	return lName;
}
public void setlName(String lName) {
	this.lName = lName;
}
public long getContactNo() {
	return contactNo;
}
public void setContactNo(long contactNo) {
	this.contactNo = contactNo;
}
public String getpLocation() {
	return pLocation;
}
public void setpLocation(String pLocation) {
	this.pLocation = pLocation;
}
public String getpDomain() {
	return pDomain;
}
public void setpDomain(String pDomain) {
	this.pDomain = pDomain;
}
@Override
	public String toString() {
		// TODO Auto-generated method stub
		return " "+enqryId+" "+fName+" "+lName+" "+contactNo+" "+pLocation+" "+pDomain;
	}

}

