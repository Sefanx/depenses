package com.example.depenses;

import java.util.ArrayList;
import java.util.Date;

public class Dipons {
    private int Id;
    private float Montant;
    private String Description;
    private String categorie;
    private Date date;
public static ArrayList<Dipons> colDep = new ArrayList<>();
    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public float getMontant() {
        return Montant;
    }

    public void setMontant(float montant) {
        Montant = montant;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public Dipons() {
    }

    public String getCategorie() {
        return categorie;
    }

    public void setCategorie(String categorie) {
        this.categorie = categorie;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Dipons(int id, float montant, String description, String categorie, Date date) {
        Id = id;
        Montant = montant;
        Description = description;
        this.categorie = categorie;
        this.date = date;
    }
    @Override
    public boolean equals( Object obj) {
        Dipons D = (Dipons) obj;
        return D.date.equals(this.date);
    }
    public static  void ajouter(Dipons D){

            colDep.add(D);
        }


    }


