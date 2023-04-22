package provaregimental;

public class ProvaRegimental {

    public static void main(String[] args) {
        Motorista motorista1 = new Motorista();
        motorista1.nome = "João Victor";
        motorista1.idade = 29;
        motorista1.altura = 1.78f;
        motorista1.peso = 69;
        motorista1.numCnh = 2135687232;
        motorista1.catCnh = "B";
        motorista1.salario = 5800;
        motorista1.calculoFerias();
        motorista1.cartaC();
        
        Motorista motorista2 = new Motorista();
        motorista2.nome = "Guilherme";
        motorista2.idade = 32;
        motorista2.altura = 1.88f;
        motorista2.peso = 75;
        motorista2.numCnh = 528721325;
        motorista2.catCnh = "D";
        motorista2.salario = 7000;
        motorista2.calculoFerias();
        motorista2.cartaC();
        
        Motorista motorista3 = new Motorista();
        motorista3.nome = "Bernardo";
        motorista3.idade = 52;
        motorista3.altura = 1.67f;
        motorista3.peso = 65;
        motorista3.numCnh = 977866414;
        motorista3.catCnh = "C";
        motorista3.salario = 10000;
        motorista3.calculoFerias();
        motorista3.cartaC();
        
        Motorista motorista4 = new Motorista();
        motorista4.nome = "Arthur";
        motorista4.idade = 25;
        motorista4.altura = 1.72f;
        motorista4.peso = 68;
        motorista4.numCnh = 884537102;
        motorista4.catCnh = "A";
        motorista4.salario = 2500;
        motorista4.calculoFerias();
        motorista4.cartaC();
    }
    
}
