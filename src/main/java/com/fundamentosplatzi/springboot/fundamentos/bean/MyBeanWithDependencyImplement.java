package com.fundamentosplatzi.springboot.fundamentos.bean;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class MyBeanWithDependencyImplement implements MyBeanWithDependency {

    private MyOperation myOperation;

    public MyBeanWithDependencyImplement(MyOperation myOperation) {
        this.myOperation = myOperation;
    }

    @Override
    public void printWithDependency() {
        log.info("Hemos ingresado al metodo printWithDependency");
        int numero=1;
        log.debug("El numero enviado como parametro a la dependencia operacion es: " + numero);
        System.out.println(myOperation.sum(numero));
        System.out.println("Hola desde la implementacion de un bean con dependencia");
    }
}
