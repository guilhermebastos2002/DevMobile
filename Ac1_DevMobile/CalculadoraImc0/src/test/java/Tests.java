import Control.CalculadoraImc;
import org.junit.Assert;
import org.junit.Test;

public class Tests {
    @Test
    public void testCrianca2AnosBaixoPesoMasculino() {
        Assert.assertEquals("Baixo Peso", new CalculadoraImc().calcularImc(1.0, 10, 2, "masculino"));
    }
    @Test
    public void testCrianca2AnosPesoNormalMasculino() {
        Assert.assertEquals("Peso Normal", new CalculadoraImc().calcularImc(1.0, 15, 2, "masculino"));
    }
    @Test
    public void testCrianca2AnosSobrepesoMasculino() {
        Assert.assertEquals("Sobrepeso", new CalculadoraImc().calcularImc(1.0 , 19, 2, "masculino"));
    }
    @Test
    public void testCrianca2AnosObesidadeMasculino() {
        Assert.assertEquals("Obesidade", new CalculadoraImc().calcularImc(1.0, 20, 2, "masculino"));
    }
    @Test
    public void testCrianca2AnosBaixoPesoFeminino() {
        Assert.assertEquals("Baixo Peso", new CalculadoraImc().calcularImc(1.0, 10, 2, "feminino"));
    }
    @Test
    public void testCrianca2AnosPesoNormalFeminino() {
        Assert.assertEquals("Peso Normal", new CalculadoraImc().calcularImc(1.0, 15, 2, "feminino"));
    }
    @Test
    public void testCrianca2AnosSobrepesoFeminino() {
        Assert.assertEquals("Sobrepeso", new CalculadoraImc().calcularImc(1, 18, 2, "feminino"));
    }
    @Test
    public void testCrianca2AnosObesidadeFeminino() {
        Assert.assertEquals("Obesidade", new CalculadoraImc().calcularImc(1, 19, 2, "feminino"));
    }
    @Test
    public void testCrianca4AnosBaixoPesoMasculino() {
        Assert.assertEquals("Baixo Peso", new CalculadoraImc().calcularImc(1.20, 23, 4, "masculino"));
    }
    @Test
    public void testCrianca4AnosPesoNormalMasculino() {
        Assert.assertEquals("Peso Normal", new CalculadoraImc().calcularImc(1.20, 23, 4, "masculino"));
    }
    @Test
    public void testCrianca4AnosSobrepesoMasculino() {
        Assert.assertEquals("Sobrepeso", new CalculadoraImc().calcularImc(1.20, 25, 4, "masculino"));
    }
    @Test
    public void testCrianca4AnosObesidadeMasculino() {
        Assert.assertEquals("Obesidade", new CalculadoraImc().calcularImc(1.20, 30, 4, "masculino"));
    }
    @Test
    public void testCrianca4AnosBaixoPesoFeminino() {
        Assert.assertEquals("Baixo Peso", new CalculadoraImc().calcularImc(1.20, 15, 4, "feminino"));
    }
    @Test
    public void testCrianca4AnosPesoNormalFeminino() {
        Assert.assertEquals("Peso Normal", new CalculadoraImc().calcularImc(1.20, 22, 4, "feminino"));
    }
    @Test
    public void testCrianca4AnosSobrepesoFeminino() {
        Assert.assertEquals("Sobrepeso", new CalculadoraImc().calcularImc(1.20, 25, 4, "feminino"));
    }
    @Test
    public void testCrianca4AnosObesidadeFeminino() {
        Assert.assertEquals("Obesidade", new CalculadoraImc().calcularImc(1.20, 30, 4, "feminino"));
    }
    @Test
    public void testCrianca6AnosBaixoPesoMasculino() {
        Assert.assertEquals("Baixo Peso", new CalculadoraImc().calcularImc(1.40, 25, 6, "masculino"));
    }
    @Test
    public void testCrianca6AnosPesoNormalMasculino() {
        Assert.assertEquals("Peso Normal", new CalculadoraImc().calcularImc(1.40, 30, 6, "masculino"));
    }
    @Test
    public void testCrianca6AnosSobrepesoMasculino() {
        Assert.assertEquals("Sobrepeso", new CalculadoraImc().calcularImc(1.40, 35, 6, "masculino"));
    }
    @Test
    public void testCrianca6AnosObesidadeMasculino() {
        Assert.assertEquals("Obesidade", new CalculadoraImc().calcularImc(1.40, 40, 6, "masculino"));
    }
    @Test
    public void testCrianca6AnosBaixoPesoFeminino() {
        Assert.assertEquals("Baixo Peso", new CalculadoraImc().calcularImc(1.40, 25, 6, "feminino"));
    }
    @Test
    public void testCrianca6AnosPesoNormalFeminino() {
        Assert.assertEquals("Peso Normal", new CalculadoraImc().calcularImc(1.40, 30, 6, "feminino"));
    }
    @Test
    public void testCrianca6AnosSobrepesoFeminino() {
        Assert.assertEquals("Sobrepeso", new CalculadoraImc().calcularImc(1.40, 35, 6, "feminino"));
    }
    @Test
    public void testCrianca6AnosObesidadeFeminino() {
        Assert.assertEquals("Obesidade", new CalculadoraImc().calcularImc(1.40, 40, 6, "feminino"));
    }
    @Test
    public void testCrianca8AnosBaixoPesoMasculino() {
        Assert.assertEquals("Baixo Peso", new CalculadoraImc().calcularImc(1.50, 25, 8, "masculino"));
    }
    @Test
    public void testCrianca8AnosPesoNormalMasculino() {
        Assert.assertEquals("Peso Normal", new CalculadoraImc().calcularImc(1.50, 35, 8, "masculino"));
    }
    @Test
    public void testCrianca8AnosSobrepesoMasculino() {
        Assert.assertEquals("Sobrepeso", new CalculadoraImc().calcularImc(1.50, 43, 8, "masculino"));
    }
    @Test
    public void testCrianca8AnosObesidadeMasculino() {
        Assert.assertEquals("Obesidade", new CalculadoraImc().calcularImc(1.50, 50, 8, "masculino"));
    }
    @Test
    public void testCrianca8AnosBaixoPesoFeminino() {
        Assert.assertEquals("Baixo Peso", new CalculadoraImc().calcularImc(1.50, 25, 8, "feminino"));
    }
    @Test
    public void testCrianca8AnosPesoNormalFeminino() {
        Assert.assertEquals("Peso Normal", new CalculadoraImc().calcularImc(1.50, 35, 8, "feminino"));
    }
    @Test
    public void testCrianca8AnosSobrepesoFeminino() {
        Assert.assertEquals("Sobrepeso", new CalculadoraImc().calcularImc(1.50, 43, 8, "feminino"));
    }
    @Test
    public void testCrianca8AnosObesidadeFeminino() {
        Assert.assertEquals("Obesidade", new CalculadoraImc().calcularImc(1.50, 50, 8, "feminino"));
    }
    @Test
    public void testCrianca10AnosBaixoPesoMasculino() {
        Assert.assertEquals("Baixo Peso", new CalculadoraImc().calcularImc(1.50, 30, 10, "masculino"));
    }
    @Test
    public void testCrianca10AnosPesoNormalMasculino() {
        Assert.assertEquals("Peso Normal", new CalculadoraImc().calcularImc(1.50, 35, 10, "masculino"));
    }
    @Test
    public void testCrianca10AnosSobrepesoMasculino() {
        Assert.assertEquals("Sobrepeso", new CalculadoraImc().calcularImc(1.50, 45, 10, "masculino"));
    }
    @Test
    public void testCrianca10AnosObesidadeMasculino() {
        Assert.assertEquals("Obesidade", new CalculadoraImc().calcularImc(1.50, 55, 10, "masculino"));
    }
    @Test
    public void testCrianca10AnosBaixoPesoFeminino() {
        Assert.assertEquals("Baixo Peso", new CalculadoraImc().calcularImc(1.50, 25, 10, "feminino"));
    }
    @Test
    public void testCrianca10AnosPesoNormalFeminino() {
        Assert.assertEquals("Peso Normal", new CalculadoraImc().calcularImc(1.50, 35, 10, "feminino"));
    }
    @Test
    public void testCrianca10AnosSobrepesoFeminino() {
        Assert.assertEquals("Sobrepeso", new CalculadoraImc().calcularImc(1.50, 45, 10, "feminino"));
    }
    @Test
    public void testCrianca10AnosObesidadeFeminino() {
        Assert.assertEquals("Obesidade", new CalculadoraImc().calcularImc(1.50, 55, 10, "feminino"));
    }
    @Test
    public void testCrianca12AnosBaixoPesoMasculino() {
        Assert.assertEquals("Baixo Peso", new CalculadoraImc().calcularImc(1.60, 35, 12, "masculino"));
    }
    @Test
    public void testCrianca12AnosPesoNormalMasculino() {
        Assert.assertEquals("Peso Normal", new CalculadoraImc().calcularImc(1.60, 40, 12, "masculino"));
    }
    @Test
    public void testCrianca12AnosSobrepesoMasculino() {
        Assert.assertEquals("Sobrepeso", new CalculadoraImc().calcularImc(1.60, 60, 12, "masculino"));
    }
    @Test
    public void testCrianca12AnosObesidadeMasculino() {
        Assert.assertEquals("Obesidade", new CalculadoraImc().calcularImc(1.60, 65, 12, "masculino"));
    }
    @Test
    public void testCrianca12AnosBaixoPesoFeminino() {
        Assert.assertEquals("Baixo Peso", new CalculadoraImc().calcularImc(1.60, 30, 12, "feminino"));
    }
    @Test
    public void testCrianca12AnosPesoNormalFeminino() {
        Assert.assertEquals("Peso Normal", new CalculadoraImc().calcularImc(1.60, 40, 12, "feminino"));
    }
    @Test
    public void testCrianca12AnosSobrepesoFeminino() {
        Assert.assertEquals("Sobrepeso", new CalculadoraImc().calcularImc(1.60, 60, 12, "feminino"));
    }
    @Test
    public void testCrianca12AnosObesidadeFeminino() {
        Assert.assertEquals("Obesidade", new CalculadoraImc().calcularImc(1.60, 70, 12, "feminino"));
    }
    @Test
    public void testAdultoBaixoPesoMuitoGraveMasculino() {
        Assert.assertEquals("Baixo Peso Muito Grave", new CalculadoraImc().calcularImc(1.70, 40.0, 25, "masculino"));
    }
    @Test
    public void testAdultoBaixoPesoGraveMasculino() {
        Assert.assertEquals("Baixo Peso Grave", new CalculadoraImc().calcularImc(1.70, 45.0, 25, "masculino"));
    }
    @Test
    public void testAdultoBaixoPesoMasculino() {
        Assert.assertEquals("Baixo Peso", new CalculadoraImc().calcularImc(1.70, 50, 25, "masculino"));
    }
    @Test
    public void testAdultoPesoNormalMasculino() {
        Assert.assertEquals("Peso Normal", new CalculadoraImc().calcularImc(1.70, 55, 25, "masculino"));
    }
    @Test
    public void testAdultoSobrepesoMasculino() {
        Assert.assertEquals("Sobrepeso", new CalculadoraImc().calcularImc(1.70, 75  , 25, "masculino"));
    }
    @Test
    public void testAdultoObesidadeGrauIMasculino() {
        Assert.assertEquals("Obesidade Grau I", new CalculadoraImc().calcularImc(1.70, 90, 25, "masculino"));
    }
    @Test
    public void testAdultoObesidadeGrauIIMasculino() {
        Assert.assertEquals("Obesidade Grau II", new CalculadoraImc().calcularImc(1.70, 105, 25, "masculino"));
    }
    @Test
    public void testAdultoObesidadeGrauIIIMasculino() {
        Assert.assertEquals("Obesidade Grau III(Obesidade Mórbida)", new CalculadoraImc().calcularImc(1.70, 120, 25, "masculino"));
    }
    @Test
    public void testAdultoBaixoPesoMuitoGraveFeminino() {
        Assert.assertEquals("Baixo Peso Muito Grave", new CalculadoraImc().calcularImc(1.70, 40, 25, "feminino"));
    }
    @Test
    public void testAdultoBaixoPesoGraveFeminino() {
        Assert.assertEquals("Baixo Peso Grave", new CalculadoraImc().calcularImc(1.70, 45, 25, "feminino"));
    }
    @Test
    public void testAdultoBaixoPesoFeminino() {
        Assert.assertEquals("Baixo Peso", new CalculadoraImc().calcularImc(1.70, 50, 25, "feminino"));
    }
    @Test
    public void testAdultoPesoNormalFeminino() {
        Assert.assertEquals("Peso Normal", new CalculadoraImc().calcularImc(1.70, 55, 25, "feminino"));
    }
    @Test
    public void testAdultoSobrepesoFeminino() {
        Assert.assertEquals("Sobrepeso", new CalculadoraImc().calcularImc(1.70, 75, 25, "feminino"));
    }
    @Test
    public void testAdultoObesidadeGrauIFeminino() {
        Assert.assertEquals("Obesidade Grau I", new CalculadoraImc().calcularImc(1.70, 90, 25, "feminino"));
    }
    @Test
    public void testAdultoObesidadeGrauIIFeminino() {
        Assert.assertEquals("Obesidade Grau II", new CalculadoraImc().calcularImc(1.70, 105, 25, "feminino"));
    }
    @Test
    public void testAdultoObesidadeGrauIIIFeminino() {
        Assert.assertEquals("Obesidade Grau III(Obesidade Mórbida)", new CalculadoraImc().calcularImc(1.70, 120, 25, "feminino"));
    }
    @Test
    public void testIdosoBaixoPesoFeminino() {
        Assert.assertEquals("Baixo Peso", new CalculadoraImc().calcularImc(1.70, 60, 70, "feminino"));
    }
    @Test
    public void testIdosoPesoNormalFeminino() {
        Assert.assertEquals("Peso Normal", new CalculadoraImc().calcularImc(1.70, 70, 70, "feminino"));
    }
    @Test
    public void testIdosoSobrepesoFeminino() {
        Assert.assertEquals("Sobrepeso", new CalculadoraImc().calcularImc(1.70, 80, 70, "feminino"));
    }
    @Test
    public void testIdosoObesidadeGrauIFeminino() {
        Assert.assertEquals("Obesidade Grau I", new CalculadoraImc().calcularImc(1.70, 100, 70, "feminino"));
    }
    @Test
    public void testIdosoObesidadeGrauIIFeminino() {
        Assert.assertEquals("Obesidade Grau II", new CalculadoraImc().calcularImc(1.70, 110, 70, "feminino"));
    }
    @Test
    public void testIdosoObesidadeGrauIIIFeminino() {
        Assert.assertEquals("Obesidade Grau III(Obesidade Mórbida)", new CalculadoraImc().calcularImc(1.70, 120, 70, "feminino"));
    }
    @Test
    public void testIdosoBaixoPesoMasculino() {
        Assert.assertEquals("Baixo Peso", new CalculadoraImc().calcularImc(1.70, 60, 70, "masculino"));
    }
    @Test
    public void testIdosoPesoNormalMasculino() {
        Assert.assertEquals("Peso Normal", new CalculadoraImc().calcularImc(1.70, 70, 70, "masculino"));
    }
    @Test
    public void testIdosoSobrepesoMasculino() {
        Assert.assertEquals("Sobrepeso", new CalculadoraImc().calcularImc(1.70, 80, 70, "masculino"));
    }
    @Test
    public void testIdosoObesidadeGrauIMasculino() {
        Assert.assertEquals("Obesidade Grau I", new CalculadoraImc().calcularImc(1.70, 100, 70, "masculino"));
    }
    @Test
    public void testIdosoObesidadeGrauIIMasculino() {
        Assert.assertEquals("Obesidade Grau II", new CalculadoraImc().calcularImc(1.70, 105, 70, "masculino"));
    }
    @Test
    public void testIdosoObesidadeGrauIIIMasculino() {
        Assert.assertEquals("Obesidade Grau III(Obesidade Mórbida)", new CalculadoraImc().calcularImc(1.70, 120, 70, "masculino"));
    }

}
