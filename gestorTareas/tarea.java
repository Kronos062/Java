package gestorTareas;

public class tarea {
    class Tarea {
        private int id;
        private String descripcion;
        private String prioridad;
        private boolean completado;
    
        public Tarea(int id, String descripcion, String prioridad) {
            this.id = id;
            this.descripcion = descripcion;
            this.prioridad = prioridad;
            this.completado = false;
        }
    
        public int getId() {
            return id;
        }
    
        public String getDescripcion() {
            return descripcion;
        }
    
        public String getPrioridad() {
            return prioridad;
        }
    
        public boolean isCompletado() {
            return completado;
        }
    
        public void setCompletado(boolean completado) {
            this.completado = completado;
        }
    }
    
}
