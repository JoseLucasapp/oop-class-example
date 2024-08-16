package Clients.module;

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

    void setName(String name){
        this.name = name;
    }

    void setEmail(String email){
        this.email = email;
    }

    void setCpf(String cpf){
        this.cpf = cpf;
    }

    void setPassword(String password){
        this.password = password;
    }

    String getName(){
        return this.name;
    }

    String getEmail(){
        return this.email;
    }

    String getCpf(){
        return this.cpf;
    }

    String getPassword(){
        return  this.password;
    }
}
