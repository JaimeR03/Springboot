package com.inyecciondependencias;


import com.inyecciondependencias.dependencias.ServicioEnvio;
import com.inyecciondependencias.dependencias.ServicioPDF;

public class Main {
    public static void main(String[] args) {

       ServicioImpresion servicioImpresion = new ServicioImpresion(new ServicioEnvio(),new ServicioPDF());
       servicioImpresion.imprimir();
    }
}