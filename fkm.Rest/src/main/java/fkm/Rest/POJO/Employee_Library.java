package fkm.Rest.POJO;

public class Employee_Library {
String createdBy;
String projectName;
String status;
int size;
public Employee_Library(String createdBy,String projectName,String status,int size) {
	this.createdBy=createdBy;
	this.projectName=projectName;
	this.status=status;
	this.size=size;
	

}
public Employee_Library() {
	
}
public String getCreatedBy() {
	return createdBy;
}
public void setCreatedBy(String createdBy) {
	this.createdBy = createdBy;
}
public String getProjectName() {
	return projectName;
}
public void setProjectName(String projectName) {
	this.projectName = projectName;
}
public String getStatus() {
	return status;
}
public void setStatus(String status) {
	this.status = status;
}
public int getSize() {
	return size;
}
public void setSize(int size) {
	this.size = size;
}
}
