package modulos.produtos;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.time.Duration;

@DisplayName("Testes Web do Modulo de Produto")
public class ProdutosTest {

    @Test
    @DisplayName("Nao e permitido registrar uum produto com valor igual a zero")
    public void testNaoEPermitidoRegistrarProdutoComValorIgualAZero() {
        System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chromedriver108\\chromedriver.exe");
        WebDriver navegador = new ChromeDriver();

        navegador.manage().window().maximize();
        navegador.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

        navegador.get("http://165.227.93.41/lojinha-web/v2/");
        navegador.findElement(By.cssSelector("label[for='usuario']")).click();
        navegador.findElement(By.id("usuario")).sendKeys("admin");
        navegador.findElement(By.cssSelector("label[for='senha']")).click();
        navegador.findElement(By.id("senha")).sendKeys("admin");
        navegador.findElement(By.name("action")).click();

        navegador.findElement(By.linkText("ADICIONAR PRODUTO")).click();
        navegador.findElement(By.id("produtonome")).sendKeys("Produto Teste");
        navegador.findElement(By.id("produtovalor")).sendKeys("000");
        navegador.findElement(By.id("produtocores")).sendKeys("Preto, Azul");
        navegador.findElement(By.cssSelector("button[type='submit']")).click();

        String mensagemToast = navegador.findElement(By.cssSelector(".toast.rounded")).getText();
        Assertions.assertEquals("O valor do produto deve estar entre R$ 0,01 e R$ 7.000,00", mensagemToast);
        navegador.quit();
    }
}
