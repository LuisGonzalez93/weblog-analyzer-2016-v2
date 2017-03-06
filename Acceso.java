import java.util.ArrayList;

public class Acceso
{
    private int ano;
    private int mes;
    private int dia;
    private int hora;
    private int minutos;
    private String ip;
    private String direccion;
    private String id;

    public Acceso(String acceso)
    {
        String[] campoAcceso = acceso.split(" ");
        this.ip = campoAcceso[0];
        this.ano = Integer.parseInt(campoAcceso[1].replace("[",""));
        this.mes = Integer.parseInt(campoAcceso[2]);
        this.dia = Integer.parseInt(campoAcceso[3]);
        this.hora = Integer.parseInt(campoAcceso[4]);
        this.minutos = Integer.parseInt(campoAcceso[5].replace("]",""));
        this.direccion = campoAcceso[6];
        this.id = campoAcceso[7];
    }
   

    public int getAno() 
    {
        return ano;
    }

    public int getMes()
    {
        return mes;
    }

    public int getDia()
    {
        return dia;
    }

    public int getHora()
    {
        return hora;
    }

    public int getMinutos()
    {
        return minutos;
    }
    
    public String getIp()
    {
        return ip;
    }
    
    public String getDireccion(){
        return direccion;
    }
    
    public String id(){
        return id;
    }
}