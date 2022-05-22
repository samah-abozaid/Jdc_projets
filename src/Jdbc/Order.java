package Jdbc;

public class Order {

    private int id;
    private String typepresta;
    private String designation;
    private int nombrejours;
    private int prixUnitaire;



    public Order(int id, String typepresta, String designation, int nbDays) {
        this.id = id;
        this.typepresta = typepresta;
        this.designation = designation;
        this.nombrejours = nombrejours;
        this.prixUnitaire = prixUnitaire;

    }


    public int getId() {
        return id;
    }

        public void setId(int id) {
        this.id = id;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public String getTypepresta() {
        return typepresta;
    }

    public void setTypepresta(String typepresta) {
        this.typepresta = typepresta;
    }

    public int getNombrejours() {
        return nombrejours;
    }

    public void setNombrejours(int nombrejours) {
        this.nombrejours = nombrejours;
    }

    public int getPrixUnitaire() {
        return prixUnitaire;
    }

    public void setPrixUnitaire(int prixUnitaire) {
        this.prixUnitaire = prixUnitaire;
    }

    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", typepresta='" + typepresta + '\'' +
                ", designation='" + designation + '\'' +
                ", nombrejours=" + nombrejours +
                ", prixUnitaire=" + prixUnitaire +
                '}';
    }
}

