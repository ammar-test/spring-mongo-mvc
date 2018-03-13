package com.project.smongo.mvc.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Document(collection="homeentity")
public class HomeEntity {

	@Id
	private String id;
	
	
	private String osName;
	
	private String osVersion;
	
	private JavaEntity javaObject;
	
	private String userName;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getOsName() {
		return osName;
	}

	public void setOsName(String osName) {
		this.osName = osName;
	}

	public String getOsVersion() {
		return osVersion;
	}

	public void setOsVersion(String osVersion) {
		this.osVersion = osVersion;
	}

	public JavaEntity getJavaObject() {
		return javaObject;
	}

	public void setJavaObject(JavaEntity javaObject) {
		this.javaObject = javaObject;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	@Override
	public String toString() {
		return "HomeEntity [id=" + id + ", osName=" + osName + ", osVersion=" + osVersion + ", javaObject=" + javaObject
				+ ", userName=" + userName + "]";
	}

 
	
}
