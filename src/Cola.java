/**
 * Created by rcraft on 04-17-16.
 */
public class Cola<E>
{
    Lista<E> lista;

    public Cola()
    {
        lista=new Lista<E>();
    }
    public void encolar(E info)
    {
        lista.insertarAlFinal(info);
    }
    public E descolar()
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
    public String toString()
    {
        return lista.toString();
    }
}
