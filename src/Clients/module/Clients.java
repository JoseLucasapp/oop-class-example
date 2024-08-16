package src.Clients.module;

import java.util.ArrayList;

public class Clients {
    private String name;
    private String email;
    private String cpf;
    private String password;

    public Clients(String name, String email, String cpf, String password){
        this.name = name;
        this.email = email;
        this.cpf = cpf;
        this.password = password;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setEmail(String email){
        this.email = email;
    }

    public void setCpf(String cpf){
        this.cpf = cpf;
    }

    public void setPassword(String password){
        this.password = password;
    }

    public String getName(){
        return this.name;
    }

    public String getEmail(){
        return this.email;
    }

    public String getCpf(){
        return this.cpf;
    }

    public String getPassword(){
        return  this.password;
    }

    public String getData(){
        String name = "Name:" + this.name;
        String email = "Email:"+ this.email;
        String cpf = "CPF:" + this.cpf;

        return name +","+ email +","+ cpf;
    }
}
