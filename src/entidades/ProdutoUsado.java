package entidades;

import java.text.SimpleDateFormat;
import java.util.Date;

public class ProdutoUsado extends Produto{
    
    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
    
    private Date dataFabricacao;
    
    public ProdutoUsado() {
        super();
    }

    public ProdutoUsado(Date dataFabricacao, String nome, Double preco) {
        super(nome, preco);
        this.dataFabricacao = dataFabricacao;
    }

    public Date getDataFabricacao() {
        return dataFabricacao;
    }

    public void setDataFabricacao(Date dataFabricacao) {
        this.dataFabricacao = dataFabricacao;
    }
    
    @Override
    public final String precoTag(){
        
        StringBuilder sb = new StringBuilder();
        
        sb.append(getNome());
        sb.append(" - "+String.format("R$ %.2f", getPreco()));
        sb.append(" - (Fabricado em: "+sdf.format(dataFabricacao)+")");
        
        return sb.toString();
    }
}
