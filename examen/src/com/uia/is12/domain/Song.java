/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.uia.is12.domain;

import java.util.ArrayList;

/**
 *
 * @author Administrador
 */
public class Song {
    
    private String name;
    private ArrayList<Verse> verse;
    
    public Song () {
    
}

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the verse
     */
    public ArrayList<Verse> getVerse() {
        return verse;
    }

    /**
     * @param verse the verse to set
     */
    public void setVerse(ArrayList<Verse> verse) {
        this.verse = verse;
    }
    
           
    
}
