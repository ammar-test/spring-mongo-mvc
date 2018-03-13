package com.project.smongo.mvc.service;

import org.springframework.stereotype.Service;

import com.project.smongo.mvc.entity.HomeEntity;
import com.project.smongo.mvc.entity.JavaEntity;

@Service
public class HomeService {

	public HomeEntity create() {

		HomeEntity entity = new HomeEntity();

		entity.setOsName(getConfigValue("os.name"));
		entity.setOsVersion(getConfigValue("os.version"));
		entity.setUserName(getConfigValue("user.name"));

		entity.setJavaObject(getJavaobject());
		return entity;

	}

	private JavaEntity getJavaobject() {

		JavaEntity javaEntity = new JavaEntity();
		javaEntity.setJavaHome(getConfigValue("java.home"));
		javaEntity.setJavaVersion(getConfigValue("java.version"));
		javaEntity.setJavaVendor("java.vendor");

		return javaEntity;
	}

	public String getConfigValue(String key) {
		return System.getProperty(key).toString();
	}

}
