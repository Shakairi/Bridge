package Bridge;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class PlataformaDeMensagemTest {

    @Test
    public void testBridgePattern() {
        PlataformaDeMensagem android = new PlataformaAndroid();
        PlataformaDeMensagem ios = new PlataformaIOS();

        Mensagem mensagemEmailAndroid = new MensagemEmail(android);
        Mensagem mensagemSMSIOS = new MensagemSMS(ios);

        assertEquals("Mensagem enviada via Android: Email: Olá, mundo!", mensagemEmailAndroid.enviar("Olá, mundo"));
        assertEquals("Mensagem enviada via iOS: SMS: Hello, world!", mensagemSMSIOS.enviar("Hello, world!"));
    }
}
