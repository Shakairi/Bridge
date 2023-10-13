package Bridge;

public class PlataformaAndroid implements PlataformaDeMensagem {
    @Override
    public void enviarMensagem(String mensagem) {
        System.out.println("Mensagem enviada via Android: " + mensagem);
    }
}