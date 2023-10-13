package Bridge;

public class MensagemEmail extends Mensagem {
    public MensagemEmail(PlataformaDeMensagem plataforma) {
        super(plataforma);
    }

    @Override
    public void enviar(String mensagem) {
        plataforma.enviarMensagem("Email: " + mensagem);
    }
}