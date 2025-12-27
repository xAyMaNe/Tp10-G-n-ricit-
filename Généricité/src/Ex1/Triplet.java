package Ex1;

public class Triplet<T> {	
	private final T premier;
    private final T second;
    private final T troisieme;

    /** Constructeur principal */
    public Triplet(T premier, T second, T troisieme) {
        this.premier    = premier;
        this.second     = second;
        this.troisieme  = troisieme;
    }

    /** Accesseur du premier élément */
    public T getPremier() {
        return premier;
    }

    /** Accesseur du second élément */
    public T getSecond() {
        return second;
    }

    /** Accesseur du troisième élément */
    public T getTroisieme() {
        return troisieme;
    }

    /** Affiche les trois éléments */
    public void affiche() {
        System.out.println("Triplet : ["
            + premier + ", "
            + second + ", "
            + troisieme + "]");
    
	}
    
	public static void main(String[] args) {
        Triplet<Integer> tInt = new Triplet<>(1, 2, 3);
        tInt.affiche();  
       
        Triplet<String> tStr = new Triplet<>("A", "B", "C");
        tStr.affiche(); 

        System.out.println("Second élément de tInt : " + tInt.getSecond());

	}

}
