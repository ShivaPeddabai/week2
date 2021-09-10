package shortglassesfactory.abstractfactorydesign;

public class MaterialTypeFactory extends SourceGlassFactory{

	@Override
	public MadeOf getMaterialInfo(String material) {
		if(material.equals("Glass"))
			return new Glass();
		else if(material.equals("Bronze"))
			return new Bronze();
		else if(material.equals("Plastic"))
			return new Plastic();
		else
			return null;
	}

	@Override
	public ServedFor getUseageInfo(String type) {
		return null;
	}

	@Override
	public Shape getShapeInfo(String shape) {
		return null;
	}
	

}
