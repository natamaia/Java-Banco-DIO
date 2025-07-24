public class Main {

    public static void main(String[]args){
        Cliente Natanael = new Cliente();
        Natanael.setNome("Natanael");

        Conta cc = new ContaCorrente(Natanael);
        //cc.depositar(100);

        Conta poupanca = new ContaPoupanca(Natanael);

        cc.imprimirExtrato();
        poupanca.imprimirExtrato();
    }
}
