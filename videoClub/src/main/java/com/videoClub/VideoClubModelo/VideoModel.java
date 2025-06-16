package com.videoClub.VideoClubModelo;

public class VideoModel {
	
	private int id;
	private int cliID;
	private String titulo;
	private String director;
	
	public VideoModel(int id, String titulo, String director, int cliID) {
		this.id = id;
		this.titulo = titulo;
		this.director = director;
		this.cliID = cliID;
	}
	public VideoModel(String titulo, String director, int cliID) {
		this.titulo = titulo;
		this.director = director;
		this.cliID = cliID;
	}
	  public int getId() { 
		  return id; 
		  }
	    public String getTitulo() { 
	    	return titulo; 
	    }
	    public String getDirector() { 
	    	return director; 
	    }
	    public int getCliId() { 
	    	return cliID;
	    	}
}
