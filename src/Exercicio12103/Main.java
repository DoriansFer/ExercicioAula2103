package Exercicio12103;

public class Main {
    public static void main(String[] args) {
        Suprimento suprimento = new Suprimento("Bolo",30,12.5,30);

        suprimento.getInvoiceAmount(suprimento.quantComprada, suprimento.precoUnitario);
    }
}
