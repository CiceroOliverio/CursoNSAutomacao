package main.java.models;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Produto {

    private String nomeProdutoCart;
    private String nomeProdutoPdp ;
    private int percDesconto ;
    private boolean promo;
    private BigDecimal precoTotalCart = new BigDecimal(0);
    BigDecimal precoTotalPdp = new BigDecimal(0);
    private List<String> cores = new ArrayList<>();
    private List<Integer> tamanhos = new ArrayList<>();

    public String getNomeProdutoCart() {
        return nomeProdutoCart;
    }

    public void setNomeProdutoCart(String nomeProdutoCart) {
        this.nomeProdutoCart = nomeProdutoCart;
    }

    public String getNomeProdutoPdp() {
        return nomeProdutoPdp;
    }

    public void setNomeProdutoPdp(String nomeProdutoPdp) {
        this.nomeProdutoPdp = nomeProdutoPdp;
    }

    public int getPercDesconto() {
        return percDesconto;
    }

    public void setPercDesconto(int percDesconto) {
        this.percDesconto = percDesconto;
    }

    public boolean isPromo() {
        return promo;
    }

    public void setPromo(boolean promo) {
        this.promo = promo;
    }

    public BigDecimal getPrecoTotalCart() {
        return precoTotalCart;
    }

    public void setPrecoTotalCart(BigDecimal precoTotalCart) {
        this.precoTotalCart = precoTotalCart;
    }

    public BigDecimal getPrecoTotalPdp() {
        return precoTotalPdp;
    }

    public void setPrecoTotalPdp(BigDecimal precoTotalPdp) {
        this.precoTotalPdp = precoTotalPdp;
    }

    public List<String> getCores() {
        return cores;
    }

    public void setCores(List<String> cores) {
        this.cores = cores;
    }

    public List<Integer> getTamanhos() {
        return tamanhos;
    }

    public void setTamanhos(List<Integer> tamanhos) {
        this.tamanhos = tamanhos;
    }


}
