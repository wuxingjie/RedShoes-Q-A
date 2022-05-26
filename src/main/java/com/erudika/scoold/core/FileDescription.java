package com.erudika.scoold.core;

import com.erudika.para.core.Sysprop;
import com.erudika.para.core.annotations.Stored;

public class FileDescription extends Sysprop {

	@Stored
	private String path;
	@Stored
	private String fileName;

	public String getPath() {
		return path;
	}

	public String getFileName() {
		return fileName;
	}

	public FileDescription(
		String path,
		String fileName
	) {
		super();
		setType("FileDescription");
		this.path = path;
		this.fileName = fileName;
	}

}
