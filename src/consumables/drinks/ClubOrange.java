package consumables.drinks;

import consumables.Size;
import consumables.decorators.Consumable;
import consumables.decorators.DrinkDecorator;

public class ClubOrange extends DrinkDecorator
{
    public ClubOrange(Consumable parent)
    {
        super(parent);
    }

    public ClubOrange(Consumable parent, Size size)
    {
        super(parent, size);
    }

    @Override
    public String getName()
    {
        return parent.getName() + " Club Orange";
    }

    @Override
    public double getCost()
    {
        return parent.getCost() + 1;
    }
}
