package shortglassesfactory.abstractfactorydesign;

public class TestApplication {

	public static void main(String[] args) {
SourceGlassFactory madeof=FactoryCreator.getSourceGlassFactory("material");
System.out.println(madeof.getMaterialInfo("Glass").getMaterial());

SourceGlassFactory usage=FactoryCreator.getSourceGlassFactory("servedfor");
System.out.println(usage.getUseageInfo("Coffee").usedFor());

SourceGlassFactory shape=FactoryCreator.getSourceGlassFactory("shape");
System.out.println(shape.getShapeInfo("HighballGlass").getShape());

		
	}

}
