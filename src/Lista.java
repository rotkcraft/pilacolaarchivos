/**
 * Created by rcraft on 04-17-16.
 */
public class Lista<E>
{
    private Nodo<E> primero;
    private Nodo<E> ultimo;
    private int cantidad;

    public Lista()
    {
        cantidad=0;
    }

    public int getCantidad()
    {
        return cantidad;
    }

    public boolean estaVacia()
    {
        return cantidad==0;
    }

    public void insertarAlInicio(E info)
    {
        primero=new Nodo<E>(info,primero);
        if(estaVacia())
        {
            ultimo=primero;
        }
        cantidad++;
    }
    public void insertarAlFinal(E info)
    {
        Nodo<E> temp=new Nodo<E>(info,null);
        if(estaVacia())
        {
            primero=temp;
        }
        else
        {
            ultimo.setSig(temp);
        }
        ultimo=temp;
        cantidad++;
    }

    public E eliminarAlInicio()
    {
        if(estaVacia())
        {
            return null;
        }
        E dat=primero.getInfo();
        primero=primero.getSig();
        cantidad--;
        if(estaVacia())
        {
            vaciar();
        }
        return dat;
    }

    public E primero()
    {
        return primero.getInfo();
    }


    public E ultimo()
    {
        return ultimo.getInfo();
    }

    public void vaciar()
    {
        primero=ultimo=null;
    }

    public String toString()
    {
        Nodo<E> act=primero;
        StringBuilder sb=new StringBuilder();
        sb.append("{");

        while (act!=null)
        {
            sb.append(act.getInfo()+(act.getSig()!=null?", ":""));
            act=act.getSig();
        }

        sb.append("}");
        return sb.toString();
    }
}
