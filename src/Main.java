public class Main {

    public static void main(String[] args) {
        Suprimentos suprimentos = new Suprimentos(1, "Computador de Mesa", 1500,2);

        System.out.println("Informações do item: " + suprimentos.toString());
        System.out.println("Fatura sobre o item " + suprimentos.getDescricao() + " = "+ suprimentos.getInvoiceAmount());

        Colaborador c = new Colaborador("Maria", "Aparecida", 10);
        Colaborador c1 = new Colaborador("Stephanie", "Rocha", 20);

        System.out.println("Salario anual do Colaborador " +c1.getNome() +" antes do aumento: "
                + c1.salarioAnual());
        System.out.println("Salario anual do Colaborador " +c.getNome() +" antes do aumento: "
                + c.salarioAnual());

        c1.setSalario(c1.aumento(10));
        c.setSalario(c.aumento(10));

        System.out.println("Salario anual do Colaborador " +c1.getNome() +" após do aumento: "
                + c1.salarioAnual());
        System.out.println("Salario anual do Colaborador " +c.getNome() +" após do aumento: "
                + c.salarioAnual());
    }
}
