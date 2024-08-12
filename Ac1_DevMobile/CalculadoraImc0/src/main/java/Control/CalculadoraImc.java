package Control;

public class CalculadoraImc {

    public String calcularImc(double altura, double peso, int idade, String sexo) {
        double imc = peso / altura * altura;

        if (idade >= 18 && idade < 65) {
            if (imc < 16) {
                return "Baixo Peso Muito Grave";
            } else if (imc >= 16.1 && imc <= 16.99) {
                return "Baixo Peso Grave";
            } else if (imc >= 17 & imc <= 18.49) {
                return "Baixo Peso";
            } else if (imc >= 18.50 && imc <= 24.99) {
                return "Peso Normal";
            } else if (imc >= 25 && imc <= 29.99) {
                return "Sobrepeso";
            } else if (imc >= 30 && imc <= 34.99) {
                return "Obesidade Grau I";
            } else if (imc >= 35 && imc <= 39.99) {
                return "Obesidade Grau II";
            } else if (imc > 40) {
                return "Obesidade Grau III (Obesidade Mórbida)";
            }
        } else if (idade >= 65) {
            if (sexo.equalsIgnoreCase("feminino")) {
                if (imc < 21.9) {
                    return "Baixo Peso";
                } else if (imc >= 22 && imc <= 27) {
                    return "Peso Normal";
                } else if (imc >= 27.1 && imc <= 32) {
                    return "Sobrepeso";
                } else if (imc >= 32.1 && imc <= 37) {
                    return "Obesidade Grau I";
                } else if (imc >= 37.1 && imc <= 41.9) {
                    return "Obesidade Grau II";
                } else if (imc > 42) {
                    return "Obesidade Grau III (Obesidade Mórbida)";
                }
            } else if (sexo.equalsIgnoreCase("masculino")) {
                if (imc < 21.9) {
                    return "Baixo Peso";
                } else if (imc >= 22 && imc <= 27) {
                    return "Peso Normal";
                } else if (imc >= 27.1 && imc <= 30) {
                    return "Sobrepeso";
                } else if (imc >= 30.1 && imc <= 35) {
                    return "Obesidade Grau I";
                } else if (imc >= 35.1 && imc <= 39.9) {
                    return "Obesidade Grau II";
                } else if (imc > 40) {
                    return "Obesidade Grau III(Obesidade Mórbida)";
                }
            }
        } else if (idade == 1 || idade == 2) {
            if (sexo.equalsIgnoreCase("masculino")) {
                if (imc < 14.8) {
                    return "Baixo Peso";
                } else if (imc >= 14.8 && imc < 18.2) {
                    return "Peso Normal";
                } else if (imc >= 18.2 && imc < 19.2) {
                    return "Sobrepeso";
                } else if (imc >= 19.2) {
                    return "Obesidade";
                }
            } else if (sexo.equalsIgnoreCase("feminino")) {
                if (imc < 14.4) {
                    return "Baixo Peso";
                } else if (imc >= 14.4 && imc < 18) {
                    return "Peso Normal";
                } else if (imc >= 18 && imc < 19) {
                    return "Sobrepeso";
                } else if (imc >= 19) {
                    return "Obesidade";
                }
            }
        } else if (idade == 3 || idade == 4) {
            if (sexo.equalsIgnoreCase("masculino")) {
                if (imc < 14) {
                    return "Baixo Peso";
                } else if (imc >= 14 && imc < 16.8) {
                    return "Peso Normal";
                } else if (imc >= 16.8 && imc < 17.8) {
                    return "Sobrepeso";
                } else if (imc >= 17.8) {
                    return "Obesidade";
                }
            } else if (sexo.equalsIgnoreCase("feminino")) {
                if (imc > 13.6) {
                    return "Baixo Peso";
                } else if (imc >= 13.6 && imc < 16.8) {
                    return "Peso Normal";
                } else if (imc >= 16.8 && imc < 18) {
                    return "Sobrepeso";
                } else if (imc >= 18) {
                    return "Obesidade";
                }
            }
        } else if (idade == 5 || idade == 6) {
            if (sexo.equalsIgnoreCase("masculino")) {
                if (imc < 13.8) {
                    return "Baixo Peso";
                } else if (imc >= 13.8 && imc < 17) {
                    return "Peso Normal";
                } else if (imc >= 17 && imc < 18.4) {
                    return "Sobrepeso";
                } else if (imc >= 18.4) {
                    return "Obesidade";
                }
            }
            if (sexo.equalsIgnoreCase("feminino")) {
                if (imc < 13.4) {
                    return "Baixo Peso";
                } else if (imc >= 13.4 && imc < 17) {
                    return "Peso Normal";
                } else if (imc >= 17 && imc < 18.6) {
                    return "Sobrepeso";
                } else if (imc >= 18.6) {
                    return "Obesidade";
                }
            }
        } else if (idade == 7 || idade == 8) {
            if (sexo.equalsIgnoreCase("masculino")) {
                if (imc < 13.8) {
                    return "Baixo Peso";
                } else if (imc >= 13.8 && imc < 17.8) {
                    return "Peso Normal";
                } else if (imc >= 17.8 && imc < 20) {
                    return "Sobrepeso";
                } else if (imc >= 20) {
                    return "Obesidade";
                }
            } else if (sexo.equalsIgnoreCase("feminino")) {
                if (imc < 13.4) {
                    return "Baixo Peso";
                } else if (imc >= 13.4 && imc < 18.4) {
                    return "Peso Normal";
                } else if (imc >= 18.4 && imc < 20.8) {
                    return "Sobrepeso";
                } else if (imc >= 20.8) {
                    return "Obesidade";
                }
            }
        } else if (idade == 9 || idade == 10) {
            if (sexo.equalsIgnoreCase("masculino")) {
                if (imc < 14.2) {
                    return "Baixo Peso";
                } else if (imc >= 14.2 && imc < 19.4) {
                    return "Peso Normal";
                } else if (imc >= 19.4 && imc < 22) {
                    return "Sobrepeso";
                } else if (imc >= 22) {
                    return "Obesidade";
                }
            } else if (sexo.equalsIgnoreCase("feminino")) {
                if (imc < 14) {
                    return "Baixo Peso";
                } else if (imc >= 14 && imc < 20) {
                    return "Peso Normal";
                } else if (imc >= 20 && imc < 23) {
                    return "Sobrepeso";
                } else if (imc >= 23) {
                    return "Obesidade";
                }
            }
        } else if (idade == 11 || idade == 12) {
            if (sexo.equalsIgnoreCase("masculino")) {
                if (imc < 15) {
                    return "Baixo Peso";
                } else if (imc >= 15 && imc < 21) {
                    return "Peso Normal";
                } else if (imc >= 21 && imc < 24.2) {
                    return "Sobrepeso";
                } else if (imc >= 24.2) {
                    return "Obesidade";
                }
            } else if (sexo.equalsIgnoreCase("feminino")) {
                if (imc < 14.8) {
                    return "Baixo Peso";
                } else if (imc >= 14.8 && imc < 21.6) {
                    return "Peso Normal";
                } else if (imc >= 21.6 && imc < 25.2) {
                    return "Sobrepeso";
                } else if (imc >= 25.2) {
                    return "Obesidade";
                }
            }
        }
        return "Não Classificado";
    }
}