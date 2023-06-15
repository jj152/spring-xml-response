package com.example.demo;

//Importing required classes
import lombok.Data;

//Annotation
@Data
public class EntityModel {

	// Class data members
	String ID;
	String NAME;
	String DOB;
	String PINCODE;
	public void setID(String iD) {
		ID = iD;
	}
	public void setNAME(String nAME) {
		NAME = nAME;
	}
	public void setDOB(String dOB) {
		DOB = dOB;
	}
	public void setPINCODE(String pINCODE) {
		PINCODE = pINCODE;
	}
	public String getID() {
		return ID;
	}
	public String getNAME() {
		return NAME;
	}
	public String getDOB() {
		return DOB;
	}
	public String getPINCODE() {
		return PINCODE;
	}
}