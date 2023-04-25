package servicio;

import entidad.Producto;
import java.util.Scanner;
import java.util.ArrayList;

public class ProductoServicio {
    
    Scanner entrada = new Scanner(System.in);
    
    public Producto crearProducto(){
        Producto producto = new Producto();
        System.out.println("Ingresa el nombre del producto: ");
        producto.setNombre(entrada.next());
        entrada.useDelimiter("\n");
        System.out.println("Ingresá la descripcion del producto: ");
        producto.setDescripcion(entrada.next());
        entrada.useDelimiter("\n");
        System.out.println("Ingresá el precio del producto: ");
        producto.setPrecio(entrada.nextDouble());
        entrada.useDelimiter("\n");
        return producto;
    }
    
    public void agregarProducto(Producto productos[]){
        Producto producto;
        for (int i = 0; i < productos.length; i++) {
            producto = crearProducto();
            productos[i] = producto;
        }
    }
    
    public void eliminarProducto(Producto productos[]){
        entrada.useDelimiter("\n");
        System.out.println("Ingresé el producto a eliminar");
        String nombre = entrada.next();
        for (int i = 0; i < productos.length; i++) {
            if(productos[i].getNombre().equals(nombre)){
                productos[i] = null;
                System.out.println("Producto eliminado con éxito");
            }
        }
    }
    
    public void mostrarProducto(Producto productos[]){
        for (int i = 0; i < productos.length; i++) {
            if(productos[i] == null){
                
            }else {
                System.out.println(productos[i]);
            }
        }
    }
    
    public void aplicacion() {
        System.out.println("¿Cuantos productos vas a agregar?");
        ArrayList<Producto> productos = new ArrayList<>();
    }
}
