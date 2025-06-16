package com.videoClub.Main;

import com.videoClub.VentanaPrincipal.videoClubViews;
import com.videoClub.VideoClubController.videoClubControlador;

public class App {
	public static void main(String[] args) {
		videoClubViews vista = new videoClubViews();
		new videoClubControlador(vista);
	}
}
