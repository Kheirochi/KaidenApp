package com.example.gridlayoutlinstaggered;

import android.graphics.Bitmap;

public class Produit {

    public String nom;
    public Bitmap photo;
    public Produit(String nom, Bitmap pic){
        this.nom = nom;
        this.photo = pic;
    }

    public void setNom(String nom){
        this.nom = nom;
    }
    public void setPhoto(Bitmap pic ){
        this.photo = pic;
    }

    public Bitmap getPhoto(){
        return photo;
    }
    public String getNom(){
        return nom;
    }
}
