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

        //elementos
        By clicarUsarioInicial = By.id("menuUser");
        By campoUsuario =  By.name("username");
        By campoSenha =   By.name("password");
        By btnLogar = By.id("sign_in_btn");
        By usuarioLogin = By.id("menuUserLink");
        By textoTituloHeader = By.xpath("/html/body/header/nav/ul/li[8]/a");

        // variaveis globais

        String url = "https://www.advantageonlineshopping.com/#/";

        //usuario
        String userName = "testeQaVerso";
        String senha = "Fc230978@";
        String textoTitulo = "OUR PRODUCTS";
        String usuarioPerfil = "testeQaVerso";





        // Abrir o navegador
        // monstra aonde esta o chrome Driver
        System.setProperty("webdriver.chrome.driver" , "driver/chromedriver");
        WebDriver navegador = new ChromeDriver();

        // comando para abrir o site
        navegador.get(url);

        // maximazer a tela
        navegador.manage().window().maximize();

        // comando de clicar
        navegador.findElement(clicarUsarioInicial).click();

        // comando de preencher
        navegador.findElement(campoUsuario).sendKeys(userName);
        navegador.findElement(campoSenha).sendKeys(senha);
        Thread.sleep(2000);
        navegador.findElement(btnLogar).click();

        Thread.sleep(3000);

        // Validar Texto
        String usuarioLogado = navegador.findElement(usuarioLogin).getText();
        assertEquals(usuarioPerfil ,usuarioLogado);
        String productsTela = navegador.findElement(textoTituloHeader).getText();
        assertEquals(textoTitulo ,productsTela);


        // fechar navegador
        navegador.quit();











    }




}
