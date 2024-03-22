public class Main {

    public static void main(String[] args) {
        Suprimentos suprimentos = new Suprimentos();
        suprimentos.setNumero(1);
        suprimentos.setDescricao("Computador de Mesa");
        suprimentos.setPreco(2500);
        suprimentos.setQuantidade(2);


        System.out.println("Informações do item: " + suprimentos.toString());
        System.out.println("Fatura do item " + suprimentos.getDescricao() + " = "
                + suprimentos.getInvoiceAmount(suprimentos.getQuantidade(), suprimentos.getPreco()));
    }
}
