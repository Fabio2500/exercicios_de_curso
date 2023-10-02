import java.util.Scanner;
class ExibirImpar{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		Metodos m = new Metodos();
		m.numero = 1;

        while(m.numero != -1){
        	System.out.println("digite o número que deseja saber se é impar ou par(digite -1 para parar de verificar)\n:");
        	m.numero = sc.nextInt();
        	m.verificar_impar();

        }        



	}
}