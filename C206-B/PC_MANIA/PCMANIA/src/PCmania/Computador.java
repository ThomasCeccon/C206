package PCmania;

public class Computador {
    //atributos
    String marca;
    float preco;

    //associacao por agregacao de memoria usb
    MemoriaUSB memoriaUSB;

    //associacao por composicao cliente
    Cliente[] clientes = new Cliente[100];//inicial do array com 100 posicoes

    //associacao por composicao sistema operacional
    SistemaOperacional SistemaOperacional;

    //associacao por composicao Hardwarebasico
    HardwareBasico []hardwareBasico=new HardwareBasico[100];

    //metodo construtor


    public Computador(String marca, float preco, MemoriaUSB memoriaUSB, Cliente[] clientes, PCmania.SistemaOperacional sistemaOperacional, HardwareBasico hardwareBasico) {
        this.marca = marca;
        this.preco = preco;
        this.memoriaUSB = memoriaUSB;
        this.clientes = clientes;
        this.SistemaOperacional =new SistemaOperacional(sistemaOperacional.nome,sistemaOperacional.tipo);
        this.hardwareBasico = new HardwareBasico(hardwareBasico.nome,hardwareBasico.capacidade);
    }

    //metodos
    void mostraPCCconfig() {

    }

    void addMemoriaUSB(MemoriaUSB memoriaUSB) {

    }
}
