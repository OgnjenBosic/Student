import java.util.ArrayList;

/**
 * A class to maintain an arbitrarily long list of notes.
 * Notes are numbered for external reference by a human user.
 * In this version, note numbers start at 0.
 * 
 * @author Ognjen Bosic - Loris Demicheli
 * @version 2.0
 */
public class Segreteria
{
    // Storage for an arbitrary number of notes.
    private ArrayList<Students> studenti;

    /**
     * Perform any initialization that is required for the
     * notebook.
     */
    public Segreteria()
    {
        studenti = new ArrayList<Students>();
        addTanti();
    }

    /**
     * Store a new note into the notebook.
     * @param note The note to be stored.
     */
    public void storeStudent(Students studente)
    {

        studenti.add(studente);
    }

    /**
     * @return The number of notes currently in the notebook.
     */
    public int numberOfStudents()
    {
        return studenti.size();
    }

    /**
     * Remove a note from the notebook if it exists.
     * @param noteNumber The number of the note to be removed.
     */
    public void removeStudents(int studentsNumber)
    {
        if(studentsNumber < 0) {
            // This is not a valid note number, so do nothing.
        }
        else 
        if(studentsNumber < numberOfStudents()) {
            // This is a valid note number.
            studenti.remove(studentsNumber);
        }
        else {
            // This is not a valid note number, so do nothing.
        }
    }

    /**
     * Ricerca studenti compresti tra i parameti
     */
    public void searchByAge()
    {
        printPersons(new Controllo<Students>()
            {
                public boolean test(Students studente) 
                {
                    return studente.getAnni() >= 16 && studente.getAnni() <= 18;
                }
            });
    }

    /** 
     * Stampa i studenti
     */
    public void listNotes()
    {

        for(Students studente : studenti) {
            System.out.println(studente.getStudents());
        }
    }

    /**
     * Stampa le persone che soddisfano il controllo
     *
     * @param check interfaccia con il controllo
     */
    private void  printPersons(Controllo check)
    {
        for(Students studente : studenti) {
            if(check.test(studente))
                studente.setStudents();
        }

    }

    /**
     * Aggiunge studenti nell'ArrayList
     */
    public void addTanti()
    {
        storeStudent(new Students("Pippo","baudo","Via nono","ALexandria","AL","001",15));
        storeStudent(new Students("gino","baudo","Via nono","ALexandria","AL","001",18));
        storeStudent(new Students("paolo","baudo","Via nono","ALexandria","AL","001",16));
        storeStudent(new Students("ploppo","baudo","Via nono","ALexandria","AL","001",20));
    }
}
