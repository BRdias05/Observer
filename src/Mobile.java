//concrete subscriber

public record Mobile(String username) implements Lista {
        @Override
        public void atualiza(Evento tipodeEvento) {
            System.out.println("Notificação enviada por app no celular para " + username + " sobre " + tipodeEvento);
        }
}
