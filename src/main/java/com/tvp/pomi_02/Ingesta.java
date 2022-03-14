package com.tvp.pomi_02;

import java.io.IOException;

//import com.tvpublica.controllers.Process;

public class Ingesta implements Runnable {
	private String[] ing;
	
	public Ingesta(String[] ing) {
		super();
		this.ing = ing;
	}

//	public Ingesta(String[] ing) {
//		// TODO Auto-generated constructor stub
//	}

	public String[] getIng() {
		return ing;
	}
//modifica
	public void setIng(String[] ing) {
		this.ing = ing;
	}

	@Override
	public void run() {
		try {
			Process process = Runtime.getRuntime().exec(ing);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
