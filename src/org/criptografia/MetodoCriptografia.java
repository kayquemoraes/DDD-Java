package org.criptografia;

// Superclasse para representar um método de criptografia
abstract class MetodoCriptografia {
    public abstract String criptografar(String texto);
    public abstract String descriptografar(String texto);
}
