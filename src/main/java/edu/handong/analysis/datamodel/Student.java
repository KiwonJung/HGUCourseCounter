package edu.handong.analysis.datamodel;

import java.util.ArrayList;
import java.util.HashMap;

public class Student {
	private String studentId;
	private ArrayList<Course> courseTaken;
	private HashMap<String,Integer> semestersByYearAndSemester;
	
	public Student(String studentId) { //constructor
		this.studentId = studentId;
		courseTaken = new ArrayList<Course>();
		semestersByYearAndSemester = new HashMap<String,Integer>();
	}
	
	public void addCourse(Course newRecord) {
		courseTaken.add(newRecord);
	}
	public HashMap<String,Integer> getSemesterByYearAndSemester(){
		HashMap<String,Integer> tmpHashmap = new HashMap<String,Integer>();
		int count = 1;
		for (Course curCourse : courseTaken)
		{
			String curKey = "";
			curKey += curCourse.getYearTaken();
			curKey += "-";
			curKey += curCourse.getSemesterCourseTaken();
			
			if (!tmpHashmap.containsKey(curKey))
			{
				tmpHashmap.put(curKey, count);
				count++;
			}
		}
		
		return tmpHashmap;
	}
	public int getNumCourseInNthSemester(int semester) {
		int count = 1;
		for(Course curCourse : courseTaken) {
			String curKey = "";
			curKey += curCourse.getYearTaken();
			curKey += "-";
			curKey += curCourse.getSemesterCourseTaken();
	
		}
		
		return count;
	}
}
