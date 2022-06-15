package br.com.roberto.codigoruim.refatoracaocomplexidadeciclomatica;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.math.BigInteger;
import java.util.*;

import static java.lang.reflect.Modifier.isFinal;
import static java.lang.reflect.Modifier.isStatic;

//Necessidade:
//  A partir de uma classe qualquer retorne a quantidade de constantes(final static) inteiras*
//presentes nessa classe incluindo as constantes herdadas das superclasses.
//Inteiros: Integer, int, Long, long, Short, short, Byte, byte e BigInteger
//Se a classe é nula, Enum ou abstrata deve ser retornado -1
public class ContadorRefatoracao2 {

    private static final Set<Class<?>> INTEIROS = new HashSet<>();
    static {
        INTEIROS.add(Integer.class);
        INTEIROS.add(int.class);
        INTEIROS.add(Long.class);
        INTEIROS.add(long.class);
        INTEIROS.add(Short.class);
        INTEIROS.add(short.class);
        INTEIROS.add(Byte.class);
        INTEIROS.add(byte.class);
        INTEIROS.add(BigInteger.class);
    }

    public int contar(Class<?> clazz) {

        if (!isClasseParaContagem(clazz)) return -1;
        List<Field> fields = getCamposDaClasse(clazz);

        int count = 0;

        for (Field field : fields) {
            if (isConstantesInteiras(field)) {
                count++;
            }
        }
        return count;
    }

    private boolean isConstantesInteiras(Field field) {
        Class<?> fieldType = field.getType();
        return isStatic(field.getModifiers()) && isFinal(field.getModifiers()) &&
                INTEIROS.contains(fieldType);
    }

    private List<Field> getCamposDaClasse(Class<?> clazz) {
        List<Field> fields = new ArrayList<>(Arrays.asList(clazz.getDeclaredFields()));
        Class<?> superClass = clazz.getSuperclass();
        if (superClass != null && !superClass.equals(Object.class)) {
            fields.addAll(getCamposDaClasse(superClass));
        }
        return fields;
    }

    private boolean isClasseParaContagem(Class<?> c) {
        return c != null && !c.isEnum() && !Modifier.isAbstract(c.getModifiers());
    }
}
