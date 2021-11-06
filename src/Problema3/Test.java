package Problema3;


public class Test {
    public static void main (String[] args) {

        Asesor asesor1 = new Asesor ("48273864", "Felipe", "Flores", "18/05/1992", "Ing.Software", 32, 10.15,120);
        Asesor asesor2 =new Asesor ("45302576","Marcelo","Diaz","20/05/1989","Arquitecto",20,10.36,130);
        Colaborador colaborador1 = new Colaborador ("75193564", "Jhon", "Diaz", "15/01/1987", "Contador", 46, 7.40);

        Proyecto proyecto1 = new Proyecto ("U4015", "Ensamblaje", "2020", 10000,"Sur");

       proyecto1.registrar (asesor1);
       proyecto1.registrar (asesor2);
       proyecto1.registrar (colaborador1);

       System.out.println (proyecto1.listarSegunTipo ("Asesor"));
       System.out.println (proyecto1.listarSegunTipo ("Colaborador"));
        System.out.println ("La suma de todos los sueldos no supera el presupuesto del proyecto?\n");
       System.out.println (proyecto1.validarPresupuesto ());







    }
}
