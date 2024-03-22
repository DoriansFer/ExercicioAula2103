/*1 - Crie uma classe chamada Suprimentos que possa ser utilizado por uma loja de suprimentos de informática para
representar uma fatura de um item vendido na loja. Uma fatura deve incluir as seguintes informações como atributos:

• o número do item faturado
• a descrição do item
• a quantidade comprada do item e
• o preço unitário do item.

Sua classe deve ter um construtor que inicialize os quatro atributos. Se a quantidade não for positiva, ela deve ser
configurada como 0. Se o preço por item não for positivo ele deve ser configurado como 0.0. Forneça um método set e
um método get para cada variável de instância. Além disso, forneça um método chamado getInvoiceAmount que calcula o
valor da fatura (isso é, multiplica a quantidade pelo preço por item) e depois retorna o valor como um double.
Escreva um aplicativo de teste que demonstra as capacidades da classe Invoice.*/

package Exercicio12103;

public class Suprimento {
    private int numItemFat = 0;
    private String descrItem;
    public int quantComprada = 0;
    public double precoUnitario = 0;
    public double InvoiceAmount = 0;

    public int getNumItemFat() {
        return numItemFat;
    }

    public void setNumItemFat(int numItemFat) {
        this.numItemFat = numItemFat;
    }

    public String getDescrItem() {
        return descrItem;
    }

    public void setDescrItem(String descrItem) {
        this.descrItem = descrItem;
    }

    public Suprimento(String descrItem, int quantComprada, double precoUnitario, int numItemFat) {
        this.descrItem = descrItem;

        this.numItemFat = numItemFat;
// this.quantidade = (quantidade > 0) ? quantidade : 0;
        if (quantComprada < 0) {
            quantComprada = 0;
        } else {
            this.quantComprada = quantComprada;
        }

        if (precoUnitario < 0) {
            precoUnitario = 0;
        } else {
            this.precoUnitario = precoUnitario;
        }

    }

    public double getInvoiceAmount(int quantComprada, double precoUnitario) {
        InvoiceAmount = quantComprada * precoUnitario;
        System.out.println(InvoiceAmount);
        return InvoiceAmount;
    }
}
