package ma.projet.classes;



import javax.persistence.*;
import java.util.Date;

@Entity
public class Contrat {
    @Id
    @GeneratedValue(strategy =  GenerationType.IDENTITY)

    private long id;
    private Date datedubut;
    private Date dateFin;

    private StatutContrat statut;

    @ManyToOne
    private Assurance assurance;

    @ManyToOne
    private Client client;

    public Contrat() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Date getDatedubut() {
        return datedubut;
    }

    public void setDatedubut(Date datedubut) {
        this.datedubut = datedubut;
    }

    public Date getDateFin() {
        return dateFin;
    }

    public void setDateFin(Date dateFin) {
        this.dateFin = dateFin;
    }

    public StatutContrat getStatut() {
        return statut;
    }

    public void setStatut(StatutContrat statut) {
        this.statut = statut;
    }

    @Override
    public String toString() {
        return "Contrat{" +
                "id=" + id +
                ", datedubut=" + datedubut +
                ", dateFin=" + dateFin +
                ", statut=" + statut +
                '}';
    }
}
