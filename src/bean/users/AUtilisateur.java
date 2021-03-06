package bean.users;

import mediatek2022.Utilisateur;

public abstract class AUtilisateur implements Utilisateur {

    private String name;
    private boolean isBibliothecaire;
    private Object[] data;

    public AUtilisateur(String name, boolean isBibliothecaire) {
        this.name = name;
        this.isBibliothecaire = isBibliothecaire;
    }

    @Override
    public String name() {
        return this.name;
    }

    @Override
    public boolean isBibliothecaire() {
        return this.isBibliothecaire;
    }

    @Override
    public Object[] data() {
        return this.data;
    }

}
