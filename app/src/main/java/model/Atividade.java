package model;

/**
 * Created by adoniran on 28/11/17.
 */

public class Atividade {
    private String nome;
    private String descricao;
    private String data_ini;
    private String data_final;
    private String rua;
    private String bairro;
    private String cidade;
    private String estado;
    private String pais;

    public Atividade(){}
    public Atividade(String nome ,String descricao,String dataI,String data_final,String rua,String bairro,String estado,String cidade,String pais){
        this.nome=nome;
        this.descricao=descricao;
        this.data_ini=dataI;
        this.data_final=data_final;
        this.rua=rua;
        this.bairro=bairro;
        this.cidade=cidade;
        this.estado=estado;
        this.pais=pais;

    }

    public String getBairro() {
        return bairro;
    }

    public String getData_ini() {
        return data_ini;
    }

    public String getData_final() {
        return data_final;
    }

    public String getCidade() {
        return cidade;
    }

    public String getDescricao() {
        return descricao;
    }

    public String getNome() {
        return nome;
    }

    public String getEstado() {
        return estado;
    }

    public String getPais() {
        return pais;
    }

    public String getRua() {
        return rua;
    }
    public void setNome(String nome){
        this.nome=nome;
    }
    public void setRua(String nome){
        this.rua=nome;
    }
    public void setBairro(String nome){
    this.bairro=nome;
    }
    public void setDescricao(String nome){
        this.descricao=nome;
    }
    public void setCidade(String nome){
        this.cidade=nome;
    }
    public void setEstado(String nome){
        this.estado=nome;
    }
    public void setData_ini(String nome){
        this.data_ini=nome;
    }
    public void setData_final(String nome){
        this.data_final=nome;
    }
    public void setPais(String nome){
        this.pais=nome;
    }

}