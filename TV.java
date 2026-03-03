class TV{
  int tamanho_de_tela;
  int volume = 5;
  int voltagem;
  int canal;
  String modelo;

  void ligar() {
    //lógica para a TV ligar
}

  void desligar() {
    //lógica para a TV desligar
  }

  int aumentar_volume() {
    if (volume < 10){
      volume++;
    }
    return volume;
  }

  int diminuir_volume() {
    if (volume > 10){
      volume--;
    }
    return volume;
  }

  void subir_de_canal() {
    // lógica para a TV subir de canal
  }

  void descer_de_canal() {
    // lógica para a TV descer de canal
  }
  
}
