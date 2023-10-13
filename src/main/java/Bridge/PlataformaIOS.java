package Bridge;

public class PlataformaIOS implements PlataformaDeMensagem {
    @Override
    public void enviarMensagem(String mensagem) {
        System.out.println("Mensagem enviada via iOS: " + mensagem);
    }
}