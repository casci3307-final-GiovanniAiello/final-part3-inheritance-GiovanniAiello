/**
 * 
 */
package com.mycompany.part3.section3;

/**
 * @author Gio
 *
 */
public abstract class PersonBaseImpl implements Person{
	protected String  name;
	public PersonBaseImpl(String _name) {
		name = _name;
	}
	public String getName() {
		return name;
	}
	
}
