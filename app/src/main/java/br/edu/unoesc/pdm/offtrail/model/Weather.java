package br.edu.unoesc.pdm.offtrail.model;

import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;

@DatabaseTable
public class Weather {

    @DatabaseField(generatedId = true)
    private Integer codigo;

    @DatabaseField
    private String nome;

    public Weather() {

    }

    public String getNome(){
        return nome;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
