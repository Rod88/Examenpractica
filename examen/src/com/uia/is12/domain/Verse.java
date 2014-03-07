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
public class Verse {
    
    private String paragraph;
    private int verseTime;
    
    public Verse() {
        
    }
        public Verse (String paragraph,int verseTime) {
            this.paragraph = paragraph;
            this.verseTime = verseTime;
        }    

    /**
     * @return the paragraph
     */
    public String getParagraph() {
        return paragraph;
    }

    /**
     * @param paragraph the paragraph to set
     */
    public void setParagraph(String paragraph) {
        this.paragraph = paragraph;
    }

    /**
     * @return the verseTime
     */
    public int getVerseTime() {
        return verseTime;
    }

    /**
     * @param verseTime the verseTime to set
     */
    public void setVerseTime(int verseTime) {
        this.verseTime = verseTime;
    }
    
}
