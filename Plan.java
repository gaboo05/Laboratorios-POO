public abstract class Plan {
    
    // Atributos de tipo protected para la superclase Plan
    protected int duracionMaxima;
    protected int maximoInvitados;
    protected int maximoReunionesDiarias;
    protected int maximoReunionesCalendario;
    protected int maximoContactos;

    // Constructor
    protected Plan() { }

    // Mêtodos de la clase Plan que va a heredar a las clases PlanBase y PlanPremium
    public int getDuracionMaxima() {
        return duracionMaxima;
    }

    public int getMaximoInvitados() {
        return maximoInvitados;
    }

    public int getMaximoReunionesDiarias() {
        return maximoReunionesDiarias;
    }

    public int getMaximoReunionesCalendario() {
        return maximoReunionesCalendario;
    }

    public int getMaximoContactos() {
        return maximoContactos;
    }
}
