package br.com.roberto.codigoruim.refatoracaocomplexidadeciclomatica;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static java.lang.reflect.Modifier.isFinal;
import static java.lang.reflect.Modifier.isStatic;

//Necessidade:
//  A partir de uma classe qualquer retorne a quantidade de constantes(final static) inteiras*
//presentes nessa classe incluindo as constantes herdadas das superclasses.
//Inteiros: Integer, int, Long, long, Short, short, Byte, byte e BigInteger
//Se a classe é nula, Enum ou abstrata deve ser retornado -1
public class ContadorRefatoracao1 {

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
                (fieldType.equals(Integer.class) || fieldType.equals(int.class)
                        || fieldType.equals(Long.class) || fieldType.equals(long.class)
                        || fieldType.equals(Short.class) || fieldType.equals(short.class)
                        || fieldType.equals(Byte.class) || fieldType.equals(byte.class)
                        || fieldType.equals(BigInteger.class));
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
