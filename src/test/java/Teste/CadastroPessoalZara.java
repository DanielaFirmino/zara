package Teste;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CadastroPessoalZara {

	WebDriver driver;

	@Given("que esteja no site {string}")
	public void que_esteja_no_site(String site) {
		try {
			System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
			driver = new ChromeDriver();
			driver.get(site);
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		} catch (Exception e) {
			System.err.println("--- erro ao abrir navegador --- " + e.getMessage());
		}
	}

	@Given("clicar no menu iniciar sessao")
	public void clicar_no_menu_iniciar_sessao() {
		driver.findElement(By.xpath("//*[@id=\"theme-app\"]/div/div/header/div/div[2]/div/a[1]/span")).click();
	}
	@Given("clicar no menu criar conta")
	public void clicar_no_menu_criar_conta() {
		driver.findElement(By.xpath("//*[@id=\"main\"]/article/div/div/div[2]/div[2]/section/div[2]/button/div/span")).click();
	}
	@When("preencher os dados solicitados")
	public void preencher_os_dados_solicitados() {
		driver.findElement(By.name("email")).sendKeys("teste@testar.hotmail.com");
		driver.findElement(By.name("password")).sendKeys("123Abc123Abc");
		driver.findElement(By.name("passwordConfirm")).sendKeys("123Abc123Abc");
		driver.findElement(By.name("nif")).sendKeys("187.076.920-13");
		driver.findElement(By.name("firstName")).sendKeys("Manuela");
		driver.findElement(By.name("lastName")).sendKeys("Maria");
		driver.findElement(By.name("zipCode")).sendKeys("16310-970");
		driver.findElement(By.name("addressLines[0]")).sendKeys("Rua Ascencio Dias Guebara 52");
		driver.findElement(By.name("stateCode")).sendKeys("SP");
		driver.findElement(By.name("cityCode")).sendKeys("Alto Alegre");
		driver.findElement(By.name("municipality")).sendKeys("Centro");
		driver.findElement(By.name("phones[0].subscriberNumber")).sendKeys("(11)95458-5458");
		driver.findElement(By.name("newsletterCheck")).click();
		driver.findElement(By.name("privacyCheck")).click();
		driver.findElement(By.xpath("//*[@id=\"address-form\"]/div[2]/button/div/span")).click();
	}
	@Then("o cadastro sera realizado com sucesso")
	public void o_cadastro_sera_realizado_com_sucesso() {
		System.out.println("Cadastro realizado com sucesso. ");
		driver.quit();
	}
	@When("preencher os dados e forem invalidos")
	public void preencher_os_dados_e_forem_invalidos() {
		driver.findElement(By.xpath("//*[@id=\"theme-app\"]/div/div/header/div/div[2]/div/a[1]/span")).click();
		driver.findElement(By.xpath("//*[@id=\"main\"]/article/div/div/div[2]/div[2]/section/div[2]/button/div/span")).click();
		driver.findElement(By.name("email")).sendKeys("xxxxxxxxxxxx");
		driver.findElement(By.name("password")).sendKeys("bbbbbbbbbb");
		driver.findElement(By.name("passwordConfirm")).sendKeys("bbbbbbbbbb");
		driver.findElement(By.name("nif")).sendKeys("11111111111");
		driver.findElement(By.name("firstName")).sendKeys("123456789");
		driver.findElement(By.name("lastName")).sendKeys("123456789");
		driver.findElement(By.name("zipCode")).sendKeys("1254785412");
		driver.findElement(By.name("addressLines[0]")).sendKeys("oooooooooooooooooooooooo");
		driver.findElement(By.name("stateCode")).sendKeys("12");
		driver.findElement(By.name("cityCode")).sendKeys("dddddddddd");
		driver.findElement(By.name("municipality")).sendKeys("fffffffffffff");
		driver.findElement(By.name("phones[0].subscriberNumber")).sendKeys("kjkjkjkjkjkjkj");
		driver.findElement(By.name("newsletterCheck")).click();
		driver.findElement(By.name("privacyCheck")).click();
		driver.findElement(By.xpath("//*[@id=\"address-form\"]/div[2]/button/div/span")).click();
	}
	@Then("o cadastro nao sera realizado")
	public void o_cadastro_nao_sera_realizado() {
		System.out.println("Cadastro não realizado, favor preencher com dados válidos. ");
	}
	@When("clicar no botao criar conta")
	public void clicar_no_botao_criar_conta() {
		driver.findElement(By.xpath("//*[@id=\"main\"]/article/div/div/div[2]/div[2]/section/div[2]/button/div/span")).click();
		driver.quit();
	}
	@Then("serei direcionado para a tela de cadastro")
	public void serei_direcionado_para_a_tela_de_cadastro() {
	}
	@When("o usuario ja possuir cadastro")
	public void o_usuario_ja_possuir_cadastro() {
		driver.findElement(By.xpath("//*[@id=\"theme-app\"]/div/div/header/div/div[2]/div/a[1]/span")).click();
		driver.findElement(By.xpath("//*[@id=\"main\"]/article/div/div/div[2]/div[2]/section/div[2]/button/div/span")).click();
		driver.findElement(By.name("email")).sendKeys("teste@testar.hotmail.com");
		driver.findElement(By.name("password")).sendKeys("123Abc123Abc");
		driver.findElement(By.name("passwordConfirm")).sendKeys("123Abc123Abc");
		driver.findElement(By.name("nif")).sendKeys("187.076.920-13");
		driver.findElement(By.name("firstName")).sendKeys("Manuela");
		driver.findElement(By.name("lastName")).sendKeys("Maria");
		driver.findElement(By.name("zipCode")).sendKeys("16310-970");
		driver.findElement(By.name("addressLines[0]")).sendKeys("Rua Ascencio Dias Guebara 52");
		driver.findElement(By.name("stateCode")).sendKeys("SP");
		driver.findElement(By.name("cityCode")).sendKeys("Alto Alegre");
		driver.findElement(By.name("municipality")).sendKeys("Centro");
		driver.findElement(By.name("phones[0].subscriberNumber")).sendKeys("(11)95458-5458");
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		driver.findElement(By.name("newsletterCheck")).click();
		driver.findElement(By.name("privacyCheck")).click();
		driver.findElement(By.xpath("//*[@id=\"address-form\"]/div[2]/button/div/span")).click();
		driver.quit();
	}

	@Then("nao sera possivel realizar cadastro4")
	public void nao_sera_possivel_realizar_cadastro4() {	
	}
	@When("nao preencher e os dados ficarem em branco")
	public void nao_preencher_e_os_dados_ficarem_em_branco() {
		driver.findElement(By.xpath("//*[@id=\"theme-app\"]/div/div/header/div/div[2]/div/a[1]/span")).click();
		driver.findElement(By.xpath("//*[@id=\"main\"]/article/div/div/div[2]/div[2]/section/div[2]/button/div/span")).click();
		driver.findElement(By.name("email")).sendKeys("");
		driver.findElement(By.name("password")).sendKeys("");
		driver.findElement(By.name("passwordConfirm")).sendKeys("");
		driver.findElement(By.name("nif")).sendKeys("");
		driver.findElement(By.name("firstName")).sendKeys("");
		driver.findElement(By.name("lastName")).sendKeys("");
		driver.findElement(By.name("zipCode")).sendKeys("");
		driver.findElement(By.name("addressLines[0]")).sendKeys("");
		driver.findElement(By.name("stateCode")).sendKeys("");
		driver.findElement(By.name("cityCode")).sendKeys("");
		driver.findElement(By.name("municipality")).sendKeys("");
		driver.findElement(By.name("phones[0].subscriberNumber")).sendKeys("");
		driver.findElement(By.name("newsletterCheck")).click();
		driver.findElement(By.name("privacyCheck")).click();
		driver.findElement(By.xpath("//*[@id=\"address-form\"]/div[2]/button/div/span")).click();
	}
	@Then("devo visualizar mensagens de campo obrigatorio")
	public void devo_visualizar_mensagens_de_campo_obrigatorio() {
		System.out.println("Preencher campos obrigatórios. ");
	}
	@Then("nao realizar cadastro")
	public void nao_realizar_cadastro() {
		driver.quit();
	}
	@When("clicar no botao criar conta com os dados preenchidos")
	public void clicar_no_botao_criar_conta_com_os_dados_preenchidos() {
		driver.findElement(By.xpath("//*[@id=\"theme-app\"]/div/div/header/div/div[2]/div/a[1]/span")).click();
		driver.findElement(By.xpath("//*[@id=\"main\"]/article/div/div/div[2]/div[2]/section/div[2]/button/div/span")).click();
		driver.findElement(By.name("email")).sendKeys("teste@testar.hotmail.com");
		driver.findElement(By.name("password")).sendKeys("123Abc123Abc");
		driver.findElement(By.name("passwordConfirm")).sendKeys("123Abc123Abc");
		driver.findElement(By.name("nif")).sendKeys("187.076.920-13");
		driver.findElement(By.name("firstName")).sendKeys("Manuela");
		driver.findElement(By.name("lastName")).sendKeys("Maria");
		driver.findElement(By.name("zipCode")).sendKeys("16310-970");
		driver.findElement(By.name("addressLines[0]")).sendKeys("Rua Ascencio Dias Guebara 52");
		driver.findElement(By.name("stateCode")).sendKeys("SP");
		driver.findElement(By.name("cityCode")).sendKeys("Alto Alegre");
		driver.findElement(By.name("municipality")).sendKeys("Centro");
		driver.findElement(By.name("phones[0].subscriberNumber")).sendKeys("(11)95458-5458");
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		driver.findElement(By.name("newsletterCheck")).click();
		driver.findElement(By.xpath("//*[@id=\"address-form\"]/div[2]/button/div/span")).click();
	}
	@When("nao selecionar a opcao Li e entendi a politica de privacidade e cookies")
	public void nao_selecionar_a_opcao_li_e_entendi_a_politica_de_privacidade_e_cookies() {
	}
	@Then("serei informado que devo aceitar a politica de privacidade")
	public void serei_informado_que_devo_aceitar_a_politica_de_privacidade() {
		driver.findElement(By.xpath("//*[@id=\"theme-modal-container\"]/div/div/div/div/div[3]/div[2]/button/div/span")).click();
		driver.quit();
	}
}
