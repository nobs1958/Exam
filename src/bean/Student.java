package bean;

public class Student implements java.io.Serializable{
private String no;
private String name;
private int entYear;
private String classNum;
private boolean isAttend;
private String school;

public String getNo() {
	return no;
}
public String getName() {
	return name;
}
public int getEntYear() {
	return entYear;
}
public String getClassNum() {
	return classNum;
}
public boolean isAttend() {
	return isAttend;
}
public String getSchool() {
	return school;
}
public int getSchoolYear() {
	return entYear;
}

public void setNo(String no) {
	this.no=no;
}
public void setName(String name) {
	this.name=name;
}
public void setEntYear(int entYear) {
	this.entYear=entYear;
}
public void setClassNum(String classNum) {
	this.classNum=classNum;
}
public void setIsAttend(boolean isAttend) {
	this.isAttend=isAttend;
}
public void setSchool(String school) {
	this.school=school;
}
}
