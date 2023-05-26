
public class Pessoa {

    String nome;
    String sobrenome;

    public void falar() {

        System.out.println("falai");
    }

    public void falar(String volume) {

        System.out.println("falai" + volume);
    }
        public String falar (String volume, String tom){
            return "falei" + volume;

    }
}