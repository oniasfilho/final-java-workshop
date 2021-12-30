package com.mercadolivre;

import com.mercadolivre.Sealed.Employee;
import com.mercadolivre.Sealed.Manager;

public class Examples {


    public static String testSwitch(String nflPlayer){
        return switch(nflPlayer){
            case "Russel Wilson", "DK Metcalf" -> "Seattle Seahawks";
            case "Tom Brady" -> "Tampa Bay Buccaneers";
            default ->
                    throw new IllegalArgumentException("There is no " + nflPlayer + " in the NFL");
        };
    }

    public static void testTextBlocks(){
        String JSON_STRING
                = "{\r\n" + "\"name\" : \"Onias\",\r\n" + "\"website\" : \"https://www.whatever.com/\"\r\n" + "}";
        System.out.println(JSON_STRING);

        String TEXT_BLOCK_JSON =
                """
                {
                    "name" : "Onias",
                    "website" : "https://www.whatever.com/"
                }
                """;
        System.out.println(TEXT_BLOCK_JSON);
    }

    public static void testInstanceof(Object pessoa){
        // modo antigo
        if (pessoa instanceof Pessoa){
            Pessoa novaPessoa = (Pessoa) pessoa;
        }

        // modo novo
        if (pessoa instanceof Pessoa p){
            System.out.println(p.nome);
        }
    }

    public static void testNullPointerException(){
        int[] arr = null;
        arr[0] = 1;
    }


    public static void testSealedClasses(){
        var gerente = new Manager();
        var empregado = new Employee();

        gerente.nome="Gerente Silva";
        gerente.supervisorId = 1;

        empregado.nome ="Empregado Silva";
        empregado.employeeId = 2;

        System.out.println(gerente.toString());
        System.out.println(empregado.toString());

    }

}
