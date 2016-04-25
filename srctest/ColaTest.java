
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by rcraft on 04-17-16.
 */
public class ColaTest
{

    @Test
    public void probando() throws Exception
    {
        Pila<String> pila=new Pila<String>();
        Cola<String> cola=new Cola<String>();


        Archivo archivo=new Archivo("archivo/datos.csv");
        for(String linea:archivo.traerArchivo())
        {
            System.out.println(linea.split(",")[2]);
            pila.apilar(linea);
            cola.encolar(linea);


        }
        System.out.println(pila);
        System.out.println(pila.cima());
        System.out.println(pila.desapilar());
        System.out.println(pila.desapilar());
        System.out.println(pila.desapilar());
        System.out.println(pila.desapilar());
        System.out.println(pila);

        System.out.println(cola);
        System.out.println(cola.cima());
        System.out.println(cola.descolar());
        System.out.println(cola.descolar());
        System.out.println(cola.descolar());
        System.out.println(cola.descolar());
        System.out.println(cola);





    }

    @Test
    public void probandoDos() throws Exception
    {
        Pila<Empleado> pila=new Pila<Empleado>();
        Cola<Empleado> cola=new Cola<Empleado>();

        Archivo archivo=new Archivo("archivo/datos.csv");
        for(String linea:archivo.traerArchivo())
        {
            String t[]=linea.substring(0,linea.length()-1).split(",");

            pila.apilar(new Empleado(t[0],t[1],Double.parseDouble(t[2])));
            cola.encolar(new Empleado(t[0],t[1],Double.parseDouble(t[2])));


        }
        System.out.println(pila);
        System.out.println(pila.cima());
        System.out.println(pila.desapilar());
        System.out.println(pila.desapilar());
        System.out.println(pila.desapilar());
        System.out.println(pila.desapilar());
        System.out.println(pila);

        System.out.println(cola);
        System.out.println(cola.cima());
        System.out.println(cola.descolar());
        System.out.println(cola.descolar());
        System.out.println(cola.descolar());
        System.out.println(cola.descolar());
        System.out.println(cola);





    }
}