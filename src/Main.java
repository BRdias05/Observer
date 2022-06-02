public class Main {
        public static void main(String[] args) {

            Loja loja = new Loja();
            loja.getServico().inscrever(Evento.NOVO_ITEM, new Email("ana@gmail.com"));
            loja.getServico().inscrever(Evento.OFERTA, new Email("ana@gmail.com"));
            loja.getServico().inscrever(Evento.OFERTA, new Email("ana@gmail.com"));
            loja.getServico().inscrever(Evento.NOVO_ITEM, new Mobile("Ana"));

            loja.notificaNovoItem();

            System.out.println("===============================================================");

            loja.notificaOferta();

            System.out.println("===============================================================");

            loja.getServico().desinscrever(Evento.OFERTA, new Email("ana@gmail.com"));
            loja.notificaOferta();
        }
    }