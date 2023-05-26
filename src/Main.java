public class Main {

    public static void main(String[] args) {

        Pessoa adao = new Pessoa();
        Pessoa qualquer;
        qualquer = new Pessoa();
        Pessoa adulta = new Pessoa();
        qualquer.nome = "rita";
        qualquer.sobrenome = "lee";
        qualquer.falar();
        adao.falar();
        Pessoa rainha;
        rainha = new Pessoa();
        rainha.nome="tina";
        rainha.sobrenome="tunner";
        rainha.falar();
        rainha.falar(volume"alto");
        System.out.println(rainha.falar(volume"alto", tom "grave"));

    }
}