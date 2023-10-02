class Metodos{
	int numero;

	public void verificar_impar(){
		if(numero %2 != 0){
			System.out.println(numero + " é impar\n");
		}else{
			System.out.println(numero + " é par\n");
		}
	}
	public void apenas_impar(){
		if(numero %2 != 0){
			System.out.println(numero + " é impar");
		}
	}
}