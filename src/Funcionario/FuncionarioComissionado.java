package Funcionario;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author lab202
 */
public class FuncionarioComissionado extends Funcionario {

    private final double totalVendas;
    private final double percentualComissao;
    
    
    /**
     *
     * @param  percentualComissao
     *         Valor em Decimal
     */
    
    public FuncionarioComissionado(String nome, double valorVendido, double percentualComissao) {
        super(nome);
        this.totalVendas = valorVendido;
        this.percentualComissao = percentualComissao;
    }
    
    @Override
    public double SalarioFinal(){
        return this.totalVendas * this.percentualComissao;
                
    }

    @Override
    public String toString() {
        return String.format("O salário final do %s é R$ %,.2f", super.getNome(), this.SalarioFinal());
    }
    
     
    
}
