class ExibirImparAutomatico{
	public static void main(String[]args){
		Metodos m = new Metodos();
		int contador = 1;
		while(contador != 20){
			m.numero = contador;
			m.apenas_impar();
			contador ++;
		}

	}
}