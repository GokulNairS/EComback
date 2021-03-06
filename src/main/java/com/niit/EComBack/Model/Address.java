package com.niit.EComBack.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Address {
@Id
@GeneratedValue(strategy = GenerationType.AUTO)
int addressid;

String name;
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
@Column(nullable = false)
int cartid;
@Column(nullable = false)
String addL1;
@Column(nullable = false)
String addL2;
@Column(nullable = false)
String city;
@Column(nullable = false)
String state;
@Column(nullable = false)
String pincode;
public int getCartid() {
	return cartid;
}
public int getAddressid() {
	return addressid;
}
public void setAddressid(int addressid) {
	this.addressid = addressid;
}
public void setCartid(int cartid) {
	this.cartid = cartid;
}
public String getAddL1() {
	return addL1;
}
public void setAddL1(String addL1) {
	this.addL1 = addL1;
}
public String getAddL2() {
	return addL2;
}
public void setAddL2(String addL2) {
	this.addL2 = addL2;
}
public String getCity() {
	return city;
}
public void setCity(String city) {
	this.city = city;
}
public String getState() {
	return state;
}
public void setState(String state) {
	this.state = state;
}
public String getPincode() {
	return pincode;
}
public void setPincode(String pincode) {
	this.pincode = pincode;
}
}
