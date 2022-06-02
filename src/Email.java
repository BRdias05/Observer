//concrete subscriber

public record Email(String email) implements Lista {
    @Override
    public void atualiza(Evento tipoDeEvento) {
        System.out.println("Email enviado para " + email + " sobre " + tipoDeEvento);
    }
}
