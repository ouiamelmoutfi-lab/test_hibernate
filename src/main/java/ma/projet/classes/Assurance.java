package ma.projet.classes;

import javax.persistence.*;
import java.util.List;

@Entity
public class Assurance {
    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY)

    private long id;
    private String type;
    private Double montant;
    private  String couverture;

    @OneToMany(mappedBy = "assurance")
   private List<Contrat> contrats;

    public Assurance() {
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Double getMontant() {
        return montant;
    }

    public void setMontant(Double montant) {
        this.montant = montant;
    }

    public String getCouverture() {
        return couverture;
    }

    public void setCouverture(String couverture) {
        this.couverture = couverture;
    }
}
