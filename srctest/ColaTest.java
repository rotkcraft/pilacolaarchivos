
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
}