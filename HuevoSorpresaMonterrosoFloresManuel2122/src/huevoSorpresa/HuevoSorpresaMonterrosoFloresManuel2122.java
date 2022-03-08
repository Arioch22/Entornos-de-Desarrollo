package huevoSorpresa;

/**
 *
 * @author Manuel Monterroso Flores
 */
public class HuevoSorpresaMonterrosoFloresManuel2122 {

    private int unidades;//número de huevos que quedan 
    private double precio;//precio actual de un huevo sorpresa
    private String sorpresa;//nombre de la sorpresa que incluye huevo sorpresa
    private double precio_maxMonterrosoFloresManuel2122;//precio máximo que puede tener un huevo sorpresa

    /*Constructor por defecto*/

    /**
     *
     */

    public HuevoSorpresaMonterrosoFloresManuel2122() {
    }


    /*Constructor por parámetros*/

    /**
     *
     * @param unidades Cantidad de huevos
     * @param precio Precio del huevo
     * @param sorpresa Texto
     * @param precio_max Precio máximo por huevo
     */

    public HuevoSorpresaMonterrosoFloresManuel2122(int unidades, double precio, String sorpresa, double precio_max) {
        this.unidades = unidades;
        this.precio = precio;
        this.sorpresa = sorpresa;
        this.precio_maxMonterrosoFloresManuel2122 = precio_max;
    }


    /*Método que devuelve el número de huevos sorpresa que tiene la tienda*/

    /**
     *
     * @return Devuelve el número de huevos sorpresa que tiene la tienda
     */

    public int obtenerUnidades() {
        return this.getUnidades();
    }

    /*Método que devuelve el precio que tiene cada huevo sorpresa*/

    /**
     *
     * @return Devuelve el precio que tiene cada huevo sorpresa
     */

    public double obtenerPrecio() {
        return this.getPrecio();
    }


    /* Método que devuelve la sorpresa que tiene el huevo*/

    /**
     *
     * @return Devuelve la sorpresa que tiene el huevo
     */

    public String obtenerSorpresa() {
        return getSorpresa();
    }

    /* Método que permite modificar la sorpresa del huevo*/

    /**
     * Método que permite modificar la sorpresa del huevo
     * @param sorpresa sorpresa que tendra ahora el huevo
     */

    public void modificarSorpresa(String sorpresa) {
        this.setSorpresa(sorpresa);
    }


    /*Método que permite modificar el número de huevos sorpresa que tiene la tienda*/

    /**
     * Método que permite modificar el número de huevos sorpresa que tiene la tiend
     * @param unidades huevos que tendra ahora la tienda
     */

    public void modificarUnidades(int unidades) {
        this.setUnidades(unidades);
    }


    /*Método que permite sacar huevos sorpresa si se tiene suficiente dinero y hay 
suficientes unidades en la tienda*/

    /**
     * Método que permite sacar huevos sorpresa si se tiene suficiente dinero y hay suficientes unidades en la tienda
     * @param unidades cantidad de huevos a comprar
     * @param dinero Dinero que se va a utilizar para comprar los huevos
     * @param sorpresaMonterrosoFloresManuel2122 Sorpresa que puede tener los huevos
     * @throws Exception Errores controlados que son para cuando el dinero sea menor de 0, no haya suficiente dinero para comprar los huevos que se piden
     * para cuando se piden 0 o se introduce un número negativos en cantidad de Huevos y cuando se piden mas Huevos de los que hay en la tienda.
     */

    public void sacarHuevosSorpresas(int unidades, double dinero, String sorpresaMonterrosoFloresManuel2122) throws Exception {
        if (dinero <= 0) {
            throw new Exception("Se necesita una cantidad de dinero positiva");
        }
        if (dinero < (unidades * getPrecio())) {
            throw new Exception("No tiene suficiente dinero");
        }
        if (unidades <= 0) {
            throw new Exception("Es necesario indicar una cantidad positiva de huevos sorpresa");
        }
        if (this.getUnidades() <= unidades) {
            throw new Exception("No hay suficientes huevos sorpresa en la tienda");
        }
        this.modificarUnidades(this.obtenerUnidades() - unidades);
    }


    /*Método que permite aumentar el precio de venta de un huevo sorpresa, suma al precio actual 
    el aumento que se indica siempre que no se sobrepase el precio máximo de venta*/

    /**
     * Método que permite aumentar el precio de venta de un huevo sorpresa, suma al precio actual 
     * el aumento que se indica siempre que no se sobrepase el precio máximo de venta
     * @param aumento Cantidad que sube el precio de los huevos.
     * @throws Exception Que recoje cuando el aumento se introduce negativo o si con el aumento se supera el precio máximo del Huevo.
     */

    public void aumentarPrecio(double aumento) throws Exception {
        if (aumento <= 0) {
            throw new Exception("El aumento debe ser positivo");
        }
        if (getPrecio_maxMonterrosoFloresManuel2122() < getPrecio() + aumento) {
            throw new Exception("No se puede superar el precio máximo");
        }
        setPrecio(getPrecio() + aumento);
    }

    /**
     * @return unidades de huevos
     */
    public int getUnidades() {
        return unidades;
    }

    /**
     * @param unidades para asignar número de huevos
     */
    public void setUnidades(int unidades) {
        this.unidades = unidades;
    }

    /**
     * @return el precio del huevo
     */
    public double getPrecio() {
        return precio;
    }

    /**
     * @param precio para indicar el precio del huevo
     */
    public void setPrecio(double precio) {
        this.precio = precio;
    }

    /**
     * @return la sorpresa que tiene el huevo
     */
    public String getSorpresa() {
        return sorpresa;
    }

    /**
     * @param sorpresa para añadir la sorpresa que tendrá el Huevo
     */
    public void setSorpresa(String sorpresa) {
        this.sorpresa = sorpresa;
    }

    /**
     * @return Precio máximo del Huevo
     */
    public double getPrecio_maxMonterrosoFloresManuel2122() {
        return precio_maxMonterrosoFloresManuel2122;
    }

    /**
     * @param precio_maxMonterrosoFloresManuel2122 Para indicar el precio máximo del huevo
     */
    public void setPrecio_maxMonterrosoFloresManuel2122(double precio_maxMonterrosoFloresManuel2122) {
        this.precio_maxMonterrosoFloresManuel2122 = precio_maxMonterrosoFloresManuel2122;
    }
}
