/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package assets;

import classes.Emprestimo;

/**
 *
 * @author ryane
 */
public class EmprestimoBD {
    public void cadastrarEmprestimo(Emprestimo emprestimo){
        String sql = "INSERT INTO EMPRESTIMO (NOME, DATA, TURNO, HORARIO, QUANTIDADE) VALUES (?, ?, ?, ?, ?)";
    }
}
