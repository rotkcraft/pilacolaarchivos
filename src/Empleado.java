/**
 * Created by rcraft on 04-25-16.
 */
public class Empleado
{
    private String id;
    private String nombre;
    private double sueldo;

    public Empleado(String id, String nombre, double sueldo)
    {
        this.id = id;
        this.nombre = nombre;
        this.sueldo = sueldo;
    }

    public String getId()
    {
        return id;
    }

    public void setId(String id)
    {
        this.id = id;
    }

    public String getNombre()
    {
        return nombre;
    }

    public void setNombre(String nombre)
    {
        this.nombre = nombre;
    }

    public double getSueldo()
    {
        return sueldo;
    }

    public void setSueldo(double sueldo)
    {
        this.sueldo = sueldo;
    }

    @Override
    public String toString()
    {
        return  "id='" + id  + ", nombre= '" + nombre +", sueldo=" + sueldo ;
    }
}
