
public class Application {

	public static void main(String[] args) {
		int vetor[]= {7,20,978,19,18,4,2,6,3,684};
		merge_sort(vetor, 0, vetor.length-1);
		for(int numeros:vetor) {
			System.out.println(numeros);
		}

	}
	public static void merge(int vetor[],int inicio,int meio,int fim) {
		int esquerda,direita,proximo,tamanho;
		int auxiliar[];
		tamanho=(fim-inicio)+1;
		auxiliar = new int[tamanho];
		proximo=0;
		esquerda=inicio;
		direita=meio+1;
		while((esquerda<=meio) &&(direita<=fim)) {
			if(vetor[esquerda]<vetor[direita]) {
				auxiliar[proximo]=vetor[esquerda++];
			}else {
				auxiliar[proximo]=vetor[direita++];
				
			}
			proximo++;
		}if(esquerda>meio) {
			while(direita<=fim) {
				auxiliar[proximo]=vetor[direita++];
				proximo++;
			}
		}else {
			while(esquerda<=meio) {
				auxiliar[proximo]=vetor[esquerda++];
				proximo++;
			}
		}
		for(proximo=0;proximo<tamanho;proximo++) {
			vetor[inicio]=auxiliar[proximo];
			inicio++;
		}
	}
	
	public static void merge_sort(int vetor[],int inicio,int fim) {
		int meio;
		meio=(inicio+fim)/2;
		if(inicio<meio) {
			merge_sort(vetor, inicio, meio);
		}
		if(meio+1<fim) {
			merge_sort(vetor, meio+1, fim);
		}
		merge(vetor, inicio, meio, fim);
		
	}
}
