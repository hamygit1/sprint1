package com.capgemini.DAO;

class SupplierRepository{
	int supplierId;
	int phone_no;
	String name;
	String address;
	
	SupplierRepository(int supplierId, int phone_no, String name,String address)
	{
		this.supplierId = supplierId;
		this.phone_no = phone_no;
		this.name = name;
		this.address = address;
	}

	public int getSupplierId() {
		return supplierId;
	}

	public void setSupplierId(int supplierId) {
		this.supplierId = supplierId;
	}

	public int getPhone_no() {
		return phone_no;
	}

	public void setPhone_no(int phone_no) {
		this.phone_no = phone_no;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "SupplierRepository [supplierId=" + supplierId + ", phone_no=" + phone_no + ", name=" + name
				+ ", address=" + address + "]";
	}
		
	
	
	
	}