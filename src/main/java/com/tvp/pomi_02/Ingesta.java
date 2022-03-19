package com.tvp.pomi_02;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import javax.crypto.interfaces.PBEKey;

//import com.tvpublica.controllers.Process;

public class Ingesta  {
	private String ing;
	private InputStream out;
	
	public InputStream getOut() {
		return out;
	}

	public void setOut(InputStream out) {
		this.out = out;
	}

	public Ingesta(String ing) {
		super();
		this.ing = ing;
	}

//	public Ingesta(String[] ing) {
//		// TODO Auto-generated constructor stub
//	}

	public String getIng() {
		return ing;
	}
//modifica
	public void setIng(String ing) {
		this.ing = ing;
	}

	
	public void correr() {
		try {
		
			String [] cmd = {"ffmpeg", "-hide_banner", "-loglevel", "warning", "-i", "http://rt-esp.rttv.com/live/rtesp/playlist.m3u8", "-f", "flv", ing};
			
			ProcessBuilder pb = new ProcessBuilder().command(cmd).redirectErrorStream(true);
			Process p = pb.start();
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}
//ME CUELGA
			
//			InputStream stdOut = p.getInputStream();
//			
//			out = stdOut;
//			
			
			
			
			
			//System.out.println(inputStream);
			//BufferedInputStream buffer = new BufferedInputStream(inputStream);
//			InputStreamReader in = new InputStreamReader(stdOut);
//			Stream<String> sos = new BufferedReader(in).lines();
//			String soso = sos.collect(Collectors.joining());
//			System.out.println(soso);
//			
			
			
//			new Thread(new Runnable(){
//			    public void run(){
//			        byte[] buffer = new byte[8192];
//			        int len = -1;
//			        while((len = stdOut.read(buffer)) > 0){
//			            System.out.write(buffer, 0, len);
//			        }
//			    }
//			}).start();
			
			
			
			
			
			
			
			
			
			
	
		
		public void correrPlaca() {
			try {
				
	        	
				String [] cmdPlaca = {"ffmpeg", "-hide_banner", "-loglevel", "warning", "-stream_loop", "-1", "-i", "C:\\glaciar.mov", "-f", "flv", ing};
				
				ProcessBuilder pb = new ProcessBuilder().command(cmdPlaca).redirectErrorStream(true);
				Process p = pb.start();
				
				
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

	}

}

// ffmpeg "-i", "http://rt-esp.rttv.com/live/rtesp/playlist.m3u8", "-f", "flv",  "2>", "C:\\convertidos\\log.log"