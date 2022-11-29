public abstract class Instruments(){

    String nomInstru;

    int prixAchatInstru;

    int prixVenteInstru; 

    @Override
    public String toString(){
        return(nomInstru+prixAchatInstru+prixVenteInstru);
    }

}