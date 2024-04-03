package org.criptografia;

// Subclasse para representar o código Morse
class CodigoMorse extends MetodoCriptografia {

    // Mapeamento de caracteres para código Morse
    private static final String[] MORSE_CODE = {
            ".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---", "-.-",
            ".-..", "--", "-.", "---", ".--.", "--.-", ".-.", "...", "-", "..-", "...-",
            ".--", "-..-", "-.--", "--..", ".----", "..---", "...--", "....-", ".....",
            "-....", "--...", "---..", "----.", "-----", "/"
    };
    private static final char[] ALPHABET = {
            'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o',
            'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '1', '2', '3', '4',
            '5', '6', '7', '8', '9', '0', ' '
    };

    @Override
    public String criptografar(String texto) {
        StringBuilder resultado = new StringBuilder();
        texto = texto.toLowerCase();
        for (char caractere : texto.toCharArray()) {
            int index = getIndex(caractere);
            if (index != -1) {
                resultado.append(MORSE_CODE[index]).append(" ");
            } else {
                resultado.append(caractere).append(" "); // Se o caractere não estiver no mapa, mantém-se inalterado
            }
        }
        return resultado.toString();
    }

    @Override
    public String descriptografar(String texto) {
        StringBuilder resultado = new StringBuilder();
        String[] palavras = texto.split(" / "); // Assume que as palavras são separadas por " / "
        for (String palavra : palavras) {
            String[] letras = palavra.split(" ");
            for (String letra : letras) {
                resultado.append(getCharacter(letra));
            }
            resultado.append(" ");
        }
        return resultado.toString().toUpperCase().trim();
    }

    // Método auxiliar para obter o índice de um caractere no array ALPHABET
    private int getIndex(char caractere) {
        for (int i = 0; i < ALPHABET.length; i++) {
            if (ALPHABET[i] == caractere) {
                return i;
            }
        }
        return -1; // Retorna -1 se o caractere não for encontrado
    }

    // Método auxiliar para obter o caractere correspondente a um código Morse
    private char getCharacter(String morse) {
        for (int i = 0; i < MORSE_CODE.length; i++) {
            if (MORSE_CODE[i].equals(morse)) {
                return ALPHABET[i];
            }
        }
        return '?'; // Retorna '?' se o código Morse não for encontrado
    }
}
