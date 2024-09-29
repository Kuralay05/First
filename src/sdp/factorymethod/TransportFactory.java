package sdp.factorymethod;

public abstract class TransportFactory {
        public abstract Transport createTransport();

        public void planDelivery() {
            Transport transport = createTransport();
            transport.deliver();
        }
}

