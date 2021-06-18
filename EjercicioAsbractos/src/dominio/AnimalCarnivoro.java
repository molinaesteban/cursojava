package dominio;

public class AnimalCarnivoro extends  Animal {
    @Override
    public void alimentarse() {
        System.out.println("El animal se alimenta de carne");
    }
}
