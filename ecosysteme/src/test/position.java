package test;

import javax.swing.JLabel;

import individus.Animal;

public class position {
	
	public int[][] grid = new int[ContenuFenetreBis.NB_LIGNES][ContenuFenetreBis.NB_COLONNES];
	
	
				
			
	
	
	public position(int[][] grid) {
		
		super();
		this.proprietesPosition();
		this.grid = grid;
		
		
	}

	private void proprietesPosition() {
	
		for(int i = 0; i<ContenuFenetreBis.NB_LIGNES;i++){
			for(int j = 0; j<ContenuFenetreBis.NB_COLONNES;j++){
		
				 grid[i][j]= 0;
			
				
			}}
					
					
		
		
		
		
	}
	
}
	
			
