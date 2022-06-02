public class Loja {
        private final Notifica notifica;

        public Loja() {
            notifica = new Notifica();
        }

        public void  notificaNovoItem() {
            notifica.notificarClientes(Evento.NOVO_ITEM);
        }

        public void notificaOferta() {
            notifica.notificarClientes(Evento.OFERTA);
        }

        public Notifica getServico() {
            return notifica;
        }
    }