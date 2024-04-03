package org.criptografia;

// Subclasse para representar a cifra de César
class CifraDeCesar extends MetodoCriptografia {
    private int chave;

    public CifraDeCesar(int chave) {
        this.chave = chave;
    }

    @Override
    public String criptografar(String texto) {
        StringBuilder resultado = new StringBuilder();
        for (int i = 0; i < texto.length(); i++) {
            char caractere = texto.charAt(i);
            if (Character.isLetter(caractere)) {
                char novoCaractere = (char) (((caractere - 'a' + chave) % 26) + 'a');
                resultado.append(novoCaractere);
            } else {
                resultado.append(caractere);
            }
        }
        return resultado.toString();
    }

    @Override
    public String descriptografar(String texto) {
        this.chave = chave * -1;
        return criptografar(texto); // A descriptografia é o processo inverso da criptografia na cifra de César
    }
}