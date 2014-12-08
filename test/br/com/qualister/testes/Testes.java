/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.qualister.testes;

import br.com.qualister.Avaliacao;
import br.com.qualister.IEstudante;
import org.junit.Assert;
import org.junit.Test;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

/**
 *
 * @author juliodelima
 */
public class Testes {
    
    @Test
    public void testeAlunoAprovado()
    {
         // Arrange
         Avaliacao avaliacao = new Avaliacao();
         IEstudante aluno = mock(IEstudante.class);
         when(aluno.getNotaProva()).thenReturn(7.0);
         when(aluno.getNotaTrabalho()).thenReturn(7.0);

         // Act
         String resultado = avaliacao.avaliar(aluno);

         // Arrange
         Assert.assertEquals("Aprovado", resultado);
    } 
    
    @Test
    public void testeAlunoReporNotaTrabalho()
    {
         // Arrange
         Avaliacao avaliacao = new Avaliacao();
         IEstudante aluno = mock(IEstudante.class);
         when(aluno.getNotaProva()).thenReturn(7.0);
         when(aluno.getNotaTrabalho()).thenReturn(6.9);

         // Act
         String resultado = avaliacao.avaliar(aluno);

         // Arrange
         Assert.assertEquals("Precisará repor a nota do trabalho", resultado);
    } 
    
    @Test
    public void testeAlunoComDP()
    {
         // Arrange
         Avaliacao avaliacao = new Avaliacao();
         IEstudante aluno = mock(IEstudante.class);
         when(aluno.getNotaProva()).thenReturn(6.9);
         when(aluno.getNotaTrabalho()).thenReturn(0.0);

         // Act
         String resultado = avaliacao.avaliar(aluno);

         // Arrange
         Assert.assertEquals("Terá de fazer DP", resultado);
    } 
    
}
