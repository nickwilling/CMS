package com.qdu.dao;

import java.util.List;

import com.qdu.pojo.Clazz;

public interface ClazzDao {
	 
	public void insertClazz(Clazz clazz); 
	
	public Clazz selectClazzByAll(String clazzName,String teacherMobile,int currentYear);
	
	public void updateClazzOfCourseId(int clazzId,int courseId);
	
	public List<Clazz> selectClazzByCourse(int courseId);
	
	public List<Clazz> clazzListByClazzId(int courseId);
	
	public void updateClazzByCourseId(int clazzId);
	
	public void updateClazzByClazzId(int clazzId,String clazzName);
	
	public Clazz selectClazzById(int clazzId);
	
	public void deleteClazzById(int clazzId);
}
