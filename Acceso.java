import java.util.ArrayList;

public class Acceso
{
    private int ano;
    private int mes;
    private int dia;
    private int hora;
    private int minutos;

    public Acceso(String fecha)
    {
        String[] string = fecha.split(" ");
        int[] campoFecha = new int[string.length];
        for (int i = 0 ; i < string.length; i++){
            campoFecha[i] = Integer.parseInt(string[i]);
        }
        this.ano = campoFecha[0];
        this.mes = campoFecha[1];
        this.dia = campoFecha[2];
        this.hora = campoFecha[3];
        this.minutos = campoFecha[4];

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
}