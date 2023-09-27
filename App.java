package iphone;

import iphone.model.Iphone;

public class App {
  public static void main(String[] args) {
    Iphone iphone = new Iphone();
    // Music functions
    iphone.tocarMusica();
    iphone.pausarMusica();
    iphone.selecionarMusica();
    // Phone functions
    iphone.atender();
    iphone.ligar();
    iphone.iniciarCorrerioVoz();
    // Navegator functions
    iphone.atualizarPagina();
    iphone.exibirPagina();
    iphone.adicionarNovaAba();
  }
}
