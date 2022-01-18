package ma.education.tp2.reflection;

import ma.education.tp1.introduction.Salle;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.concurrent.Callable;

public class TestReflection {
    public static void main(String[] args) throws IllegalAccessException, InvocationTargetException, InstantiationException, ClassNotFoundException {
        Class s = Class.forName("ma.education.tp1.introduction.Salle");
        Field[] fields = s.getDeclaredFields();
        for (Field f : fields) {

            System.out.println(f.getName());
        }
        System.out.println("Les méthodes");
        Method[] methods = s.getDeclaredMethods();
        for (Method m : methods) {
            System.out.println(m.getName());
        }

        System.out.println("Les constructeurs");
        Constructor[] constructors = s.getDeclaredConstructors();

        Salle o1 = (Salle) constructors[0].newInstance();
        Salle o2 = (Salle) constructors[1].newInstance("Salle Informatique");
        Salle o3 = (Salle) constructors[2].newInstance(2, "Salle Cours");

        System.out.println(o1.id + " " + o1.nom);
        System.out.println(o2.id + " " + o2.nom);
        System.out.println(o3.id + " " + o3.nom);

        System.out.println(o2.equals(o3));

    }

}


