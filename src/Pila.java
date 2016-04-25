/**
 * Created by rcraft on 04-17-16.
 */
public class Pila<E>
{
    Lista<E> lista;

    public Pila()
    {
        lista=new Lista<>();
    }

    public void apilar(E info){
        lista.insertarAlInicio(info);
    }
    public E desapilar()
    {
        return lista.eliminarAlInicio();
    }

    public E cima()
    {
        return lista.primero();
    }

    public int getCantidad()
    {
        return lista.getCantidad();
    }

    @Override
    public String toString()
    {
        return lista.toString();
    }
}
