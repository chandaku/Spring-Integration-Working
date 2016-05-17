package com.chandan.spring.integration.service;

import java.io.File;

import org.springframework.integration.annotation.ServiceActivator;
import org.springframework.stereotype.Service;

@Service
public class FileInServiceActivator {

	@ServiceActivator(inputChannel = "fileIn")
	public void run(File file) {
		String fileName = file.getAbsolutePath();
		System.out.println("File to be processed" + fileName);
	}
}
