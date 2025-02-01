import java.util.ArrayList;
import java.util.List;

public class Universidade{
    List<Curso> cursos = new ArrayList<>();
    
    public void criarCurso(Curso curso){
        cursos.add(curso);
    }
    
    Universidade(){
        
    }
}