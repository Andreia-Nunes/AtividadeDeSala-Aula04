import java.util.Locale;

public class TesteContaCorrente {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        ContaCorrente conta = new ContaCorrente();

        conta.setNumero(12345);
        System.out.printf("Número da conta: %d\n", conta.getNumero());
        System.out.printf("Saldo da conta: %.2f\n", conta.getSaldo());
        conta.depositar(1000.00);
        System.out.printf("Saldo da conta: %.2f\n", conta.getSaldo());
        conta.sacar(200.00);
        System.out.printf("Saldo da conta: %.2f\n", conta.getSaldo());
    }
}
