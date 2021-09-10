package shortglassesfactory.abstractfactorydesign;

public class Glass implements MadeOf{

	@Override
	public String getMaterial() {
		return "Made with Glass";
	}
	
}
