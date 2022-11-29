public abstract Batiment {
    String adresse();
    double surface();
    
    //public abstract double s.urface(double surface){
        
    //};

   public Batiment() {

    }

    public Batiment(String adresse, double surface){
        this.surface = surface;
        this.adresse = adresse;
    }

    static public String getAdresse() {
        return adresse;
    }

    static public double getSurface() {return surface;}

    @Override
    public String toString() {
        return "Adresse : " + adresse + "\nSurface : " + surface + " mètres carrés";
    }

}