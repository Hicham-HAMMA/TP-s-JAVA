package ma.education.tp.abstarctkeyword;

public class Test {
    public static void main(String[] args) {
        FormeGeometrique f1 = new FormeGeometrique() {
            @Override
            public double calculerSurface() {
                return 0;
            }
        };
        FormeGeometrique f2 = new FormeGeoTypeA() {
            @Override
            public double calculerSurface() {
                return 0;
            }
        };
        FormeGeometrique f3 = new Triangle() {
            @Override
            public double calculerSurface() {
                return 0;
            }
        };
        FormeGeometrique f4 = new FormeGeometrique() {
            @Override // Classe fille Annonyme
            public double calculerSurface() {
                return 22;
            }
        };
    }
}