

package com.mycompany.spoti;

import Cancion.DTO.Cancion;
import Cancion.DTO.Playlist;



public class Spoti {

    public static void main(String[] args) {
        Cancion cancion1 = new Cancion();
        cancion1.setArtista("Nonpalidece");
        cancion1.setTitulo("Love Song");
        cancion1.setTiempoDur(3, 24);
        cancion1.setDescargada(false);
        cancion1.setFavorito(true);
        
        Cancion cancion2 = new Cancion();
        cancion2.setArtista("Los Cafres");
        cancion2.setTitulo("Pura vida");
        cancion2.setTiempoDur(4,58);
        cancion2.setDescargada(true);
        cancion2.setFavorito(false);
        
        Cancion cancion3 = new Cancion();
        cancion3.setArtista("Outkast");
        cancion3.setTitulo("Roses");
        cancion3.setTiempoDur(5, 12);
        cancion3.setDescargada(true);
        cancion3.setFavorito(true);
        
        
        Playlist playlist1 = new Playlist();
        playlist1.setNombre(" Es la que va");
        playlist1.AgregarCancion(cancion1);
        playlist1.AgregarCancion(cancion2);
        playlist1.AgregarCancion(cancion3);
        
        playlist1.Imprime();
        
        
        playlist1.getCancion(0).setTiempoDur(6, 40);
        System.out.println("POSICION 0: "+playlist1.getCancion(0));
        System.out.println("POSICION 1: "+playlist1.getCancion(1));
        System.out.println("POSICION 2: "+playlist1.getCancion(2));
    }
}
