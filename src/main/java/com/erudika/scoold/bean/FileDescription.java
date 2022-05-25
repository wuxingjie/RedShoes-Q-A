package com.erudika.scoold.bean;

import com.erudika.para.core.Sysprop;
import com.erudika.para.core.annotations.Stored;

public class FileDescription extends Sysprop {
	public static String TYPE = "FileDescription";

	@Stored
	private String path;
	@Stored
	private String fileName;

	public FileDescription(
		String path,
		String fileName,
		String type
	){
		super();
		setType(type);
		this.path = path;
		this.fileName = fileName;
	}

}
