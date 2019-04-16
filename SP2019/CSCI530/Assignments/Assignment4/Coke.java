public class Coke{
    
    String flavor;

    
    public Coke(String flavor){
        this.flavor = flavor;
    }

    public void setFlavor(String flavor){
        this.flavor = flavor;
    }

    public String getFlavor(){
        return flavor;
    }

    @Override
    public String toString(){
        return("Flavor: " + flavor);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        
        if (obj == null || obj.getClass() != this.getClass())
            return false;
        
        Coke coke = (Coke) obj;
    
        return (coke.flavor.equals(this.flavor));
    }

}