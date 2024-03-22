public class Main {

    public static void main(String[] args) {
        /*Suprimentos suprimentos = new Suprimentos();
        suprimentos.setNumero(1);
        suprimentos.setDescricao("Computador de Mesa");
        suprimentos.setPreco(-1);
        suprimentos.setQuantidade(2);


        System.out.println("Informações do item: " + suprimentos.toString());
        System.out.println("Fatura do item " + suprimentos.getDescricao() + " = "
                + suprimentos.getInvoiceAmount(suprimentos.getQuantidade(), suprimentos.getPreco()));*/

        Colaborador colaborador = new Colaborador();
        Colaborador colaborador1 = new Colaborador();

        colaborador1.setNome("Maria");
        colaborador1.setSobrenome("Aparecida");
        colaborador1.setSalario(1500);

        colaborador.setNome("Stephanie");
        colaborador.setSobrenome("Rocha");
        colaborador.setSalario(4500);

        System.out.println("Salario anual do Colaborador" +colaborador1.getNome() +" antes do aumento: "
                + colaborador1.getSalario());
        System.out.println("Salario anual do Colaborador" +colaborador.getNome() +" antes do aumento: "
                + colaborador.getSalario());

        colaborador1.setSalario(colaborador1.aumento(colaborador1.getSalario(), 10));
        colaborador.setSalario(colaborador.aumento(colaborador.getSalario(), 10));

        System.out.println("Salario anual do Colaborador " +colaborador1.getNome() +" após do aumento: "
                + colaborador1.getSalario());
        System.out.println("Salario anual do Colaborador " +colaborador.getNome() +" após do aumento: "
                + colaborador.getSalario());

    }
}
