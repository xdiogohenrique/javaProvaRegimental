package provaregimental;

public class Motorista extends Pessoa {

    public double numCnh;
    public double salario;
    public String catCnh;
    private double valorFerias;

    public Motorista() {
    }
    
    

    public Motorista(double numCnh, double salario, String catCnh) {
        this.numCnh = numCnh;
        this.salario = salario;
        this.catCnh = catCnh;
    }

    public double getNumCnh() {
        return numCnh;
    }

    public void setNumCnh(int numCnh) {
        this.numCnh = numCnh;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getCatCnh() {
        return catCnh;
    }

    public void setCatCnh(String catCnh) {
        this.catCnh = catCnh;
    }

    @Override
    public String toString() {
        return "Motorista{" + "numCnh=" + numCnh + ", salario=" + salario + ", catCnh=" + catCnh + '}';
    }
    
    public double calculoFerias(){
        valorFerias = salario + (salario/3);
        System.out.println("O valor das suas férias será: " + valorFerias);
        return valorFerias;
        
    }
    
    public void qtdDeDiasDeFerias(){
    
        if (catCnh.equalsIgnoreCase("A")){
            System.out.println("A quantidade de dias de férias será: 28 Dias");
        }else{
            if(catCnh.equalsIgnoreCase("B")){
                System.out.println("A quantidade de dias de férias será: 29 Dias");
            }else{
                if(catCnh.equalsIgnoreCase("C")){
                    System.out.println("A quantidade de dias de férias será: 30 Dias");
                }else{
                    if(catCnh.equalsIgnoreCase("D")){
                        System.out.println("A quantidade de dias de férias será: 31 Dias");
                    }else{
                        if(catCnh.equalsIgnoreCase("E")){
                            System.out.println("A quantidade de dias de férias será: 31 Dias");
                        }
                    }
                }
            }
        }
        
    }
    
    public void cartaC(){
    
        if (catCnh =="C" || salario > 2000){
            System.out.println(nome);
            System.out.println(salario);
            System.out.println(idade);
            System.out.println(peso);
            System.out.println(numCnh);
            System.out.println(catCnh);
        }else{
            System.out.println("Você não tem direito a esse beneficio");
        }
    }
    
}
