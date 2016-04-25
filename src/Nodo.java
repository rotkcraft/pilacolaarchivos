/**
 * Created by rcraft on 04-17-16.
 */
public class Nodo<E>
{
    private E info;
    private Nodo<E> sig;

    public Nodo(E info, Nodo<E> sig)
    {
        this.info = info;
        this.sig = sig;
    }

    public E getInfo()
    {
        return info;
    }

    public void setInfo(E info)
    {
        this.info = info;
    }

    public Nodo<E> getSig()
    {
        return sig;
    }

    public void setSig(Nodo<E> sig)
    {
        this.sig = sig;
    }

    @Override
    public String toString()
    {
        return info.toString();
    }
}
