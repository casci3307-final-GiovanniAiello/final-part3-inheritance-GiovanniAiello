/**
 * 
 */
package com.mycompany.part3.section3;

/**
 * @author Gio
 *
 */
public class StudentImpl extends PersonBaseImpl implements Student{
String takenCourseTitle;
	public StudentImpl(String _name, String _takenCourseTitle) {
		super(_takenCourseTitle);
	}
	
	public String getDetails() {
		return "student";
	}
	@Override
	public String studiesFor() {
		return takenCourseTitle;
	}

}
