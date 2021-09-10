package shortglassesfactory.abstractfactorydesign;

public class UsageFactory extends SourceGlassFactory{

	@Override
	public MadeOf getMaterialInfo(String material) {
		return null;
	}

	@Override
	public ServedFor getUseageInfo(String type) {
		if(type.equals("Water"))
			return new Water();
		else if(type.equals("Coffee"))
			return new Coffee();
		else if(type.equals("Alcohol"))
			return new Alcohol();
		else
			return null;
	}

	@Override
	public Shape getShapeInfo(String shape) {
		return null;
	}
	

}
