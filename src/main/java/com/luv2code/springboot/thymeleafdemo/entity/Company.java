package com.luv2code.springboot.thymeleafdemo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name ="company")
public class Company {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
@Column(name="company_id")
private int cid;

@Column(name="compamy_name")
private String cname;

@Column(name="company_gmail")
private String cgmail;

@Column(name="company_desc")
private String cdesc;

@Column(name="company_type")
private String ctype;

@Column(name="company_address")
private String cadd;

public Company() {
	
}

public Company(String cname, String cgmail, String cdesc, String ctype, String cadd) {
	this.cname = cname;
	this.cgmail = cgmail;
	this.cdesc = cdesc;
	this.ctype = ctype;
	this.cadd = cadd;
}

public int getCid() {
	return cid;
}

public void setCid(int cid) {
	this.cid = cid;
}

public String getCname() {
	return cname;
}

public void setCname(String cname) {
	this.cname = cname;
}

public String getCgmail() {
	return cgmail;
}

public void setCgmail(String cgmail) {
	this.cgmail = cgmail;
}

public String getCdesc() {
	return cdesc;
}

public void setCdesc(String cdesc) {
	this.cdesc = cdesc;
}

public String getCtype() {
	return ctype;
}

public void setCtype(String ctype) {
	this.ctype = ctype;
}

public String getCadd() {
	return cadd;
}

public void setCadd(String cadd) {
	this.cadd = cadd;
}

@Override
public String toString() {
	return "Company [cid=" + cid + ", cname=" + cname + ", cgmail=" + cgmail + ", cdesc=" + cdesc + ", ctype=" + ctype
			+ ", cadd=" + cadd + "]";
}



}
