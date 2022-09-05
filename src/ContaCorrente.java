public class ContaCorrente {
    private int numero;
    private double saldo;

    public int getNumero(){
        return this.numero;
    }

    public double getSaldo(){
        return this.saldo;
    }

    public void setNumero(int novoNumero){
        this.numero = novoNumero;
    }

    public void depositar(double valor){
        if (valor > 0){
            this.saldo += valor;
        }
        else{
            System.out.println("O valor precisa ser maior que zero!");
        }
    }

    public void sacar(double valor){
        if (this.saldo >= valor){
            this.saldo -= valor;
        }
        else{
            System.out.println("Saldo insuficiente!");
        }
    }
}
