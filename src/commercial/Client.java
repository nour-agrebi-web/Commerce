package commercial;

public class Client {
    public String nom;
    public String telephone;
    private int points;
    public Client(String nom, String telephone) {
        this.nom = nom;
    }
    public Client(String nom, String telephone, int points) {
        this.nom = nom;
    }
    public String getNom() {
        return nom;
    }
    public void setNom(String nom) {
        this.nom = nom;
    }
    public String getTelephone() {
        return telephone;
    }
    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }
    public int getPoints() {
        return points;
    }
    public void setPoints(int points) {
        this.points = points;
    }
    @Override
    public String toString() {
        return "Client{" + "nom=" + nom + ", telephone=" + telephone + '}';
    }
}
