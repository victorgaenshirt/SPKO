import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Collection;
import org.stringtemplate.v4.*;
public class aufgabe6 {

    public static void main(String[] args) {
        if (args.length == 0) {
            System.exit(1);
        }

        Collection<Class<?>> classes = Arrays.asList(args).stream()
                .map(aufgabe6::loadClass)
                .toArray(Class[]::new);

        generateHTML(classes);
    }

    private static Class<?> loadClass(String className) {
        try {
            return Class.forName(className);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException("Class not found: " + className, e);
        }
    }

    private static void generateHTML(Collection<Class<?>> classes) {
        ST rootTemplate = new ST("<!DOCTYPE html>\n<html lang=\"de\">\n<head>\n<style type=\"text/css\">\nth, td { border-bottom: thin solid; padding: 4px; text-align: left; }\ntd { font-family: monospace }\n</style>\n</head>\n<body>\n<h1>Sprachkonzepte, Aufgabe 6</h1>\n<classes(classes)>\n</body>\n</html>");

        rootTemplate.add("classes", classes);
        for (Class<?> clazz : classes) {
            ST classTemplate = new ST("<classDecl(clazz)>");
            classTemplate.add("clazz", clazz);
            rootTemplate.add("classes", classTemplate);
            for (Class<?> iface : clazz.getInterfaces()) {
                ST ifaceTemplate = new ST("<interfaceDecl(iface)>");
                ifaceTemplate.add("iface", iface);
                rootTemplate.add("classes", ifaceTemplate);
            }
        }

        System.out.println(rootTemplate.render());
    }
}
