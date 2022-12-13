/*
 • En cuanto a los estudiantes, se requiere almacenar el curso en el que están
matriculados.
 */
package entidades;


public final class Estudiante extends Persona{
    private String curso;

    public Estudiante() {
    }

    public Estudiante(String curso, String nombre, String apellido, String estadoCivil, Integer dni) {
        super(nombre, apellido, estadoCivil, dni);
        this.curso = curso;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }
    
    public void nuevoCurso(){
        System.out.println("Ingrese el nuevo curso al que se matriculará: ");
        this.curso=leer.next();
    }

    @Override
    public String toString() {
        return super.toString() + "Estudiante{" + "curso=" + curso + '}';
    }
    
    
}
