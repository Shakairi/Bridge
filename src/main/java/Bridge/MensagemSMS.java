package Bridge;

public class MensagemSMS extends Mensagem {
    public MensagemSMS(PlataformaDeMensagem plataforma) {
        super(plataforma);
    }

    @Override
    public void enviar(String mensagem) {
        plataforma.enviarMensagem("SMS: " + mensagem);
    }
}