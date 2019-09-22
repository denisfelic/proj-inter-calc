package projetointerdisciplinar;

import java.util.Scanner;

public class ProjetoInterDisciplinar {

    Scanner scan = new Scanner(System.in);
    public int opc = 0;
    Cone cone = new Cone();

    public static void main(String[] args) {
        // TODO code application logic here
        ProjetoInterDisciplinar projeto = new ProjetoInterDisciplinar();
    }

    public ProjetoInterDisciplinar() {
        menuPrincipal();

    }

    public void menuPrincipal() {
        opc = 0;
        while (opc == 0) {
            System.out.println("\n\n\n\n");
            System.out.println("======BEM VINDO AO PROGRAMA DE CALCULOS EM JAVA=========== ");
            System.out.println("OPÇÕES: ");
            System.out.println("1- Novo Objeto: ");
            System.out.println("2- Carregar um Objeto salvo: ");
            System.out.println("3- Sobre o programa e o desenvolvedor: ");
            System.out.println("4- SAIR: ");
            System.out.print("Escolha um dos numeros das opções e digite ENTER: ");
            opc = scan.nextInt();
            System.out.println("\n\n\n\n\n");

            switch (opc) {
                case 1:
                    menuObjetos();
                    break;
                case 2:
                    menuCarregarObjeto();
                    break;
                case 3:
                    aboutMe();
                    break;
                case 4:
                    exit();
                    break;
                default:
                    opc = 0;
                    System.out.println("Erro Opção Invalida");
                    break;

            }
        }

    }

    private void menuObjetos() {
        opc = 0;
        while (opc == 0) {
            System.out.println("\n\n\n\n\n\n");
            System.out.println("OBJETOS GEOMETRICOS DISPONIVEIS PARA CALCULAR: ");
            System.out.println("1- MATRIZES X e Y (PONTO)");
            System.out.println("2- CONE");
            System.out.println("3- TRIANGULO ");
            System.out.println("4- PARALELEPIPEDO");
            System.out.println("5- QUADRADO");
            System.out.println("6- CILINDRO");
            System.out.println("7- EQUAÇÃO DE 2º GRAU");
            System.out.println("0 - Para retornar ao menu anterior.");
            System.out.print("Digite alguma das opções e pressione ENTER: ");
            opc = scan.nextInt();

            switch (opc) {
                case 1:
                    menuMatriz();
                    break;
                case 2:
                    menuCone();
                    break;
                case 3:
                    menuTriangulo();
                    break;
                case 4:
                    menuParalelepipedo();
                    break;
                case 5:
                    menuQuadrado();
                    break;
                case 6:
                    menuCilindro();
                    break;
                case 7:
                    menuEquacao();
                    break;
                case 0:
                    menuPrincipal();
                    break;
                default:
                    opc = 0;
                    System.out.println("Erro Opção Invalida\n\n");
                    break;

            }
        }

    }

    private void menuMatriz() {
        System.out.println("Metodo Matriz X Y ainda em construção");
        exit();

    }

    private void menuCone() {
        opc = 0;
        while (opc == 0) {
            System.out.println("\n\n\n\n");
            System.out.println("======MENU CONE========");
            System.out.println(">>>>>>>OPÇÕES<<<<<<<<<<<<<");
            System.out.println("1- Calcular novo Objeto Cone");
            System.out.println("2- Carregar Objeto");
            System.out.println("3- Retornar ao Menu anterior.");
            System.out.println("4- Sair do programa.");
            System.out.print("Digite algumas das opções e pressione ENTER: ");
            opc = scan.nextInt();
            switch (opc) {
                case 1:
                    menuCalcCone();
                    break;
                case 2:
                    System.out.println("Função não criada ainda.");
                    break;
                case 3:
                    menuObjetos();
                    break;
                case 4:
                    exit();
                    break;
                default:
                    System.out.println("\n\n\n\nOpção invalida, digite novamente.");
                    opc = 0;
                    break;
            }

        }

    }

    private void menuTriangulo() {
        System.out.println("Metodo Triangulo ainda em construção");
    }

    private void menuParalelepipedo() {
        System.out.println("Metodo Paralelepipedo ainda em construção");
    }

    private void menuQuadrado() {
        System.out.println("Metodo Quadrado ainda em construção");
    }

    private void menuCilindro() {
        System.out.println("Metodo Cilindro ainda em construção");
    }

    private void menuEquacao() {
        System.out.println("Metodo equação ainda em construção.");
    }

    private void menuCarregarObjeto() {
        System.out.println("EM CONSTRUÇÃO");
    }

    private void menuCalcCone() {
        opc = 0;

        while (opc == 0) {
            System.out.println("==========================");
            System.out.println("Opções de Calculo para Cone");
            System.out.println(">>>>Selecione uma das opções<<<<");
            System.out.print("1-Calcular Volume do Cone\n2- Calcular Area do Cone\n3-Menu anterior\n escolha uma das opções e pressione ENTER: ");
            opc = scan.nextInt();
        }
        if (opc == 1) {
            coneCalcVolume();
        } else if (opc == 2) {
            System.out.println("Calc area em construção");
            exit();
        } else if (opc == 3) {
            menuCone();
        } else {
            opc = 0;
            System.out.println("Opção invalida, digite novamente.");
        }
    }

    private void aboutMe() {
        System.out.println("\n\n\n\n\n");
        System.out.println("Desenvolvido por Denis Feliciano da Silva, aluno do primeiro semestre do\n "
                + "curso de Analise e Desenvolvimento de Sistemas da faculdade Cruzeiro do Sul, Campos São Miguel Pta(Presencial) 2019\n"
                + "O Programa tem o seu principal foco em resolver calculos de formas geometricas e equações matematicas\n"
                + "Tudo isso faz parte do projeto interdisciplinar dos professores Manuel Ledon (POO)  e Juliano Schimguel (TDA).");
        System.out.print("Digite qualquer coisa e pressione ENTER  para retornar: ");
        opc = scan.nextByte();

        menuPrincipal();

    }

    private void exit() {
        opc = 0312313;
        System.out.println("fim da execução.");

    }

    private void coneCalcVolume() {
        double raioCone, alturaCone;
        opc = 0;
        while (opc == 0) {
            System.out.print("\n\nDigite o Raio do Cone: ");
            raioCone = scan.nextDouble();
            System.out.print("Digite a altura do Cone: ");
            alturaCone = scan.nextDouble();
            if (alturaCone < 0 || raioCone < 0) {
                System.out.println("[ERRO] Digite um valor maior que zero");
                opc = 0;
            } else {
                double volume;
                cone.setAltura(alturaCone);
                cone.setRaio(raioCone);
                volume = cone.calcularVolumeCone(cone.getRaio(), cone.getAltura());
                System.out.println("Volume do Cone: " + cone.getVolume());
                System.out.print("Escolha uma das opções: \n1- Retornar sem Salvar\n2- Salvar Volume e retornar \n3- Sair do programa\n Dogote: ");
                opc = scan.nextInt();
                switch (opc) {
                    case 1:
                        menuCalcCone();
                        break;
                    case 2:
                        cone.setVolume(volume);
                        System.out.println("\n\n\n\nVolume Salvo com sucesso.");
                        menuCalcCone();
                        break;
                    case 3:
                        exit();
                        break;
                    default:
                        System.out.println("Erro Opção Invalida");
                        opc = 0;
                        break;
                }

            }
        }
    }

}
