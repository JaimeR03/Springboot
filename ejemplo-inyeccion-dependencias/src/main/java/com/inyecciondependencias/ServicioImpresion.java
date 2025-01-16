package com.inyecciondependencias;

import com.inyecciondependencias.dependencias.ServicioEnvio;
import com.inyecciondependencias.dependencias.ServicioPDF;

public class ServicioImpresion {

 ServicioEnvio servicioEnvio;
 ServicioPDF servicioPDF;

    public ServicioImpresion(ServicioEnvio servicioEnvio, ServicioPDF servicioPDF) {
        this.servicioEnvio = new ServicioEnvio();
        this.servicioPDF = new ServicioPDF();
    }

    public void imprimir(){
  servicioEnvio.enviodedomuento();
  servicioPDF.imprimirPDF();

    }
}
