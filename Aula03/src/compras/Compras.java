package compras;

import java.util.Scanner;

public class Compras {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        // Switch Case
		// Maquina de Cartao
		
		//Metodo de Pagamento
		//     1- Dinheiro/Pix - 10% de desconto
		//     2 - Debito - 5% de desconto 
	    //     3 - Credito - Valor total
		
		//        - Metodos de Parcelamento
		//                 1 - A vista = Valor Total
		//                   2- 2x - 5% de juros 
		//                    3 - 3x - 10% de juros
		
		// Valor da compra 
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Informe o Valor da sua compra R$: ");
		double valorCompra = sc.nextDouble();
		
		System.out.println("Metodos Pagamento");
		System.out.println();
		System.out.println("1 - Dinheiro/Pix");
		System.out.println("2 - Debito");
		System.out.println("3 - Credito");
		int metodoPagamento = sc.nextInt();
		
		switch (metodoPagamento) {
		
		case 1: 
			double valorFinal = valorCompra * 0.9;
			System.out.println("Sua compra ficou R$" + valorFinal);
			break; 
		case 2:
			valorFinal = valorCompra * 0.95;
			System.out.println("Sua compra ficou R$" + valorFinal);
			break;
		case 3:
			System.out.println("Metodo Parcelamento");
			System.out.println("1 - A vista");
			System.out.println("2 - 2x, 5% de juros");
			System.out.println("3 - 3x, 10% de juros");
			int metodoParcelamento = sc.nextInt();
			break;
		default: 
			System.out.println("Opção Inválida");
			break;
			
			
		}
		
		sc.close();
	}

}
