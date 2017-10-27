
/**
 * Write a description of class Students here.
 * 
 * @author Ognjen Bosic - Luca Gibertini
 * @version 17-12-15
 */
public class Students
{
    private String nome;
    private String cognome;
    private String via;
    private String citta;
    private String provincia;
    private String matricola;
    public  String students;
    private int anni;
    /**
     * Constructor for objects of class Students
     */
    public Students(String nome,String cognome,String via,String citta,String provincia,String matricola,int anni)
    {
       this.nome=nome;
       this.cognome=cognome;
       this.via=via;
       this.citta=citta;
       this.provincia=provincia;
       this.matricola=matricola;
       this.anni=anni;
       students="" + nome + " " + cognome + " " + via + " " + citta + " " + provincia + " " + matricola + " " + anni;
    }

    /**
     * Restituisce il nome dello studente.
     * @return: nome
     */
    public String getNome()
    {
       return nome;
    }
    
      /**
     * Restituisce il cognome dello studente
     * @return: cognome
     */
    public String getCognome()
    {
       return cognome;
    }
    
      /**
     * Restituisce la via dello studente
     * @return: via
     */
    public String getVia()
    {
       return via;
    }
    
      /**
     * Restituisce la citta dello studente
     * @return: citta
     */
    public String getCitta()
    {
       return citta;
    }
    
       /**
     * Restituisce la provincia dello studente
     * @return: provincia
     */
    public String getProvincia()
    {
       return provincia;
    }
    
       /**
     * Restituisce il numero matricola dello studente
     * @return: provincia
     */
    public String getMatricola()
    {
       return matricola;
    }
    
    /**
     * Setta il nome dello studente 
     * @param: nome1
     */
    public void setNome(String nome1)
    {
        this.nome=nome1;
    }
    
     /**
     * Setta il cognome dello studente 
     * @param: cognome1
     */
    public void setCognome(String cognome1)
    {
        this.cognome=cognome1;
    }
    
     /**
     * Setta la via dello studente 
     * @param: via1
     */
    public void setVia(String via1)
    {
        this.via=via1;
    }
    
     /**
     * Setta la citta dello studente 
     * @param: citta1
     */
    public void setCitta(String citta1)
    {
        this.citta=citta1;
    }
    
     /**
     * Setta la provincia dello studente 
     * @param: provincia1
     */
    public void setProvincia(String provincia1)
    {
        this.provincia=provincia1;
    }
    
     /**
     * Setta il numero di matricola dello studente 
     * @param: matricola
     */
    public void setMatricola(String matricola)
    {
        this.matricola=matricola;
    }
    
       /**
     * Restituisce il numero matricola dello studente
     * @return: provincia
     */
    public int getAnni()
    {
       return anni;
    }
    
    /**
     * Setta il nome dello studente 
     * @param: nome1
     */
    public void setAnni(int anni1)
    {
        this.anni=anni1;
    }
    
      /**
     * Setta i dati dello studente 
     */
    public void setStudents()
    {
        students="" + nome + " " + cognome + " " + via + " " + citta + " " + provincia + " " + matricola + " " + anni;
        System.out.println(students);
    }
    
     /**
     * Restituisce i dati dello studente 
     */
    public String getStudents()
    {
        return students;
    }
    
}
