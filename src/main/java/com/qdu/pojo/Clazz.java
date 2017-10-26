package com.qdu.pojo;

import java.io.Serializable;
import java.util.List;

public class Clazz implements Serializable{
	
	private int clazzId;
	private String clazzName;
	private int currentYear;
	private Teacher teacher;
	private Course course;
	private List<Student> student;
	public int getClazzId() {
		return clazzId;
	}
	public void setClazzId(int clazzId) {
		this.clazzId = clazzId;
	}
	public String getClazzName() {
		return clazzName;
	}
	public void setClazzName(String clazzName) {
		this.clazzName = clazzName;
	}
	public int getCurrentYear() {
		return currentYear;
	}
	public void setCurrentYear(int currentYear) {
		this.currentYear = currentYear;
	}
	public Teacher getTeacher() {
		return teacher;
	}
	public void setTeacher(Teacher teacher) {
		this.teacher = teacher;
	}
	public Course getCourse() {
		return course; 
	}
	public void setCourse(Course course) {
		this.course = course;
	}
	public List<Student> getStudents() {
		return student;
	}
	public void setStudents(List<Student> students) {
		this.student = students;
	}
	@Override
	public String toString() {
		return "Clazz [clazzId=" + clazzId + ", clazzName=" + clazzName + ", currentYear=" + currentYear + ", teacher="
				+ teacher + ", course=" + course + ", student=" + student + "]";
	}


}
