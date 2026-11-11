package automacaoWebJunit;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class loginAdvantegeShopping {

// oooi, essa é minha branch-kallyne

    @Test
    void deveFazerLogin() throws InterruptedException {

        // Abrir o navegador
        // monstra aonde esta o chrome Driver
        System.setProperty("webdriver.chrome.driver" , "driver/chromedriver");
        WebDriver navegador = new ChromeDriver();

        // comando para abrir o site
        navegador.get("https://www.advantageonlineshopping.com/#/");

        // maximazer a tela
        navegador.manage().window().maximize();

        // comando de clicar
        navegador.findElement(By.id("menuUser")).click();


        String userName = "testeQaVerso";
        String senha = "Fc230978@";
        // comando de preencher
        navegador.findElement(By.name("username")).sendKeys(userName);
        navegador.findElement(By.name("password")).sendKeys(senha);
        Thread.sleep(2000);
        navegador.findElement(By.id("sign_in_btn")).click();

        Thread.sleep(3000);

        // Validar Texto
        String usuarioLogin = "testeQaVerso";
        String usuarioLogado = navegador.findElement(By.id("menuUserLink")).getText();
        assertEquals(usuarioLogin ,usuarioLogado);

        String products = "OUR PRODUCTS";
        String productsTela = navegador.findElement(By.xpath("/html/body/header/nav/ul/li[8]/a")).getText();
        assertEquals(products ,productsTela);


        // fechar navegador
        navegador.quit();











    }




}
