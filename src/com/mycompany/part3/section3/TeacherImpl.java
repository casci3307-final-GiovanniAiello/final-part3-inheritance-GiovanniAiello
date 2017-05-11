/**
 * 
 */
package com.mycompany.part3.section3;

/**
 * @author Gio
 *
 */
public class TeacherImpl extends PersonBaseImpl implements Teacher {
	String thoughtCourseTitle;
	String name;
	public TeacherImpl(String _name, String _thoughtCourseTitle) {
		super(_name);
		name = _name;
		thoughtCourseTitle = _thoughtCourseTitle; 
	}
	
	public String teachesFor() {
		// TODO Auto-generated method stub
		return thoughtCourseTitle; 
	}

	@Override
	public String getDetails() {
		// TODO Auto-generated method stub
		return "teacher"; 
	}
}
