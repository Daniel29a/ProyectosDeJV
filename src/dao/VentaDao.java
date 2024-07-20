
package dao;

import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import modelos.Venta;


public class VentaDao {
    ArrayList<Venta>ventas = new ArrayList<>();
    
    public void AgregarVenta(Venta venta){
        
    ventas.add(venta)  ;
    }
    
    public double mostrarTotalVenta(){
        double totalVenta = 0;
     for( Venta venta : ventas) {
        totalVenta += venta.getMonto();
        
        
     }  
      return totalVenta;  
        
    }
 public double mostrarTotalTigo(){
     double totalVenta = 0;
     for (Venta venta : ventas){
         
         if(venta.getEmpresa().equals("Tigo")){
             totalVenta += venta.getMonto();
         }
     }
     
     return totalVenta;
     
 }
 public double mostrarTotalClaro(){
     double totalVenta =0;
     for (Venta venta : ventas){
         
         if ( venta.getEmpresa().equals("Claro"))
         totalVenta += venta.getMonto();
     }
         return totalVenta;
 }
public  DefaultTableModel mostrasRegistro(){
    DefaultTableModel registros = new   DefaultTableModel();
    
    String titulos[] = {"Compania","Numero", "Monto"};
    
    registros.setColumnIdentifiers(titulos);
    
    for ( Venta venta : ventas){
        Object fila [] = new Object [3];
        fila[0] = venta.getEmpresa();
        fila[1] = venta.getNumero();
        fila[2] = venta.getMonto();
        registros.addRow(fila);
        
    }
     return registros;  
   
}
   
}
