package shortglassesfactory.abstractfactorydesign;

public class FactoryCreator {
	
public static SourceGlassFactory getSourceGlassFactory(String input)
	{
	   if(input.equals("material"))
		   return new MaterialTypeFactory();
	   else if(input.equals("servedfor"))
		   return new UsageFactory();
	   else if(input.equals("shape"))
		   return new ShapeFactory();
	   else
		   return null;
	}

}
