/*• Al caminar la armadura hará un uso básico de las botas y se consumirá la energía
establecida como consumo en la bota por el tiempo en el que se camine.
• Al correr la armadura hará un uso normal de las botas y se consumirá el doble de la
energía establecida como consumo en la bota por el tiempo en el que se corra.
• Al propulsarse la armadura hará un uso intensivo de las botas utilizando el triple de la
energía por el tiempo que dure la propulsión.
• Al volar la armadura hará un uso intensivo de las botas y de los guantes un uso normal
consumiendo el triple de la energía establecida para las botas y el doble para los
guantes.
• Al utilizar los guantes como armas el consumo se triplica durante el tiempo del
disparo.

• Cada vez que se escribe en la consola o se habla a través del sintetizador se
consume lo establecido en estos dispositivos. Solo se usa en nivel básico.
• Cada vez que se efectúa una acción se llama a los métodos usar del dispositivo se le
pasa el tiempo. El dispositivo debe retornar la energía
consumida y la armadura deberá informar al generador se ha consumido esa
cantidad de energía.*/
package entidad;

public class Armadura {

    private int bota = 10;
    private int guante = 10;
    private int consola = 5;
    private int sintetizador = 5;
    private int nivelSalud = 100;
    private int energia = 1000000000;
    public boolean botOp = true;
    public boolean guanOp = true;
    public boolean cascoOp = true;

    public boolean isBotOp() {
        return botOp;
    }

    public void setBotOp(boolean botOp) {
        this.botOp = botOp;
    }

    public boolean isGuanOp() {
        return guanOp;
    }

    public void setGuanOp(boolean guanOp) {
        this.guanOp = guanOp;
    }

    public Armadura() {
    }

    public int getBota() {
        return bota;
    }

    public void setBota(int bota) {
        this.bota = bota;
    }

    public int getGuante() {
        return guante;
    }

    public void setGuante(int guante) {
        this.guante = guante;
    }

    public int getConsola() {
        return consola;
    }

    public void setConsola(int consola) {
        this.consola = consola;
    }

    public int getSintetizador() {
        return sintetizador;
    }

    public void setSintetizador(int sintetizador) {
        this.sintetizador = sintetizador;
    }

    public int getNivelSalud() {
        return nivelSalud;
    }

    public void setNivelSalud(int nivelSalud) {
        this.nivelSalud = nivelSalud;
    }

    public int getEnergia() {
        return energia;
    }

    public void setEnergia(int energia) {
        this.energia = energia;
    }

    public boolean isCascoOp() {
        return cascoOp;
    }

    public void setCascoOp(boolean cascoOp) {
        this.cascoOp = cascoOp;
    }
    
    

    public void caminar(int t) {

        if (botOp) {
            energia -= bota * t;
            System.out.println("Luego de esta accion la energia restante es: "+energia+" Joules");
            int num = (int) (Math.random() * 10) + 1;
            if (num <= 3) {
                botOp = false;
                System.out.println("Se rompieron las botas :(");
            }
        } else {
            System.out.println("RECORDA QUE LAS BOTAS ESTAN ROTAS!!!!");
        }
    }

    public void correr(int t) {

        if (botOp) {
            energia -= (bota * 2) * t;
            System.out.println("Luego de esta accion la energia restante es: "+energia+" Joules");
            int num = (int) (Math.random() * 10) + 1;
            if (num <= 3) {
                botOp = false;
                System.out.println("Se rompieron las botas :(");
            }
        } else {
            System.out.println("RECORDA QUE LAS BOTAS ESTAN ROTAS!!!!");
        }

    }

    public void propulsarse(int t) {
        if (botOp) {
            energia -= (bota * 3) * t;
            System.out.println("Luego de esta accion la energia restante es: "+energia+" Joules");
            int num = (int) (Math.random() * 10) + 1;
            if (num <= 3) {
                botOp = false;
                System.out.println("Se rompieron las botas :(");
            }
        } else {
            System.out.println("RECORDA QUE LAS BOTAS ESTAN ROTAS!!!!");
        }

    }

    public void volar(int t) {
        if (botOp) {
            
            if (guanOp) {
                energia -= ((bota * 3) + (guante * 2)) * t;
                System.out.println("Luego de esta accion la energia restante es: "+energia+" Joules");
                int num = (int) (Math.random() * 10) + 1;
                int num2 = (int) (Math.random() * 10) + 1;
                if (num <= 3) {
                    botOp = false;
                    System.out.println("Se rompieron las botas :(");
                }
                if (num2 <= 3) {
                    guanOp = false;
                    System.out.println("Se rompieron los guantes :(");
                }
            }else{
                System.out.println("RECORDA QUE LOS GUANTES ESTAN ROTOS!!!!");
            }

        } else {
            System.out.println("RECORDA QUE LAS BOTAS ESTAN ROTAS!!!!");
        }

    }

    public void armas(int t) {
         if (guanOp) {
            energia -= (guante * 3) * t;
            System.out.println("Luego de esta accion la energia restante es: "+energia+" Joules");
            int num = (int) (Math.random() * 10) + 1;
            if (num <= 3) {
                guanOp = false;
                System.out.println("Se rompieron los guantes :(");
            }
        } else {
            System.out.println("RECORDA QUE LOS GUANTES ESTAN ROTOS!!!!");
        }
        
    }

    public void consola() {
        if (cascoOp) {
          int num = (int) (Math.random() * 10) + 1;
            if (num <= 3) {
                cascoOp = false;
                System.out.println("Se rompó el casco :(");
            }
        } else {
            System.out.println("RECORDA QUE EL CASCO ESTA ROTO!!!!");
        }
         energia -= consola;
        System.out.println("Luego de esta accion la energia restante es: "+energia+" Joules");
    }

}
