package Bridge;

public abstract class Mensagem {
    protected PlataformaDeMensagem plataforma;

    public Mensagem(PlataformaDeMensagem plataforma) {
        this.plataforma = plataforma;
    }

    public abstract void enviar(String mensagem);
}