package shortglassesfactory.abstractfactorydesign;

public class ShapeFactory extends SourceGlassFactory{

	@Override
	public MadeOf getMaterialInfo(String material) {
		return null;
	}

	@Override
	public ServedFor getUseageInfo(String type) {
		return null;
	}

	@Override
	public Shape getShapeInfo(String shape) {
		if(shape.equals("Bottle"))
			return new Bottle();
		else if(shape.equals("HighballGlass"))
			return new HighballGlass();
		else
			return null;
	}
	

}
