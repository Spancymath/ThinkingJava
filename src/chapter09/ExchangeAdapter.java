package chapter09;

/**
 * 适配器
 */
public class ExchangeAdapter implements Processor {

    Exchange exchange;

    public ExchangeAdapter(Exchange exchange) {
        this.exchange = exchange;
    }

    @Override
    public String name() {
        return exchange.name();
    }

    @Override
    public Object prcess(Object input) {
        return exchange.process((String) input);
    }
}
