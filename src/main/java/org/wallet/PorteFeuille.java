package org.wallet;

public class PorteFeuille {
    private String couleur;
    private int porteCarte;
    private double poids;
    private String marque;
    private double money;

    public PorteFeuille(String couleur, int porteCarte, double poids, String marque) {
        this.couleur = couleur;
        this.porteCarte = porteCarte;
        this.poids = poids;
        this.marque = marque;
        this.money = 0;
    }

    // Getter et Setter
    public String getCouleur() { return couleur; }
    public void setCouleur(String couleur) { this.couleur = couleur; }

    public int getPorteCarte() { return porteCarte; }
    public void setPorteCarte(int porteCarte) { this.porteCarte = porteCarte; }

    public double getPoids() { return poids; }
    public void setPoids(double poids) { this.poids = poids; }

    public String getMarque() { return marque; }
    public void setMarque(String marque) { this.marque = marque; }

    public double getMoney() { return money; }

    // Méthodes
    public void addMoney(double montant) {
        if (montant > 0) {
            this.money += montant;
        }
    }

    public boolean checkMoney(double montant) {
        return this.money >= montant;
    }

    public void addCard() {
        this.porteCarte += 1;
    }

    public void lost() {
        this.money = 0;
        this.porteCarte = 0;
    }
}

