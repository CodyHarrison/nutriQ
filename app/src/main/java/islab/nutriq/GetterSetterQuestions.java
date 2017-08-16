package islab.nutriq;


public class GetterSetterQuestions {

    private long id;
    private String frage;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getFrage() {
        return frage;
    }

    public void setFrage(String frage) {
        this.frage = frage;
    }

    public GetterSetterQuestions(long id, String frage) {
        this.id = id;
        this.frage = frage;
    }

    @Override
    public String toString() {
        String output = id + " : " + frage;

        return output;
    }
}
