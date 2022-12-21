package modulos.produtos;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

@DisplayName("Testes Web do Modulo de Produto")
public class ProdutosTest {

    @Test
    @DisplayName("Nao e permitido registrar uum produto com valor igual a zero")
    public void testNaoEPermitidoRegistrarProdutoComValorIgualAZero() {
        //Abrir navegador
        System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chromedriver108\\chromedriver.exe");
        WebDriver navegador = new ChromeDriver();

        //Maximizar a tela
        navegador.manage().window().maximize();

        //Navegar para a pagina da lojinha web
        navegador.get("http://165.227.93.41/lojinha-web/v2/");

        //Fazer login


        //Vou para a tela de registro de produto


        //Vou preencher dados do produto e o valor sera igual a zero


        //Submeter o formulario


        //Vou validar que a mensagem de erro foi apresentada


    }
}
