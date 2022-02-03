package entidades;


public class ProdutoImportado extends Produto{
    
    private Double taxaAlfandegaria;
    
    public ProdutoImportado(){
        super();
    }

    public ProdutoImportado(Double taxaAlfandegaria, String nome, Double preco) {
        super(nome, preco);
        this.taxaAlfandegaria = taxaAlfandegaria;
    }

    public Double getTaxaAlfandegaria() {
        return taxaAlfandegaria;
    }

    public void setTaxaAlfandegaria(Double taxaAlfandegaria) {
        this.taxaAlfandegaria = taxaAlfandegaria;
    }
    
    @Override
    public final String precoTag(){
        
        StringBuilder sb = new StringBuilder();
        
        sb.append(getNome());
        sb.append(String.format(" - R$ %.2f", totalPreco()));
        sb.append(" - (Taxa alfandegária: "+String.format("R$ %.2f", taxaAlfandegaria)+")");
        
        return sb.toString();
    }
     
     public double totalPreco(){
         return super.getPreco() + taxaAlfandegaria;
     }
    
}
