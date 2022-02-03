package heranca_1;

//Classes
import entidades.Produto;
import entidades.ProdutoImportado;
import entidades.ProdutoUsado;

//Bibliotecas
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Heranca_1 {

    
    public static void main(String[] args) throws ParseException {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Produto p = new Produto();
        
        List<Produto> produtos = new ArrayList<>();
        
        System.out.print("N: ");
        int num = sc.nextInt();
       
        for(int i = 1; i <= num; i++){
            System.out.print("\nComum, usado ou importado? (c/u/i) ");
            char opc = sc.next().charAt(0);
            
            System.out.print("\nNome produto: ");
            String nome = sc.next();
            System.out.print("Preço: ");
            double preco = sc.nextDouble();
            
            if(opc == 'u'){
                System.out.print("Data de fabricação: ");
                Date data = sdf.parse(sc.next());
                
                Produto p1 = new ProdutoUsado(data, nome, preco);
                produtos.add(p1);
            }
            
            else if(opc == 'i'){
                System.out.print("Taxa de importação: ");
                double taxaAlfandegaria = sc.nextDouble();
                
                Produto p2 = new ProdutoImportado(taxaAlfandegaria, nome, preco);
                produtos.add(p2);
            }
            
            else{
                Produto p3 = new Produto(nome, preco);
                produtos.add(p3);
            }
        }
        
        System.out.println("\n");
        for(Produto prod: produtos){
            System.out.println(prod.precoTag());
        }
        
        
    }
    
}
