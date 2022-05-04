package core.basesyntax.strategy;

import core.basesyntax.db.Storage;
import core.basesyntax.model.Fruit;

public class ReturnOperationHandler implements OperationHandler {
    @Override
    public void process(Fruit fruit, Integer quantity) {
        Storage.storage.compute(fruit, (k, v) ->
                (v == null) ? quantity : v + quantity);
    }
}
