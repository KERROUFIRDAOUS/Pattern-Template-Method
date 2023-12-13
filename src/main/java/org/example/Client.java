package org.example;

import org.example.mt.TemplateClass;
import org.example.mt.TemplateImpl1;
import org.example.mt.TemplateImpl2;

public class Client {
    public static void main(String[] args) {
        TemplateClass templateClass = new TemplateImpl1();
        System.out.println(templateClass.templateMethod());
        TemplateClass templateClass2 = new TemplateImpl2();
        System.out.println(templateClass2.templateMethod());
    }
}