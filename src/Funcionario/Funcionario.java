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
public class Funcionario extends AFuncionario{

    private final String nome;
    
    public Funcionario(String nome){
        this.nome = nome;
    }
    
    @Override
    public double SalarioFinal(){
        return 0;
    }
    
    @Override
    public String getNome() {
        return this.nome;
    }
    
    @Override
    public String toString(){
        return String.format("O salário final do %s é R$ %,.2f", this.getNome(), this.SalarioFinal());
    }
    
}
