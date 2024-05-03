package arbolBinario;

public class ArbolCaracteres {
    public ArbolCaracteres(int i) {
    }

    // esto es lo mismo de arbolEnteros pero con characters.
    public class ArbolCaracteres extends ArbolBinario<Character> {
        public ArbolCaracteres(int profundidad) {
            super(profundidad);
        }
    }
}
