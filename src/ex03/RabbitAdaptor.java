package ex03;

import ex03.lib.OuterRabbit;

public class RabbitAdaptor extends Animal {
    private OuterRabbit outerRabbit;

    public RabbitAdaptor(OuterRabbit outerRabbit) {
        this.outerRabbit = outerRabbit;
    }

    @Override
    public String getName() {
        outerRabbit.getFullName();
        return null;
    }
}
