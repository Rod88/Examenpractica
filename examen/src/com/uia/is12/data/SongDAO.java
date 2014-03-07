/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.uia.is12.data;

import com.uia.is12.domain.Song;
import com.uia.is12.domain.Verse;
import java.util.ArrayList;

/**
 *
 * @author Administrador
 */
public class SongDAO {
    
    public SongDAO() {
    
}

    public Song getSong(){

   Song song = new Song();
  
   ArrayList<Verse> verses = new ArrayList();
   
   verses.add(new Verse("Don't think they know ",5000));
   verses.add(new Verse("about you! ",5000));
   verses.add(new Verse("safe and sound",5000));
   verses.add(new Verse("Don't think they know ",5000));
   verses.add(new Verse("how could they know",5000));
   
 song.setVerse(verses);
 return song;
    }
           
}