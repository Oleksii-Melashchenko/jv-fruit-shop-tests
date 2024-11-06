package core.basesyntax.stategy;

import core.basesyntax.model.FruitTransaction;
import java.util.Map;

public class BalanceHandler implements FruitOperationHandler {
    @Override
    public void executeOperation(FruitTransaction fruitTransaction,
                                 Map<String, Integer> inventory) {
        String fruit = fruitTransaction.getFruit();
        int newQuantity = fruitTransaction.getQuantity();
        if (newQuantity < 0) {
            throw new IllegalArgumentException("Insufficient stock for "
                    + fruitTransaction.getFruit());
        }
        inventory.put(fruit, newQuantity);
    }
}
