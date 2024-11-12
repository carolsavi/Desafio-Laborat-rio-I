public class Produto {
    
    //atributos
    private String nome;
    private double preco;
    private Data dataValidade;

    //construtor

    public Produto(String nome, double preco, Data dataValidade){
        this.nome = nome;
        this.preco = preco;
        this.dataValidade = dataValidade;
    }

    //metodos de acesso

    public String getNome(){
        return nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public double getPreco(){
        return preco;
    }
    public void setPreco(double preco){
        this.preco = preco;
    }
    public Data getDataValidade(){
        return dataValidade;
    }
    public void setDataValidade(Data dataValidade){
        this.dataValidade = dataValidade;
    }
    //metodos

    public boolean estaVencido(Data dataAtual){
        if (dataAtual.getAno() > dataValidade.getAno()) {
            return true;
        }else if (dataAtual.getAno() == dataValidade.getAno()){
            if (dataAtual.getMes() > dataValidade.getMes()){
                return true;}
            else if (dataAtual.getMes() == dataValidade.getMes())
                if (dataAtual.getDia() >= dataValidade.getDia()){
                    return true;
                }}
            else {
                return false;
            }
            return false;  }



    public String toString(){
        return "Produto: " + nome + "\nPreço: " + preco;
    }


}
