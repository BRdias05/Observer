//publisher

import java.util.*;

public class Notifica {
        private final Map<Evento, List<Lista>> clientes;

        public Notifica() {
            clientes = new HashMap<>();
            Arrays.stream(Evento.values()).forEach(event -> clientes.put(event, new ArrayList<>()));
        }

        public void inscrever(Evento tipoDeEvento, Lista lista) {
            clientes.get(tipoDeEvento).add(lista);
        }

        public void desinscrever(Evento tipoDeEvento, Lista lista) {
            clientes.get(tipoDeEvento).remove(lista);
        }

        public void notificarClientes(Evento tipoDeEvento) {
            clientes.get(tipoDeEvento).forEach(listener -> listener.atualiza(tipoDeEvento));
        }
    }