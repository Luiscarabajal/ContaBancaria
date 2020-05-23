/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contabancaria;

import aplicacao.Conta;
import java.util.Locale;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Dell
 */
public class ContaBancaria {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        try {
            Conta conta1 = new Conta();
            System.out.print("Digite o Nome: ");
            String nome = sc.nextLine();
            conta1.setNome(nome);

            System.out.print("Digite o numero da conta: ");
            int conta = sc.nextInt();
            conta1.setNumeroConta(conta);

            System.out.println("Deseja fazer deposito DIGITE 1 para [SIM] e 0 para [NÃO]");
            int codigo = sc.nextInt();
            sc.nextLine();//para consumir a quebra de linha
            if (codigo == 1) {

                System.out.println("Digite um valor para deposito");
                double inicialDeposito = sc.nextDouble();
                conta1.deposito(inicialDeposito);

            }
            System.out.println("Deseja fazer Saque DIGITE 2 para [SIM] e 0 para [NÃO]");
            int codigo2 = sc.nextInt();
            if (codigo2 == 2) {

                System.out.println("Digite um valor para SAQUE");
                double saqueInicial = sc.nextDouble();
                conta1.saque(saqueInicial);
            }

            System.out.println(conta1);

            System.out.println("=====================================================");
            System.out.println("Lembrando que no saque é retirando 5 reais como taxa");
            sc.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Algo deu errado");

        }
    }

}
