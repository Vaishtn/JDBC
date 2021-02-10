package com.xworkz.matrimony.dto;

public class DTO {
private	int id;
private	String name;
private	int age;
private	double weight;
private	double height;
private	String qualification;
private	String salary;
private	String address;
private	String phoneNo;

public DTO() {
	// TODO Auto-generated constructor stub
}

@Override
public String toString() {
	return "DTO [id=" + id + ", name=" + name + ", age=" + age + ", weight=" + weight + ", height=" + height
			+ ", qualification=" + qualification + ", salary=" + salary + ", address=" + address + ", phoneNo="
			+ phoneNo + "]";
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
public double getWeight() {
	return weight;
}
public void setWeight(double weight) {
	this.weight = weight;
}
public double getHeight() {
	return height;
}
public void setHeight(double height) {
	this.height = height;
}
public String getQualification() {
	return qualification;
}
public void setQualification(String qualification) {
	this.qualification = qualification;
}
public String getSalary() {
	return salary;
}
public void setSalary(String salary) {
	this.salary = salary;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}
public String getPhoneNo() {
	return phoneNo;
}
public void setPhoneNo(String phoneNo) {
	this.phoneNo = phoneNo;
}
	
	

}
