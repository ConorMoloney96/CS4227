package consumables.toppings;

import consumables.decorators.Consumable;
import consumables.decorators.ToppingDecorator;

public class Chicken extends ToppingDecorator
{
    public Chicken(Consumable parent)
    {
        super(parent);
    }

    @Override
    public String getName()
    {
        return parent.getName() + " Chicken";
    }

    @Override
    public double getCost()
    {
        return parent.getCost() + 1;
    }
}