import java.util.ArrayList;

public class Muro
{
    private ArrayList<EntradaTexto> mensajes;
    private ArrayList<EntradaFoto> fotos;
    public Muro()
    {
        mensajes = new ArrayList<>();
        fotos = new ArrayList<>();
    }
    
    public void addEntradaTexto(EntradaTexto entradaTexto)
    {
    mensajes.add(entradaTexto);
    }
    
    public void addEntradaFoto(EntradaFoto entradaFoto)
    {
        fotos.add(entradaFoto);
    }
    
    public String toString() {
        StringBuilder textoADevolver = new StringBuilder();
        String mensajesStr = "";
        for (EntradaTexto mensaje : mensajes) {
            mensajesStr += mensaje + ("\n");
        }
        String fotosStr = "";
        for (EntradaFoto foto : fotos) {
            fotosStr += foto + ("\n");
        }
        return textoADevolver.append(mensajesStr).append(fotosStr).toString();
    }
    
    public void imprimirMuro() {
        System.out.println(toString());
    }
}