package Atividade01;

public class Projeto {
	public static void main(String[] args) {
		int[] vetor = new int [20];
		int[] aux = new int[vetor.length];
		
		for(int i = 0; i < vetor.length; i++) {
			vetor[i] = (int) (Math.random() * 100);  
			System.out.println(vetor[i]);
		}
		
		System.out.println("");
		for(int i = 0; i < vetor.length; i++) {
			int cont = 0;
			for(int j = 0; j < vetor.length; j++) {
				if(vetor[i] < vetor[j]) {
					cont = vetor[j];
					vetor[j] = vetor[i]; 
					vetor[i] = cont;
				}
			}
		}
		for(int i = 0; i < vetor.length; i++) { 
			System.out.println(vetor[i]);
		}
		
	}

}
