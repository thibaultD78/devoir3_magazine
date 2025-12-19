package sio.devoir2magazine.dto;

public class MagazineSpecialite
{
    private int idMagazine;
    private String nomMagazine;
    private String nomSpecialite;

    public MagazineSpecialite(int idMagazine, String nomMagazine, String nomSpecialite) {
        this.idMagazine = idMagazine;
        this.nomMagazine = nomMagazine;
        this.nomSpecialite = nomSpecialite;
    }

    public int getIdMagazine() {
        return idMagazine;
    }

    public String getNomMagazine() {
        return nomMagazine;
    }

    public String getNomSpecialite() {
        return nomSpecialite;
    }
}
