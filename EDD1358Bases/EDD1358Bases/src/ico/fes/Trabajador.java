package ico.fes;

public class Trabajador {

    final double HORA_EXTRA = 276.5;
    private int numeroTrabajador;
    private String nombre;
    private String paterno;
    private String materno;
    private int horasExtra;
    private int sueldoBase;
    private int anioIngreso;

    public Trabajador(int numeroTrabajador, String nombre, String paterno, String materno, int horasExtra, int sueldoBase, int anioIngreso) {
        this.numeroTrabajador = numeroTrabajador;
        this.nombre = nombre;
        this.paterno = paterno;
        this.materno = materno;
        this.horasExtra = horasExtra;
        this.sueldoBase = sueldoBase;
        this.anioIngreso = anioIngreso;
    }

    public int getAnioIngreso() {
        return anioIngreso;
    }

    public void setAnioIngreso(int anioIngreso) {
        this.anioIngreso = anioIngreso;
    }

    public int getNumeroTrabajador() {
        return numeroTrabajador;
    }

    public void setNumeroTrabajador(int numeroTrabajador) {
        this.numeroTrabajador = numeroTrabajador;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPaterno() {
        return paterno;
    }

    public void setPaterno(String paterno) {
        this.paterno = paterno;
    }

    public String getMaterno() {
        return materno;
    }

    public void setMaterno(String materno) {
        this.materno = materno;
    }

    public int getHorasExtra() {
        return horasExtra;
    }

    public void setHorasExtra(int horasExtra) {
        this.horasExtra = horasExtra;
    }

    public int getSueldoBase() {
        return sueldoBase;
    }

    public void setSueldoBase(int sueldoBase) {
        this.sueldoBase = sueldoBase;
    }

    public int estadoTrabajador() {
        
        int estado;
        estado =+ this.numeroTrabajador;
        System.out.println("estado = " + estado+"\n ");
        
        return estado;
    }
    
    public double calcularSueldo(){
        int antiguedad = 2022 - this.anioIngreso;
        double total = this.sueldoBase + (this.sueldoBase * (antiguedad * 0.03))+(this.horasExtra * this.HORA_EXTRA);
        return total;
    }
    
    

}
