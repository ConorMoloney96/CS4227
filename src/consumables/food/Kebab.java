package consumables.food;

import consumables.Size;
import consumables.decorators.Consumable;
import consumables.decorators.FoodDecorator;

public class Kebab extends FoodDecorator
{
	public Kebab(Consumable parent)
	{
		super(parent);
	}
	
	public Kebab(Consumable parent, Size size)
	{
		super(parent, size);
	}
	
	@Override
	public String getName()
	{
		return parent.getName() + " Kebab";
	}
	
	@Override
	public double getCost()
	{
		return parent.getCost() + 1;
	}
}
