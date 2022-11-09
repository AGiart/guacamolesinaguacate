
package com.mycompany.caso1;

/**
 *
 * @author isalr
 */
public class Automovil {
    private static String marca;
    private static String modelo;
    private static String Tcombustible;
    private static String Tauto;
    private static double Vmax;
    private static String color;
    private static double Vact;
    
    public String getmarca(){
        String marc = "";
        marc = Automovil.marca;
        return marc;}
    public String getmodelo(){
        String mod = "";
        mod = Automovil.modelo;
        return mod;}
    public String getTcombustible(){
        String Tcom = "";
        Tcom = Automovil.Tcombustible;
        return Tcom;}
    public String getTauto(){
        String Tau = "";
        Tau = Automovil.Tauto;
        return Tau;}
    public double getVmax(){
        String Vmov = "";
        double Vm = Double.parseDouble(Vmov); 
        Vm = Automovil.Vmax;
        return Vm;}
    public String getcolor(){
        String col = "";
        col = Automovil.color;
        return col;}
    public double getVact(){
        String Vac = "";
        double Va = Double.parseDouble(Vac); 
        Va = Automovil.Vact;
        return Va;}
    public void setmarca(String marc){
        this.marca = marc;}
    public void setmodelo(String mod){
        this.modelo = mod;}
    public void setTcombustible(String Tcom){
        this.Tcombustible = Tcom;}
    public void setTauto(String Tau){
        this.Tauto = Tau;}
    public void setVmax(double Vm){
        this.Vmax = Vm;}
    public void setcolor(String col){
        this.color = col;}
    public void setVact(double Va){
        this.Vact = Va;}
}
