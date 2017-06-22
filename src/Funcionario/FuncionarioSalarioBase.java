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
public class FuncionarioSalarioBase extends Funcionario implements ISalarioBase {
    private double salarioBase;  

    public FuncionarioSalarioBase(String nome, double salarioBase) {
        super(nome);
        this.salarioBase = salarioBase;
    }
    
    @Override
    public double getSalarioBase(){
        return this.salarioBase;
    }
    
}