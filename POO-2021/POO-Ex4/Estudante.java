public class Estudante {
    
    private String nome;
    private double media;

    public Estudante(String nome, double media) {
        this.nome = nome;
        if (media > 0) {
            if (media <= 100.0) {
                this.media = media;
            }
        }
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setMedia(double mediaEstudante) {
        if (mediaEstudante > 0.0) {
            if (mediaEstudante <= 100.0) {
                this.media = mediaEstudante;
            }
        }
    }

    public double getMedia() {
        return media;
    }

    public String getLetraMedia() {
        String letraMedia = "";

        if (media >= 90.0) {
            letraMedia = "A";
        }
        else if (media >= 80.0) {
            letraMedia = "B";
        }
        else if (media >= 70.0) {
            letraMedia = "C";
        }
        else if (media >=60.0) {
            letraMedia = "D";
        }
        else {
            letraMedia = "F";
        }
        return letraMedia;
    }


}