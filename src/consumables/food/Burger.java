package consumables.food;

import consumables.Size;
import consumables.decorators.Consumable;
import consumables.decorators.FoodDecorator;

public class Burger extends FoodDecorator
{
    public Burger(Consumable parent)
    {
        super(parent);
    }

    public Burger(Consumable parent, Size size)
    {
        super(parent, size);
    }

    @Override
    public String getName()
    {
        return parent.getName() + " Burger";
    }

    @Override
    public double getCost()
    {
        return parent.getCost() + 1;
    }
}