
package Cancion.DTO;

import java.time.Duration;
import java.time.temporal.ChronoUnit;

public class Cancion {
    private String Titulo;
    private String Artista;
    private Duration TiempoDur;
    private Boolean Favorito;
    private Boolean Descargada;
    private long TiempoActual;
    
    
    public Cancion(){
        this.Titulo = "";
        this.Artista = "";
        this.TiempoDur = Duration.ZERO;
        this.Favorito = false;
        this.Descargada = false;
        this.TiempoActual = 0;
    }
    
    
    public Cancion(String Titulo, String Artista, Duration TiempoDur, Boolean Favorito, Boolean Descargada){
        this.Titulo = Titulo;
        this.Artista = Artista;
        this.TiempoDur = TiempoDur;
        this.Favorito = Favorito;
        this.Descargada = Descargada;
    }

    public String getTitulo() {
        return Titulo;
    }

    public void setTitulo(String Titulo) {
        this.Titulo = Titulo;
    }

    public String getArtista() {
        return Artista;
    }

    public void setArtista(String Artista) {
        this.Artista = Artista;
    }

    public Duration getTiempoDur() {
        return TiempoDur;
    }
    
    public long getTiempoDurMinutos(){
        return TiempoDur.toMinutes();
    }

    
    public String getTiempoDurString(){
        return TiempoDur.toString()
                .replace("PT","")
                .replace("M",":")
                .replace("S","");
    }
    
    public void setTiempoDur(long duration) {
    this.TiempoDur = this.TiempoDur.plus(duration, ChronoUnit.SECONDS);
    }
    
    public void setTiempoDur(long minutos, long segundos){
    Duration dur = Duration.ZERO;
    this.TiempoDur = dur
            .plusMinutes(minutos)
            .plusSeconds(segundos);
    }
    

    public Boolean isFavorito() {
        return Favorito;
    }

    public void setFavorito(Boolean Favorito) {
        this.Favorito = Favorito;
    }

    public Boolean isDescargada() {
        return Descargada;
    }

    public void setDescargada(Boolean Descargada) {
        this.Descargada = Descargada;
    }
    
    //permitir adelantar cancion
    public void Adelantar(long donde){
        long segundos = this.TiempoDur.getSeconds();
        if(segundos > donde){
            this.TiempoActual = segundos;
        }
        else{
            this.TiempoActual = donde;
        }
    }
    
    //imprimir titulo, artista y tiempo
    public void Imprimir(){
    String strTiempoDur = this.getTiempoDurString();
    
        System.out.println(this.Artista + " - " + this.Titulo + " ( " + strTiempoDur + ")");
    }
    
    @Override
    public String toString(){
        String strTiempoDur = this.getTiempoDurString();
        
        return(this.Artista + " - " + this.Titulo + "(" + strTiempoDur +")");
    }
    //canción larga o normal (cancion larga + de 5 minutos)
    public boolean esLarga(){
        int minutosTope = 5*60;
        return this.getTiempoDurMinutos() > minutosTope;
    }
  
}
