package com.mastermaind.modelo;

public class Feedback {
	
		private int correctoColors;
		private int correctoPositions;
		
		public Feedback(int correctoColors, int correctoPositions) {
			this.correctoColors = correctoColors;
			this.correctoPositions = correctoPositions;
			
		}
		public int getCorrectoColors() {
			return correctoColors;
		}
		public int getCorrectoPositions() {
			return correctoPositions;
		}
		@Override
		public String toString() {
			return "Colores correctos (Mal ubicados: " + correctoColors +
					"| Colores en posicion correcta: " + correctoPositions;
		}
	}

