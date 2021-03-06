package com.niit.EComBack.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Cart {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)

	int itemid;
	 @Column(nullable = false)
	int Cartid;
	 @Column(nullable = false)
	int pid;
	 @Column(nullable = false)
	String pname;
	 @Column(nullable = false)
	int quantity;
	 @Column(nullable = false)
	int price;
	 @Column(nullable = false)
	int subTot;
	public int getItemid() {
		return itemid;
	}
	public void setItemid(int itemid) {
		this.itemid = itemid;
	}
	public int getCartid() {
		return Cartid;
	}
	public void setCartid(int cartid) {
		Cartid = cartid;
	}
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getSubTot() {
		return subTot;
	}
	public void setSubTot(int subTot) {
		this.subTot = subTot;
	}
		}
