public class AnalisadorDePreco {
    public boolean cabeNoOrcamento(Produto prod, Orcamento orc) {

        if (orc == null || prod == null || prod.getPreco() == null || orc.getMin() == null || orc.getMax() == null) {
            return false;
        }

        Double preco = prod.getPreco();

        return (preco.compareTo(orc.getMin()) >= 0 && preco.compareTo(orc.getMax()) <= 0);
    }
}
