/*2 - A fim de representar colaboradores em uma firma, crie uma classe chamada Colaborador que inclui as três
informações a seguir como atributos:

• um primeiro nome,
• um sobrenome
• um salário mensal.

Sua classe deve ter um construtor que inicializa os três atributos. Forneça um método set e get para cada atributo.
Se o salário mensal não for positivo, configure-o como 0.0. Escreva um aplicativo de teste que demonstra as capacidades
da classe. Crie duas instâncias da classe e exiba o salário anual de cada instância. Então dê a cada empregado um
aumento de 10% e exiba novamente o salário anual de cada colaborador.*/

package Exercicio22103;

public class Colaborador {
    private String nome;
    private String sobrenome;
    private double mensal;

    public Colaborador(String nome, String sobrenome, double mensal) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        if (mensal < 0) {
            this.mensal = 0;
        } else {
            this.mensal = mensal;
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public double getMensal() {
        return mensal;
    }

    public void setMensal(double mensal) {
        if (mensal < 0) {
            this.mensal = 0;
        } else {
            this.mensal = mensal;
        }
    }

    public void salario() {
        mensal = mensal + (mensal* 0.01);
    }

    public double SalarioAnula(){
        return mensal * 12;
    }
}
