package iphone.model;

import iphone.interfaces.NavegadorDeInternet;
import iphone.interfaces.TelefoneCelular;
import iphone.interfaces.TocadorDeMusica;

public class Iphone implements NavegadorDeInternet, TelefoneCelular, TocadorDeMusica {

  public Iphone() {

  }

  @Override
  public void tocarMusica() {
    System.out.println("tocar musica");
  }

  @Override
  public void pausarMusica() {
    System.out.println("pausar musica");

  }

  @Override
  public void selecionarMusica() {
    System.out.println("selecionar musica");

  }

  @Override
  public void ligar() {
    System.out.println("ligar para algum contato");

  }

  @Override
  public void atender() {
    System.out.println("atender");

  }

  @Override
  public void iniciarCorrerioVoz() {
    System.out.println("Iniciar novo correio de voz ");

  }

  @Override
  public void exibirPagina() {
    System.out.println("Exibir Pagina ");

  }

  @Override
  public void adicionarNovaAba() {
    System.out.println("adicionar nova aba ");

  }

  @Override
  public void atualizarPagina() {
    System.out.println("atualizar pagina");

  }

}
