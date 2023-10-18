package Dominio;

public class Aluno {
    private String nome;
    private int matricula;
    private float nota1;
    private float nota2;
    private float nota3;
    private float media;
    private String situacao;

    public Aluno(){

    }

    public String getNome(){
        return nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }

    public int getMatricula(){
        return matricula;
    }
    public void setMatricula(int matricula){
        this.matricula = matricula;
    }

    public float getNota1(){
        return nota1;
    }

    public float getNota2(){
        return nota2;
    }

    public float getNota3(){
        return nota3;
    }
    public void setNotas(float nota1, float nota2, float nota3){
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3 = nota3;
    }

    public void calcularMedia(){
        this.media = this.nota1 + this.nota2 + this.nota3 / 3;

    }

    public float getMedia(){
        return media;
    }

    public String getSituacao(){
        if(this.media >= 7){
            this.situacao = "aprovado";
        } else {
            this.situacao = "reprovado";
        }
        return situacao;
    }

    public boolean buscarAluno(int matricula){
        if(this.matricula == matricula){
            return true;
        } else {
            return false;
        }
    }

    public String alterarNota(int codNota, float valorNota){
        if(this.nota1 == codNota){
            this.nota1 = valorNota;
        }
        if(this.nota2 == codNota){
            this.nota2 = valorNota;
        }
        if(this.nota3 == codNota){
            this.nota3 = valorNota;
        }
        return "Nota alterada";
    }

}
