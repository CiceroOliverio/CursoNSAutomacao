package main.java;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class TesteComparaPdpXcart {

    public static void main(String[] args) {
        String nomeProduto = "AdidasTeste";
        String nomeProdutoPdp = "NikeTeste";
        int percDesconto = 10;
        boolean promo = true;
        BigDecimal precoTotalCart = new BigDecimal(10);
        BigDecimal precoTotalPdp = new BigDecimal(8);

        List<String> cores = new ArrayList<>();
        cores.add("AZUL");
        cores.add("VERMELHO");
        cores.add("PRETO");

        int[] acessos = new int[3];
        acessos[0] = 123;
        acessos[1] = 456;
        acessos[2] = 789;

        if (precoTotalPdp.equals(precoTotalCart))
            System.out.println("Preços iguais");
        else
            System.out.println("Preços diferentes");


        String plataforma = "Desk";
        switch (plataforma) {
            case "Desk":
                System.out.println("Estou no Desk");
                break;
            case "Mobile":
                System.out.println("Estou no Mobile");
                break;
            default:
                System.out.println("Plataforma não foi encontrada");

        }
                for (int i = 0; i < acessos.length; i++) {
                    acessos[i] = acessos[i] + 1;
                    System.out.println("Acesso: " + acessos[i]);
                }

                for (String color: cores){
                    System.out.println("Cor: " + color);
                }

                boolean achei = false;
                do{
                    achei = true;
                    System.out.println("A variável achei agora vale " +achei);
                }while (!achei);


                if (nomeProduto.equals(nomeProdutoPdp)){
                    System.out.println("Os nomes dos produtos são iguais!");
                }else{
                    System.out.println("Os nomes dos produtos são diferentes!");
                }

        }

            }





