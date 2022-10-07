
package Cancion.DTO;

import java.util.ArrayList;



public class Playlist {
    private ArrayList<Cancion> Lista;
    private String Nombre;
    
    public Playlist(){
        Lista = new ArrayList();
        Nombre = "";
    }
    public Playlist (ArrayList<Cancion> Lista, String Nombre){
        this.Lista = Lista;
        this.Nombre = Nombre;
    }

    public ArrayList<Cancion> getLista() {
        return this.Lista;
        
    }

    public void setLista(ArrayList<Cancion> Lista) {
        this.Lista = Lista;
    }

    public String getNombre() {
        return this.Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }
    public void AgregarCancion(Cancion cancion){
        this.Lista.add(cancion);
    }
    
    public Cancion getCancion(int posicion){
        return this.Lista.get(posicion);
//        //try{
//            if(posicion > 6){
//                FueraDelLimiteException ex = new FueraDelLimiteException();
//                ex.setAccion("Taba ingresando "+ posicion + " de largo.");
//                throw ex;
//            }
//            return this.lista.get(posicion);
//        }catch(FueraDelLimiteException ex){
//            System.out.println("te saliste po compadre.");
//            System.out.println(ex.getAccion());
//        }catch(IndexOutOfBoundsException ex){
//            System.out.println("Se salio del largo :(");
//        }catch(Exception ex){
//            System.out.println(ex.getMessage());
//            System.out.println("Se cayo bien rara la cosa.");
//        }
//        
//        return null;
    }
    public void Imprime(){
        System.out.println("================");
        System.out.println("Playlist"+this.Nombre);
        for(Cancion cancion : this.Lista){
            System.out.println(cancion);
        }
        System.out.println("===============");
        }
    }
    
    

