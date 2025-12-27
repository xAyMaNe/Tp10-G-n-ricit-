package Ex2;

public class TripletH<A, B, C> {
	private final A premier;
    private final B second;
    private final C troisieme;

    /** Constructeur principal */
    public TripletH(A premier, B second, C troisieme) {
        this.premier    = premier;
        this.second     = second;
        this.troisieme  = troisieme;
    }

    public A getPremier()    { return premier; }
    public B getSecond()     { return second; }
    public C getTroisieme()  { return troisieme; }

    public void affiche() {
        System.out.println("TripletH : ["
            + premier + ", "
            + second  + ", "
            + troisieme + "]");
    }
    public class TestTripletH {
        public static void main(String[] args) {
            // Triplet hétérogène : Integer, String, Double
            TripletH<Integer,String,Double> th =
                new TripletH<>(42, "Answer", 3.14);
            th.affiche();  // affiche [42, Answer, 3.14]

            // Exemple avec des objets métiers
            TripletH<String, Integer, Boolean> th2 =
                new TripletH<>("Alice", 30, true);
            th2.affiche();
        }
    }
}