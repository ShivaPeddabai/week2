package shortglassesfactory.abstractfactorydesign;

public abstract class SourceGlassFactory {
   
	public abstract MadeOf getMaterialInfo(String material);
	public abstract ServedFor getUseageInfo(String type);
	public abstract Shape  getShapeInfo(String shape);	
}
