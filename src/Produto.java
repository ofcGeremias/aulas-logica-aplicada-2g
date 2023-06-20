public class Produto {

    int codigo;
    private String nome;
    double valor;

    public void setNome(String valor){
        this.nome = valor;


        }

    Produto(){}
        Produto(int _codigo){
        this.codigo = _codigo;
        }
        Produto(int _codigo, String _nome){
            this.codigo = _codigo;
            this.nome = _nome;
        }

        public Produto(String nomeProduto) {
            this.nome = nomeProduto;
            }


}
