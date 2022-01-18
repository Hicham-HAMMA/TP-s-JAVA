package ma.education.tp1.introduction;

public class SalleCours extends Salle {
    byte nbPlaces;

    public SalleCours(long id, String nom, byte nbPlaces) {
        super(id, nom);
        this.nbPlaces = nbPlaces;
    }
}
