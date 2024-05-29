public class Addition extends Operation
{
    /*
     * Constructeur vide
     */
    public Addition()
    {
        super();
    }

    /*
     * Constructeur champs à champs
     */
    public Addition(Nombre valeur1,Nombre valeur2)
    {
        super(valeur1, valeur2);
    }

    /*
     * retourne l'addition des operandes
     */
    public double valeur() 
    {
        return super.getOperande1().valeur() + super.getOperande2().valeur();
    }

    /*
     * retourne une chaine de caractères representant l'addition des opérandes 
     */
    public String toString()
    {
        return "(" + super.getOperande1() + " + " + super.getOperande2() + ")" ;    
    }
}



