import java.util.ArrayList;

public class Museum {
    public static void main(String[] args) {
ArrayList<Art> museum = new ArrayList<Art> ();
        Painting painting1 = new Painting("Starry Night", "Vincent van Gogh", "A depiction of a night sky with swirling patterns.", "Oil");
        Painting painting2 = new Painting("The Persistence of Memory", "Salvador Dalí", "A surreal painting with melting clocks.", "Oil");
        Painting painting3 = new Painting("Mona Lisa", "Leonardo da Vinci", "A portrait of a woman with a mysterious smile.", "Oil");

        Sculpture sculpture1 = new Sculpture("David", "Michelangelo", "A marble statue of the Biblical hero David.", "Marble");
        Sculpture sculpture2 = new Sculpture("The Thinker", "Auguste Rodin", "A bronze sculpture of a man in deep thought.", "Bronze");
        museum.add(painting1);
        museum.add(painting2);
        museum.add(painting3);
        museum.add(sculpture1);
        museum.add(sculpture2);
        museum.forEach( (n) -> { System.out.println(n.getAuthor()); } );
        }
    
    }


