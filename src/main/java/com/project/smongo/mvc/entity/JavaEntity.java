package com.project.smongo.mvc.entity;

import org.springframework.data.annotation.Id;

public class JavaEntity {

	
	@Id
	private String id;
	
	private String javaHome;
	
	private String javaVersion;
	
	private String javaVendor;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getJavaHome() {
		return javaHome;
	}

	public void setJavaHome(String javaHome) {
		this.javaHome = javaHome;
	}

	public String getJavaVersion() {
		return javaVersion;
	}

	public void setJavaVersion(String javaVersion) {
		this.javaVersion = javaVersion;
	}

	public String getJavaVendor() {
		return javaVendor;
	}

	public void setJavaVendor(String javaVendor) {
		this.javaVendor = javaVendor;
	}

	@Override
	public String toString() {
		return "JavaEntity [id=" + id + ", javaHome=" + javaHome + ", javaVersion=" + javaVersion + ", javaVendor="
				+ javaVendor + "]";
	}
	
	
	
	
}
