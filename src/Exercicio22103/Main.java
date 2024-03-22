package Exercicio22103;

public class Main {
    public static void main(String[] args) {
        Colaborador cob1 = new Colaborador("Doria", "Fernandes", 7000);
        Colaborador cob2 = new Colaborador("Keikoo", "Hira", 6000);
        System.out.println("R$ " + cob1.SalarioAnula());
        System.out.println("R$ " + cob2.SalarioAnula());
        cob1.salario();
        cob2.salario();
        System.out.println("R$ " + cob1.getMensal());
        System.out.println("R$ " + cob1.SalarioAnula());
        System.out.println("R$ " + cob2.SalarioAnula());
        cob1.setMensal(20000.0);
        System.out.println("R$ " + cob1.getMensal());
        System.out.println("R$ " + cob1.SalarioAnula());
    }
}
