
package com.mycompany.caso1;
import javax.swing.JOptionPane;
/**
 *
 * @author isalr
 */
public class Caso1 {

    public static void main(String[] args) {
        Automovil automovil = new Automovil();
        
       
        
        
        boolean signal= true;
        
        while (signal == true){
            String menu = "";
            menu = JOptionPane.showInputDialog("Ingrese la opcion que necesita(numero) \n1.Crear automovil \n2.Acelerar \n3.Desacelerar \n4.Calcular tiempo \n5.Mostrar informacion del automovil \n6.Salir");
            if(menu.equals("1")){
                automovil.setmarca(JOptionPane.showInputDialog("Ingrese la marca del automovil"));
                automovil.setmodelo(JOptionPane.showInputDialog("Ingrese el modelo del auto"));
                automovil.setTcombustible(JOptionPane.showInputDialog("Ingrese el tipo de combustible del auto"));
                automovil.setTauto(JOptionPane.showInputDialog("Ingrese el tipo de auto del auto"));
                String Vma= "0";
                double vm = Double.parseDouble(Vma);
                Vma=JOptionPane.showInputDialog("Ingrese la velociadad maxima del auto(la velocidad estara en km/h)");
                
                automovil.setVmax(vm);
               
                automovil.setcolor(JOptionPane.showInputDialog("Ingrese el color del auto"));
                String Vac = "0";
                double va = Double.parseDouble(Vac);
                Vac=JOptionPane.showInputDialog("Ingrese la Velocidad actual(la velocidad estara en km/h)");
                if(automovil.getVact() > automovil.getVmax()){
                    JOptionPane.showMessageDialog(null, "La velocidad actual no puede ser mayor a la velocidad maxima");
                }else{
                    automovil.setVact(va);
                }
                
                
                JOptionPane.showMessageDialog(null, "Datos guardados");
 
            }if(menu.equals("2")){
                String Nvel = "0";
                double Nv = Double.parseDouble(Nvel);
            
                Nvel = JOptionPane.showInputDialog("Ingrese cuanto desea acelerar (la velocidad estara en km/h)");
                if (Nv > automovil.getVmax()){
                    JOptionPane.showMessageDialog(null, "La velocidad actual no puede ser mayor a la velocidad maxima");
                }else{
                    double ac = Nv + automovil.getVact();
                    automovil.setVact(ac);
                }
            }if(menu.equals("3")){
                String Nvel = "0";
                double Nv = Double.parseDouble(Nvel);
            
                Nvel = JOptionPane.showInputDialog("Ingrese cuanto desea desacelerar (la velocidad estara en km/h)");
                if (Nv < 0){
                    JOptionPane.showMessageDialog(null, "La velocidad actual no puede menor que 0");
                }else{
                    double ac = automovil.getVact() - Nv;
                    automovil.setVact(ac);}
            }
        }
    }
}
            
            
            
        
    


