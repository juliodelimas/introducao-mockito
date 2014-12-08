package br.com.qualister;

public class Avaliacao
{
     public String avaliar(IEstudante aluno)
     {
          if (aluno.getNotaProva() >= 7)
               if (aluno.getNotaTrabalho() >= 7)
                    return "Aprovado";
               else
                    return "Precisará repor a nota do trabalho";
          else
               return "Terá de fazer DP";
    }
}